package pe.joedayz.clientes.web.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import pe.joedayz.clientes.dto.MenuItem;
import pe.joedayz.clientes.entity.Usuario;
import pe.joedayz.clientes.repository.MenuRepository;
import pe.joedayz.clientes.repository.ClienteRepository;
import pe.joedayz.clientes.service.ReporteService;
import pe.joedayz.clientes.util.MediaTypeUtils;
import pe.joedayz.clientes.util.Util;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ReportesController {

	@Autowired
	private MenuRepository menuRepository;

	@Autowired
	private ReporteService userService;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private Util util;

	@Autowired
	private ServletContext servletContext;

	@GetMapping("/reportes/export")
	public void export(@RequestParam(value = "id", required = false) Integer id,
			ModelAndView model,
			HttpServletResponse response) throws IOException, JRException, SQLException {

		String fileName = MediaTypeUtils.getReportName();
		JasperPrint jasperPrint = null;

		// Content-Type
		// application/pdf
		MediaType mediaType = MediaTypeUtils.getMediaTypeForFileName(this.servletContext, fileName);
		response.setContentType(mediaType.getType());

		// Content-Disposition
		response.setHeader(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + fileName);

		OutputStream out = response.getOutputStream();
		jasperPrint = userService.exportPdfFile(id);
		JasperExportManager.exportReportToPdfStream(jasperPrint, out);

	}



	@GetMapping("/reportes/list")
	public ModelMap getAll(@PageableDefault(size = 10) Pageable pageable,
			@RequestParam(name = "value", required = false) String value, Model model) {

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("username", ((Usuario)principal).getCodUsuario());

		if (value != null) {
			model.addAttribute("key", value);

			return new ModelMap().addAttribute("clientes", clienteRepository.findByCodSocioContainingOrNomCompletoContainingOrRazonSocialContainingAllIgnoreCase(value,
					value, value, pageable));
		}
		else {
			return new ModelMap().addAttribute("clientes", clienteRepository.findAll(pageable));
		}
	}

	@RequestMapping("/reportes/error")
	public String returnViewName() throws Exception {
		throw new Exception();
	}

	@ModelAttribute("menuItemsList")
	public List<MenuItem> menues() {
		return util.agruparMenus(menuRepository.getMenues());
	}


}
