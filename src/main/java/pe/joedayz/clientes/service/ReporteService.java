package pe.joedayz.clientes.service;


import java.io.IOException;
import java.sql.SQLException;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import pe.joedayz.clientes.entity.Cliente;
import pe.joedayz.clientes.repository.ReporteRepository;
import pe.joedayz.clientes.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReporteService {

	@Autowired
	private ReporteRepository userDao;

	@Autowired
	private ClienteRepository clienteRepository;

	public JasperPrint exportPdfFile(Integer id) throws SQLException, JRException, IOException {
		Cliente cliente = clienteRepository.findOne(id);
		return userDao.exportPdfFile(cliente);
	}
}