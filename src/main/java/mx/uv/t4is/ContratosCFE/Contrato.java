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

    private String nombre;
    private String domicilio;
    private int telefono;
    private int nContrato;
    private int pago;
    private String firmaE;

    public Contrato() {

    }

    public String getNombre(){
        return nombre;

    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio){
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getNContrato() {
        return nContrato;
    }

    public void setNContrato(int nContrato){
        this.nContrato = nContrato;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago){
        this.pago = pago;
    }

    public String getFirmaE() {
        return firmaE;
    }

    public void setFirmaE(String firmaE){
        this.firmaE = firmaE;
    }

}