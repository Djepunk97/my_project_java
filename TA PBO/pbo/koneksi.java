/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class koneksi {
    protected static Connection koneksi;
    protected static Statement st;
    public static Connection Koneksi(){
    try{
    String url="jdbc:postgresql://localhost:5432/ayam";
    String user="naufal";
    String pass="root";
    Class.forName("org.postgresql.Driver");
    koneksi = DriverManager.getConnection(url,user,pass);
    st = koneksi.createStatement();
        //System.out.println("Koneksi Berhasil");
    }
    catch(SQLException | ClassNotFoundException ex){
    System.err.print(ex);
    }
    return koneksi;
}
    public static void main(String[] args) {
        Koneksi();
    }
}