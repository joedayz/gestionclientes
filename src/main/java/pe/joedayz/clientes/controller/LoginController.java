package pe.joedayz.clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : JoeDayz
 * @since : 13/03/20
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }
	// Login form with error
	@RequestMapping("/login-error")
	public String loginError(Model model) {
		model.addAttribute("errors", true);
		return "login";
	}
}
