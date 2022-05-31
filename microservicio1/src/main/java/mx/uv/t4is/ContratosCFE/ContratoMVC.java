package mx.uv.t4is.ContratosCFE;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ContratoMVC {

    @GetMapping("/")
    public String bienvenido(Model modelo){
		modelo.addAttribute("Thnombre","");
		return "home";        
    }

}
