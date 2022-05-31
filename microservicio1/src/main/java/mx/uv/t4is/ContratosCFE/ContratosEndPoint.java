package mx.uv.t4is.ContratosCFE;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
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

    // AGREGAR CONTRATO
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos", localPart = "AgregarContratoRequest")
    @ResponsePayload
    public AgregarContratoResponse agregarContrato(@RequestPayload AgregarContratoRequest peticion) {

        AgregarContratoResponse respuesta = new AgregarContratoResponse();

        Contrato contrato = new Contrato();

        if (contrato.validacion(peticion.getNombre(), peticion.getDomicilio(), peticion.getTelefono()) == true) {
            respuesta.setContrato(null);
        } else {
            contrato.setNombre(peticion.getNombre());
            contrato.setDomicilio(peticion.getDomicilio());
            contrato.setTelefono(String.valueOf(peticion.getTelefono()));
            contrato.setCurp(peticion.getCurp());
            // contrato.setFirmae(peticion.getFirmae());
            Contrato contratoGuardado = icontratos.save(contrato);

            //
            RestTemplate restTemplate = new RestTemplate();
            //String url = "https://microservicio-firma.herokuapp.com/firmar";
            String url = "https://t4is.herokuapp.com/firmas/firmar";
            ResponseEntity<Contrato> contratoRespuesta = restTemplate.postForEntity(url, contratoGuardado,
                    Contrato.class);
            String firmae = contratoRespuesta.getBody().getFirmae();
            contrato.setFirmae(firmae);
            AgregarContratoResponse.Contrato contratoResponse = new AgregarContratoResponse.Contrato();

            contratoResponse.setNombre(contratoGuardado.getNombre());
            contratoResponse.setDomicilio(contratoGuardado.getDomicilio());
            contratoResponse.setTelefono(contratoGuardado.getTelefono());
            contratoResponse.setNContrato(contratoGuardado.getNcontrato());
            contratoResponse.setCurp(peticion.getCurp());

            contratoResponse.setFirmae(firmae);
            //
            respuesta.setContrato(contratoResponse);
        }

        return respuesta;
    }

    // CONSULTAR CONTRATO
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos", localPart = "ConsultarContratoRequest")
    @ResponsePayload
    public ConsultarContratoResponse consultarContrato(@RequestPayload ConsultarContratoRequest peticion) {

        ConsultarContratoResponse respuesta = new ConsultarContratoResponse();
        String ncontrato = Integer.toString(peticion.getNcontrato());

        //Iterable<Contrato> lista = icontratos.findByNcontratoAndFirmae(peticion.getNcontrato(), peticion.getFirmae());
        Iterable<Contrato> lista = icontratos.findByNcontrato(peticion.getNcontrato());
        for (Contrato cont : lista) {
            ConsultarContratoResponse.Contratos c = new ConsultarContratoResponse.Contratos();
            c.setNcontrato(cont.getNcontrato());
            c.setNombre(cont.getNombre());
            c.setDomicilio(cont.getDomicilio());
            c.setTelefono(Integer.parseInt(cont.getTelefono()));
            respuesta.getContratos().add(c);

        }

        return respuesta;

    }

    // CANCELAR SERVICIO
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos", localPart = "CancelarServicioRequest")
    @ResponsePayload
    public CancelarServicioResponse eliminarContrato(@RequestPayload CancelarServicioRequest peticion) {

        CancelarServicioRequest.Contrato contratoABorrar = peticion.getContrato();
        CancelarServicioResponse respuesta = new CancelarServicioResponse();

        // Se realiza la consulta a la api para obtener la validez del contrato
        RestTemplate restTemplate = new RestTemplate();
        //String url = "https://microservicio-firma.herokuapp.com/validar";
        String url = "https://t4is.herokuapp.com/firmas/validar";
        ResponseEntity<Boolean> esValidoRespuesta = restTemplate.postForEntity(url, contratoABorrar, Boolean.class);
        boolean esValido = esValidoRespuesta.getBody();

        //
        if (!esValido) {
            respuesta.setRespuesta("No se ha logrado validar su contrato.");
            return respuesta;
        }

        int ncontrato = contratoABorrar.getNcontrato();


        icontratos.deleteById(ncontrato);

        respuesta.setRespuesta("Has cancelado con éxito tu servicio. Adios.");

        return respuesta;
    }

    // MODIFICAR CONTRATO
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos", localPart = "ModificarServicioRequest")
    @ResponsePayload
    public ModificarServicioResponse modificarContrato(@RequestPayload ModificarServicioRequest peticion) {

        ModificarServicioResponse respuesta = new ModificarServicioResponse();

        ModificarServicioRequest.ContratoAModificar contratoAModificar = peticion.getContratoAModificar();
        ModificarServicioRequest.ContratoNuevo contratoNuevo = peticion.getContratoNuevo();

        // Se realiza la consulta a la api para obtener la validez del contrato
        RestTemplate restTemplate = new RestTemplate();
        //String url = "https://microservicio-firma.herokuapp.com/validar";
        String url = "https://t4is.herokuapp.com/firmas/validar";
        ResponseEntity<Boolean> esValidoRespuesta = restTemplate.postForEntity(url, contratoAModificar, Boolean.class);
        boolean esValido = esValidoRespuesta.getBody();

        // Si no es válido se retorna nulo
        if (!esValido) {
            respuesta.setContrato(null);
            return respuesta;
        }

        // Se actualizan los campos que se van a cambiar
        contratoAModificar.setNombre(contratoNuevo.getNombre());
        contratoAModificar.setDomicilio(contratoNuevo.getDomicilio());
        contratoAModificar.setTelefono(contratoNuevo.getTelefono());
        contratoAModificar.setFirmae(null);

        //Se firma el contrato actualizado
        RestTemplate restTemplate2 = new RestTemplate();
        //String url2 = "https://microservicio-firma.herokuapp.com/firmar";
        String url2 = "https://t4is.herokuapp.com/firmas/firmar";
        ResponseEntity<Contrato> contratoRespuesta = restTemplate2.postForEntity(url2, contratoAModificar,
                Contrato.class);
        String firmae = contratoRespuesta.getBody().getFirmae();
        contratoAModificar.setFirmae(firmae);

        // Se crea un contrato para guardarlo
        Contrato contrato = new Contrato();
        contrato.setNcontrato(contratoAModificar.getNcontrato());
        contrato.setFirmae(contratoAModificar.getFirmae());
        contrato.setNombre(contratoAModificar.getNombre());
        contrato.setDomicilio(contratoAModificar.getDomicilio());
        contrato.setTelefono(contratoAModificar.getTelefono());
        contrato.setFirmae(contratoAModificar.getFirmae());
        icontratos.save(contrato);
        
        // Se crea el contrato de respuesta
        ModificarServicioResponse.Contrato respuestaPayload = new ModificarServicioResponse.Contrato();
        respuestaPayload.setCurp(contratoAModificar.getCurp());
        respuestaPayload.setDomicilio(contratoAModificar.getDomicilio());
        respuestaPayload.setFirmae(contratoAModificar.getFirmae());
        respuestaPayload.setNContrato(contratoAModificar.getNcontrato());
        respuestaPayload.setNombre(contratoAModificar.getNombre());
        respuestaPayload.setTelefono(contratoAModificar.getTelefono());
        
        respuesta.setContrato(respuestaPayload);
        
        return respuesta;

    }

    // CONSULTAR TODOS LOS CONTRATOS
    @PayloadRoot(namespace = "https://t4is.uv.mx/contratos", localPart = "MostrarContratosRequest")
    @ResponsePayload
    public MostrarContratosResponse MostrarTareas() {
        MostrarContratosResponse respuesta = new MostrarContratosResponse();
        Iterable<Contrato> lista = icontratos.findAll();

        for (Contrato cont : lista) {
            MostrarContratosResponse.Contratos e = new MostrarContratosResponse.Contratos();
            e.setNombre(cont.getNombre());
            e.setNcontrato(cont.getNcontrato());
            e.setFirmae(cont.getFirmae());
            e.setCurp(cont.getCurp());
            respuesta.getContratos().add(e);
        }
        return respuesta;
    }

}