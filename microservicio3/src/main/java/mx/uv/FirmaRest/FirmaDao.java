package mx.uv.FirmaRest;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import java.util.Random;

public class FirmaDao {
    Connection con;
    
    public FirmaDao() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contratos","root","");
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
    }

    public String generarFirma() {

        String firma="";
        int l1 =0,l2=0,l3=0;
        int min = 0;
        int max = 9;
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random r = new Random();

        int n1 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        int n3 = (int)Math.floor(Math.random()*(max-min+1)+min);
        

        char letra1 = abc.charAt(r.nextInt(abc.length()));
        char letra2 = abc.charAt(r.nextInt(abc.length()));
        char letra3 = abc.charAt(r.nextInt(abc.length()));

        firma = ""+n1+letra1+n2+letra2+n3+letra3;

        return firma;
    }

}

