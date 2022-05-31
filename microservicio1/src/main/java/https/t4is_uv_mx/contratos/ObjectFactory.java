//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.30 a las 09:15:25 PM CDT 
//


package https.t4is_uv_mx.contratos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the https.t4is_uv_mx.contratos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MostrarContratosRequest_QNAME = new QName("https://t4is.uv.mx/contratos", "MostrarContratosRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: https.t4is_uv_mx.contratos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AgregarContratoResponse }
     * 
     */
    public AgregarContratoResponse createAgregarContratoResponse() {
        return new AgregarContratoResponse();
    }

    /**
     * Create an instance of {@link ConsultarContratoResponse }
     * 
     */
    public ConsultarContratoResponse createConsultarContratoResponse() {
        return new ConsultarContratoResponse();
    }

    /**
     * Create an instance of {@link CancelarServicioRequest }
     * 
     */
    public CancelarServicioRequest createCancelarServicioRequest() {
        return new CancelarServicioRequest();
    }

    /**
     * Create an instance of {@link ModificarServicioRequest }
     * 
     */
    public ModificarServicioRequest createModificarServicioRequest() {
        return new ModificarServicioRequest();
    }

    /**
     * Create an instance of {@link ModificarServicioResponse }
     * 
     */
    public ModificarServicioResponse createModificarServicioResponse() {
        return new ModificarServicioResponse();
    }

    /**
     * Create an instance of {@link MostrarContratosResponse }
     * 
     */
    public MostrarContratosResponse createMostrarContratosResponse() {
        return new MostrarContratosResponse();
    }

    /**
     * Create an instance of {@link AgregarContratoRequest }
     * 
     */
    public AgregarContratoRequest createAgregarContratoRequest() {
        return new AgregarContratoRequest();
    }

    /**
     * Create an instance of {@link AgregarContratoResponse.Contrato }
     * 
     */
    public AgregarContratoResponse.Contrato createAgregarContratoResponseContrato() {
        return new AgregarContratoResponse.Contrato();
    }

    /**
     * Create an instance of {@link ConsultarContratoRequest }
     * 
     */
    public ConsultarContratoRequest createConsultarContratoRequest() {
        return new ConsultarContratoRequest();
    }

    /**
     * Create an instance of {@link ConsultarContratoResponse.Contratos }
     * 
     */
    public ConsultarContratoResponse.Contratos createConsultarContratoResponseContratos() {
        return new ConsultarContratoResponse.Contratos();
    }

    /**
     * Create an instance of {@link CancelarServicioRequest.Contrato }
     * 
     */
    public CancelarServicioRequest.Contrato createCancelarServicioRequestContrato() {
        return new CancelarServicioRequest.Contrato();
    }

    /**
     * Create an instance of {@link CancelarServicioResponse }
     * 
     */
    public CancelarServicioResponse createCancelarServicioResponse() {
        return new CancelarServicioResponse();
    }

    /**
     * Create an instance of {@link ModificarServicioRequest.ContratoAModificar }
     * 
     */
    public ModificarServicioRequest.ContratoAModificar createModificarServicioRequestContratoAModificar() {
        return new ModificarServicioRequest.ContratoAModificar();
    }

    /**
     * Create an instance of {@link ModificarServicioRequest.ContratoNuevo }
     * 
     */
    public ModificarServicioRequest.ContratoNuevo createModificarServicioRequestContratoNuevo() {
        return new ModificarServicioRequest.ContratoNuevo();
    }

    /**
     * Create an instance of {@link ModificarServicioResponse.Contrato }
     * 
     */
    public ModificarServicioResponse.Contrato createModificarServicioResponseContrato() {
        return new ModificarServicioResponse.Contrato();
    }

    /**
     * Create an instance of {@link MostrarContratosResponse.Contratos }
     * 
     */
    public MostrarContratosResponse.Contratos createMostrarContratosResponseContratos() {
        return new MostrarContratosResponse.Contratos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "https://t4is.uv.mx/contratos", name = "MostrarContratosRequest")
    public JAXBElement<Object> createMostrarContratosRequest(Object value) {
        return new JAXBElement<Object>(_MostrarContratosRequest_QNAME, Object.class, null, value);
    }

}
