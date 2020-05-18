package pe.joedayz.clientes.web.controller;

import java.util.List;

import pe.joedayz.clientes.dto.MenuItem;
import pe.joedayz.clientes.entity.Usuario;
import pe.joedayz.clientes.repository.MenuRepository;
import pe.joedayz.clientes.util.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @author : JoeDayz
 * @since : 13/03/20
 */
@Controller

public class HomeController {


	@Autowired
	private MenuRepository menuRepository;

	@Autowired
	private Util util;

    @GetMapping("/")
    public String homePage(ModelMap model){
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		model.addAttribute("username", ((Usuario)principal).getCodUsuario());
		return "home";
    }

	@ModelAttribute("menuItemsList")
	public List<MenuItem> menues() {
		return util.agruparMenus(menuRepository.getMenues());
	}


}
