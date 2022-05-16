package mx.uv.t4is.ContratosCFE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.contratos.AgregarContratoRequest;
import https.t4is_uv_mx.contratos.AgregarContratoResponse;

@Endpoint
public class ContratosEndPoint {

    @Autowired
    private Icontratos icontratos;
     
    //AGREGAR CONTRATO
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos", localPart = "AgregarContratoRequest")    
    @ResponsePayload
    public AgregarContratoResponse agregarContrato(@RequestPayload AgregarContratoRequest peticion) {

        AgregarContratoResponse respuesta = new AgregarContratoResponse();

        Contrato contrato = new Contrato();
        //String tel = Integer.toString(peticion.getTelefono());  
/*         contrato.setNombre(peticion.getNombre());
        contrato.setDomicilio(peticion.getDomicilio());
        contrato.setTelefono(peticion.getTelefono());
        contrato.setFirmae(peticion.getFirmae()); */

        //icontratos.save(contrato);
        //respuesta.setRespuesta("Contrado Creado con los datos: "+ peticion.getNombre()) ;
        //if(contrato.c)
        //icontratos.save(contrato);
         if(contrato.validacion(peticion.getNombre(), peticion.getDomicilio(), peticion.getTelefono(), peticion.getFirmae()) == true){
            respuesta.setRespuesta("Ha ocurrido un error al crear el contrato, por favor vuelve a intentarlo.") ;
        }else{
            contrato.setNombre(peticion.getNombre());
            contrato.setDomicilio(peticion.getDomicilio());
            contrato.setTelefono(peticion.getTelefono());
            contrato.setFirmae(peticion.getFirmae());
            icontratos.save(contrato);
            respuesta.setRespuesta("Contrado Creado con los datos: "+ peticion.getNombre()) ;
        }

        return respuesta;
    }

    //CONSULTAR CONTRATO

    
}