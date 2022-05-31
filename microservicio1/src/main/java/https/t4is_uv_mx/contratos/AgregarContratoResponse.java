//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.31 a las 04:31:25 PM CDT 
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
 *         &lt;element name="contrato"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nContrato" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="domicilio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="firmae" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "contrato"
})
@XmlRootElement(name = "AgregarContratoResponse")
public class AgregarContratoResponse {

    @XmlElement(required = true)
    protected AgregarContratoResponse.Contrato contrato;

    /**
     * Obtiene el valor de la propiedad contrato.
     * 
     * @return
     *     possible object is
     *     {@link AgregarContratoResponse.Contrato }
     *     
     */
    public AgregarContratoResponse.Contrato getContrato() {
        return contrato;
    }

    /**
     * Define el valor de la propiedad contrato.
     * 
     * @param value
     *     allowed object is
     *     {@link AgregarContratoResponse.Contrato }
     *     
     */
    public void setContrato(AgregarContratoResponse.Contrato value) {
        this.contrato = value;
    }


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
     *         &lt;element name="nContrato" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="domicilio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="firmae" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="curp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "nContrato",
        "nombre",
        "domicilio",
        "telefono",
        "firmae",
        "curp"
    })
    public static class Contrato {

        protected int nContrato;
        @XmlElement(required = true)
        protected String nombre;
        @XmlElement(required = true)
        protected String domicilio;
        @XmlElement(required = true)
        protected String telefono;
        @XmlElement(required = true)
        protected String firmae;
        @XmlElement(required = true)
        protected String curp;

        /**
         * Obtiene el valor de la propiedad nContrato.
         * 
         */
        public int getNContrato() {
            return nContrato;
        }

        /**
         * Define el valor de la propiedad nContrato.
         * 
         */
        public void setNContrato(int value) {
            this.nContrato = value;
        }

        /**
         * Obtiene el valor de la propiedad nombre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombre() {
            return nombre;
        }

        /**
         * Define el valor de la propiedad nombre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombre(String value) {
            this.nombre = value;
        }

        /**
         * Obtiene el valor de la propiedad domicilio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomicilio() {
            return domicilio;
        }

        /**
         * Define el valor de la propiedad domicilio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomicilio(String value) {
            this.domicilio = value;
        }

        /**
         * Obtiene el valor de la propiedad telefono.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTelefono() {
            return telefono;
        }

        /**
         * Define el valor de la propiedad telefono.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTelefono(String value) {
            this.telefono = value;
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

        /**
         * Obtiene el valor de la propiedad curp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurp() {
            return curp;
        }

        /**
         * Define el valor de la propiedad curp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurp(String value) {
            this.curp = value;
        }

    }

}
