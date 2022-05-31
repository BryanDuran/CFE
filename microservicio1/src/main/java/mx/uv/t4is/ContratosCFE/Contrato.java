package mx.uv.t4is.ContratosCFE;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//nombre,domicilio,telefono,nContrato,pago,firmaE
@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ncontrato;

    private String nombre;
    private String domicilio;
    private String telefono;
    private int pago;
    private String firmae;
    private String curp;

    public Contrato() {

    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getNcontrato() {
        return ncontrato;
    }

    public void setNcontrato(int ncontrato) {
        this.ncontrato = ncontrato;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }

    public String getFirmae() {
        return firmae;
    }

    public void setFirmae(String firmae) {
        this.firmae = firmae;
    }

    public boolean validacion(String nombre,String domicilio,String telefono){

        boolean esvalido = false;
        String tel = telefono;

        if(nombre.isEmpty() || domicilio.isEmpty() || tel.isEmpty()){
            esvalido = true;
        }else{
            esvalido = false;
        }

        return esvalido;
    }


}