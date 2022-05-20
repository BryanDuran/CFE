package mx.uv.PagoRest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagoControlador {
    PagoDao pago = new PagoDao();

    // Añadir pago
    // http://localhost:8080/agregar?monto=1000&fecha=12/12/12&contrato=2
    //@GetMapping("/agregar")
    @RequestMapping("/agregar")
    public boolean agregar(@RequestParam(name="monto") String monto, @RequestParam(name="fecha") String fecha, @RequestParam(name="contrato") String contrato){
        boolean result = pago.agregarPago(monto, fecha, contrato);
        return result;
    }

    //LISTA DE SALUDOS
    //http://localhost:8080/lista?contrato=1
    @GetMapping("/lista")
    public ArrayList<Pago> lista(@RequestParam(name="contrato") String contrato){
        return pago.historialPagos(contrato);
    }
}
