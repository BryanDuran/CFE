package mx.uv.t4is.ContratosCFE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import https.t4is_uv_mx.contratos.AgregarContratoRequest;
import https.t4is_uv_mx.contratos.AgregarContratoResponse;
import https.t4is_uv_mx.contratos.CancelarServicioRequest;
import https.t4is_uv_mx.contratos.CancelarServicioResponse;
import https.t4is_uv_mx.contratos.ConsultarContratoRequest;
import https.t4is_uv_mx.contratos.ConsultarContratoResponse;
import https.t4is_uv_mx.contratos.ModificarServicioRequest;
import https.t4is_uv_mx.contratos.ModificarServicioResponse;
import https.t4is_uv_mx.contratos.MostrarContratosResponse;

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

         if(contrato.validacion(peticion.getNombre(), peticion.getDomicilio(), peticion.getTelefono(), peticion.getFirmae()) == true){
            respuesta.setRespuesta("Ha ocurrido un error al crear el contrato, por favor vuelve a intentarlo. Al parecer olvidaste un dato.") ;
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
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos", localPart = "ConsultarContratoRequest")
    @ResponsePayload    
    public ConsultarContratoResponse consultarContrato(@RequestPayload ConsultarContratoRequest peticion){

        ConsultarContratoResponse respuesta = new ConsultarContratoResponse();
        String ncontrato = Integer.toString(peticion.getNcontrato());

/*         if (ncontrato.isEmpty() || peticion.getFirmae().isEmpty()) {
            respuesta.setRespuesta("No hemos encontrado tus datos, por favor vuelve a intentarlo.") ;
        }else{ */

            Iterable<Contrato> lista = icontratos.findByNcontratoAndFirmae(peticion.getNcontrato(),peticion.getFirmae());
            for(Contrato cont : lista){
                ConsultarContratoResponse.Contratos c = new ConsultarContratoResponse.Contratos();
                c.setNcontrato(cont.getNcontrato());
                c.setNombre(cont.getNombre());
                c.setDomicilio(cont.getDomicilio());
                c.setTelefono(cont.getTelefono());                
                respuesta.getContratos().add(c);
            }

        //}

        return respuesta;

    }

    //CANCELAR SERVICIO
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos", localPart = "CancelarServicioRequest")
    @ResponsePayload
    public CancelarServicioResponse eliminarContrato(@RequestPayload CancelarServicioRequest peticion){
        CancelarServicioResponse respuesta = new CancelarServicioResponse();

        String ncontrato = Integer.toString(peticion.getNcontrato());

        if (ncontrato.isEmpty() || peticion.getFirmae().isEmpty()) {
            respuesta.setRespuesta("Ha ocurrido un error al cancelar el servicio, por favor vuelve a intentarlo.") ;
        }else{
            Iterable<Contrato> lista = icontratos.findByNcontratoAndFirmae(peticion.getNcontrato(),peticion.getFirmae());
            for(Contrato cont : lista){
                //CancelarServicioResponse res = new CancelarServicioResponse();
                CancelarServicioRequest res = new CancelarServicioRequest();
                res.setNcontrato(cont.getNcontrato());
                res.setFirmae(cont.getFirmae());
                icontratos.deleteById(cont.getNcontrato());
                respuesta.setRespuesta("Has cancelado con éxito tu servicio. Adios.");
            }
        
        }

        return respuesta;
    }

    //MODIFICAR CONTRATO
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos",localPart = "ModificarServicioRequest")
    @ResponsePayload
    public ModificarServicioResponse modificarContrato(@RequestPayload ModificarServicioRequest peticion){

        ModificarServicioResponse respuesta = new ModificarServicioResponse();

        String ncontrato = Integer.toString(peticion.getNcontrato());

        if (ncontrato.isEmpty() || peticion.getFirmae().isEmpty()) {
            respuesta.setRespuesta("Ha ocurrido un error al cancelar el servicio, por favor vuelve a intentarlo.") ;
        }else{

            Contrato contrato = new Contrato();
            contrato.setNcontrato(peticion.getNcontrato());
            contrato.setFirmae(peticion.getFirmae());
            contrato.setNombre(peticion.getNombre());
            contrato.setDomicilio(peticion.getDomicilio());
            contrato.setTelefono(peticion.getTelefono());
            contrato.setFirmae(peticion.getFirmae());
            icontratos.save(contrato);
            respuesta.setRespuesta("Tus datos han sido modificados exitosamente.");

        }

        return respuesta;

    }

    //CONSULTAR TODOS LOS CONTRATSO
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos",localPart = "MostrarContratosRequest")
    @ResponsePayload
    public MostrarContratosResponse MostrarTareas(){
        MostrarContratosResponse respuesta = new MostrarContratosResponse();
        Iterable<Contrato> lista = icontratos.findAll();
        
        for (Contrato cont : lista) {
            MostrarContratosResponse.Contratos e = new MostrarContratosResponse.Contratos();
            e.setNombre(cont.getNombre());
            e.setNcontrato(cont.getNcontrato());
            e.setFirmae(cont.getFirmae());
            respuesta.getContratos().add(e);
        }
        return respuesta;
    }

}