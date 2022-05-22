package mx.uv.FirmaRest;

public class Firma {
    private int idFirma;
    private int nContrato;
    private String firma;

    public Firma(){ }

    public int getIdFirma(){
        return idFirma;
    }

    public void setIdFirma(int idFirma){
        this.idFirma = idFirma;
    }


    public String getFirma(){
        return firma;
    }
    public void setFirma(String firma){
        this.firma = firma;
    }

    public int getNContrato(){
        return nContrato;
    }

    public void setNContrato(int nContrato){
        this.nContrato = nContrato;
    }

}
