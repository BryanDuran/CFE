package uv.mx.FirmaRest;

import java.security.Key;

public class Contrato {
    private int ncontrato;
    private String nombre;
    private String domicilio;
    private String telefono;
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
    
    public String getFirmae() {
        return firmae;
    }

    public void setFirmae(String firmae) {
        this.firmae = firmae;
    }

    public boolean validacion(String nombre, String domicilio, int telefono) {

        boolean esvalido = false;
        String tel = Integer.toString(telefono);

        if (nombre.isEmpty() || domicilio.isEmpty() || tel.isEmpty()) {
            esvalido = true;
        } else {
            esvalido = false;
        }

        return esvalido;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Contrato)) {
            return false;
        }
        Contrato c = (Contrato) o;
        boolean result = c.getNcontrato() == this.getNcontrato() && c.getNombre().equals(this.getNombre())
                && c.getTelefono().equals(this.getTelefono())
                && c.getDomicilio().equals(this.getDomicilio()) && c.getCurp().equals(this.getCurp());

        return result;
    }

}