package mx.uv.PagoRest;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class PagoDao {
    Connection con;
    
    public PagoDao() {
        try {
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contratos","root","");
             con = DriverManager.getConnection("jdbc:mysql://uyh7dhyd1rhcfjyl:rzJW8GHa5dPykl9M5brf@bfqv9e6sevw1ay9awkdv-mysql.services.clever-cloud.com:3306/bfqv9e6sevw1ay9awkdv","uyh7dhyd1rhcfjyl","rzJW8GHa5dPykl9M5brf");
            //con = DriverManager.getConnection("jdbc:mysql://admin:admin@localhost:3306/mydb","admin","admin");
            System.out.println("CONEXIÓN HECHA"); 
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
    }

    public boolean agregarPago(String monto, String fecha, String nContrato) {
        try {
            Statement stmt = con.createStatement();
            String sql = "INSERT INTO pagos (monto, fecha, ncontrato) VALUES (" + 
            "'" + monto + "'" + "," +
            "'" + fecha + "'" + "," +
            "'" + nContrato + "'" + ")";

            stmt.executeUpdate(sql);
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public ArrayList<Pago> historialPagos(String contrato) {
        ArrayList<Pago> pagos = new ArrayList<Pago>();

        try {
            String sql = "SELECT * FROM pagos WHERE nContrato='" + contrato + "'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pago pago = new Pago();
                pago.setIdPago(rs.getInt("idPago"));
                pago.setMonto(rs.getInt("monto"));
                pago.setFecha(rs.getString("fecha"));
                pago.setNContrato(rs.getInt("ncontrato"));

                pagos.add(pago);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pagos;
    }

    public ArrayList<Pago> getTodo() {
        ArrayList<Pago> pagos = new ArrayList<Pago>();

        try {
            String sql = "SELECT * FROM pagos";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Pago pago = new Pago();
                pago.setIdPago(rs.getInt("idPago"));
                pago.setMonto(rs.getInt("monto"));
                pago.setFecha(rs.getString("fecha"));
                pago.setNContrato(rs.getInt("ncontrato"));

                pagos.add(pago);
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return pagos;
    }
}
