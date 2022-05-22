package mx.uv.FirmaRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirmaControlador {
    FirmaDao firmas = new FirmaDao();

    // Añadir firma
    // http://localhost:8080/agregar?firma=12/12/12&contrato=2
    @GetMapping("/generar")
    public String generar(){
        String result = firmas.generarFirma();
        return result;
    }

    
}
