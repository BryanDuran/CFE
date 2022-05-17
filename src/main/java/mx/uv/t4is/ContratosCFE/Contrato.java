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
    private int telefono;
    private int pago;
    private String firmae;

    public Contrato() {

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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
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

    public boolean validacion(String nombre,String domicilio,int telefono,String firmae){

        boolean esvalido = false;
        String tel = Integer.toString(telefono);

        if(nombre.isEmpty() || domicilio.isEmpty() || tel.isEmpty() || firmae.isEmpty()){
            esvalido = true;
        }else{
            esvalido = false;
        }

        return esvalido;
    }


}