package mx.uv.PagoRest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class PagoMVC {

    @GetMapping("/")
    public String bienvenido(Model modelo){
		modelo.addAttribute("Thnombre","");
		return "home";        
    }
}
