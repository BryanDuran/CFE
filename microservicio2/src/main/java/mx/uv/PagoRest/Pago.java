package mx.uv.PagoRest;

public class Pago {
    private int idPago;
    private int monto;
    private String fecha;
    private int nContrato;

    public Pago(){ }

    public int getIdPago(){
        return idPago;
    }

    public void setIdPago(int idPago){
        this.idPago = idPago;
    }

    public int getMonto(){
        return monto;
    }

    public void setMonto(int monto){
        this.monto = monto;
    }

    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public int getNContrato(){
        return nContrato;
    }


    public void setNContrato(int nContrato){
        this.nContrato = nContrato;
    }

}
