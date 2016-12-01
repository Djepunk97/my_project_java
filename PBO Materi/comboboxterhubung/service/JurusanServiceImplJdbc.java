/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxterhubung.service;

import comboboxterhubung.entity.Jurusan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JurusanServiceImplJdbc implements JurusanSevice{
    public Connection connection;
    public PreparedStatement preparedStatement;
    
    public JurusanServiceImplJdbc(Connection connection){
        this.connection=connection;
    }
    
    @Override
    public List<Jurusan> getJurusanByFakultas(String kodefakultas){
        try{
            List<Jurusan> jurusans=new ArrayList<Jurusan>();
            preparedStatement=connection.prepareStatement("SELECT * FROM jurusan where id_fakultas=?");
            preparedStatement.setString(1, kodefakultas);
            ResultSet rs=preparedStatement.executeQuery();
            while(rs.next()){
                Jurusan jurusan=new Jurusan();
                jurusan.setIdJurusan(rs.getString("id_jurusan"));
                jurusan.setNamaJurusan(rs.getString("nama_jurusan"));
                jurusans.add(jurusan);
            }
            return jurusans;
            }
        catch(SQLException se){
            Logger.getLogger(JurusanServiceImplJdbc.class.getName()).log(Level.SEVERE,null, se);
        }
        return null;
    }
    
}
