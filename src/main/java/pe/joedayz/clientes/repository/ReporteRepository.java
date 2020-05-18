package pe.joedayz.clientes.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import pe.joedayz.clientes.entity.Cliente;
import pe.joedayz.clientes.web.controller.enums.EnumTipoPersona;


@Transactional
@Repository
public class ReporteRepository {

	@Autowired
	@Qualifier("jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ResourceLoader resourceLoader;
	
	@Value("${reporte.ruta}")
	private String rutaReporte;

	public JasperPrint exportPdfFile(Cliente cliente) throws SQLException, JRException, IOException {
		Connection conn = jdbcTemplate.getDataSource().getConnection();
		String path = "";

		JasperReport reporte = null;
		
		if(cliente.getTipoPersona().equals(EnumTipoPersona.JURIDICA.getValue())) {
			path = rutaReporte + "rpt_persona_juridica.jasper";
			System.out.println("Ruta del reporte " + path);
			reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
		}else {
			path = rutaReporte + "rpt_persona_natural.jasper";
			System.out.println("Ruta del reporte " + path);
			reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
		}

		// Parameters for report
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("codSocio", cliente.getCodSocio());

		JasperPrint print = JasperFillManager.fillReport(reporte, parameters, conn);

		return print;
	}
}
