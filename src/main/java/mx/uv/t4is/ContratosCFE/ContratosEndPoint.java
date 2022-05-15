package mx.uv.t4is.ContratosCFE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ContratosEndPoint {

    @Autowired
    private Icontratos icontratos;
    
    //AGREGAR CONTRATO
/*     @PayloadRoot(namespace = "https://t4is.uv.mx/contrato", localPart = "AgregarContratoRequest")
    @ResponsePayload
    public AgregarContratoResponse agregarContrato(@RequestPayload AgregarContratoRequest peticion) {
        AgregarContratoResponse respuesta = new AgregarContratoResponse();

        Contrato contrato = new Contrato();
        
        respuesta.setRespuesta(peticion.getNContrato());
        respuesta.setRespuesta(peticion.getNombre());
        respuesta.setRespuesta(peticion.getDomicilio());
        respuesta.setRespuesta(peticion.getTelefono());
        respuesta.setRespuesta(peticion.getFirmaE());

        //respuesta.setRespuesta(true);
        icontratos.save(contrato);

        return respuesta;
    } */

    
}