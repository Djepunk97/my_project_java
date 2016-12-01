package pbo.materi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naufal
 */
public class konek {
    private static Connection koneksi;
    private static Statement st;
    protected static Connection Koneksi(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/matakuliah","root","");
    st = koneksi.createStatement( );
    }
    catch(SQLException ex){
    System.err.print(ex);
    }
    catch(ClassNotFoundException ex){
    System.err.print(ex);
    }
    return koneksi;
}
    public static void main(String[] args) {
        Koneksi();
    }
}
