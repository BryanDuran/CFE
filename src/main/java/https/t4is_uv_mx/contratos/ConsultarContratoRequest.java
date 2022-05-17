//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.16 a las 11:30:33 PM CDT 
//


package https.t4is_uv_mx.contratos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ncontrato" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="firmae" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ncontrato",
    "firmae"
})
@XmlRootElement(name = "ConsultarContratoRequest")
public class ConsultarContratoRequest {

    protected int ncontrato;
    @XmlElement(required = true)
    protected String firmae;

    /**
     * Obtiene el valor de la propiedad ncontrato.
     * 
     */
    public int getNcontrato() {
        return ncontrato;
    }

    /**
     * Define el valor de la propiedad ncontrato.
     * 
     */
    public void setNcontrato(int value) {
        this.ncontrato = value;
    }

    /**
     * Obtiene el valor de la propiedad firmae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmae() {
        return firmae;
    }

    /**
     * Define el valor de la propiedad firmae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmae(String value) {
        this.firmae = value;
    }

}
