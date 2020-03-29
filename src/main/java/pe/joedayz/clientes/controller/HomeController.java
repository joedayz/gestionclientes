package pe.joedayz.clientes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : JoeDayz
 * @since : 13/03/20
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "home";
    }
}
