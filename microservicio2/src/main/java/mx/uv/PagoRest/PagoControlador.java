package mx.uv.PagoRest;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagoControlador {
    PagoDao pago = new PagoDao();
    @PostMapping("/pagos")
    public boolean agregarPago(@RequestBody Pago nuevoPago) {
        return pago.agregarPago(String.valueOf(nuevoPago.getMonto()), nuevoPago.getFecha(), String.valueOf(nuevoPago.getNContrato()));
    }
    @GetMapping("/pagos/contrato/{ncontrato}")
    public ArrayList<Pago> lista(@PathVariable String ncontrato){
        return pago.historialPagos(ncontrato);
        // return pago.getTodo();
    }
}
