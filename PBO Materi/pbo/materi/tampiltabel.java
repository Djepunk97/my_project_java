/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.materi;

import antlr.collections.impl.Vector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Naufal
 */
public class tampiltabel extends javax.swing.JFrame {

    public static Connection koneksi;
    public static Statement st;
    public static ResultSet rs;
    public tampiltabel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        combox3 = new javax.swing.JComboBox<>();
        back = new javax.swing.JButton();
        combox1 = new javax.swing.JComboBox<>();
        tampil = new javax.swing.JButton();
        combox2 = new javax.swing.JComboBox<>();
        combox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(681, 378));
        getContentPane().setLayout(null);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Mata Kuliah", "Fakultas", "Jurusan", "Semester", "mata kuliah", "SKS", "Nama Dosen"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 220, 670, 220);

        combox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        getContentPane().add(combox3);
        combox3.setBounds(10, 120, 173, 35);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Refresh-32.png"))); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(340, 20, 100, 40);

        combox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--", "Fakultas", "Jurusan", "Semester" }));
        combox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox1ActionPerformed(evt);
            }
        });
        getContentPane().add(combox1);
        combox1.setBounds(10, 20, 173, 35);

        tampil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/3d bar chart.png"))); // NOI18N
        tampil.setText("Tampil");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });
        getContentPane().add(tampil);
        tampil.setBounds(220, 20, 100, 40);

        combox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        combox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combox2ActionPerformed(evt);
            }
        });
        getContentPane().add(combox2);
        combox2.setBounds(10, 70, 173, 35);

        combox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih--" }));
        getContentPane().add(combox4);
        combox4.setBounds(10, 170, 173, 35);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void fakultas(){
        try{        
        st=konek.Koneksi().createStatement();
                String sql="select * from fakultas";
                rs=st.executeQuery(sql);
                while(rs.next()){
//                    if(rs.getString("fakultas").equals("Sains dan Teknologi")){
//                        combox2.addItem(rs.getString("jurusan"));
//                    }
                combox2.addItem(rs.getString(2));
                }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void jurusan(){
        
        try{
            String sql="select * from jurusan";
            rs=st.executeQuery(sql);
            while(rs.next()){
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void combox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox1ActionPerformed
                try{
                    if(combox1.getSelectedItem().equals("Fakultas")){
                        fakultas();
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
//            DefaultComboBoxModel Fakultas = new DefaultComboBoxModel(new String[]{"Sains dan Teknologi","Psikologi","Ilmu Tarbiyah dan Keguruan","Ekonomi","Syari'ah","Humaniora"});
////            DefaultComboBoxModel jurusan = new DefaultComboBoxModel(new String[]{"1", "2", "3","4","5","6"});
//            DefaultComboBoxModel Semester = new DefaultComboBoxModel(new String[]{"Semester I","Semester II","Semester III","Semester IV","Semester V","Semester VI","Semester VII","Semester VIII"});
//            DefaultComboBoxModel saintek = new DefaultComboBoxModel(new String[]{"Biologi", "Matematika", "Fisikia","Kimia","Teknik Informatika","Teknik Arsitektur"});
//            DefaultComboBoxModel psikologi = new DefaultComboBoxModel(new String[]{"Psikologi"});
//            DefaultComboBoxModel fitk =new DefaultComboBoxModel(new String[] {"P. IPS","PGMI", "PGRA", "PAI"});
//            combox2.removeAllItems();
//            combox3.removeAllItems();
//            combox4.removeAllItems();
//            if("Fakultas".equals(combox1.getSelectedItem()))
//            {
//            combox2.setModel(Fakultas);
//            }
//             if("Sains dan Teknologi".equals(combox2.getSelectedItem()))
//            {
//            combox3.setModel(saintek);
//            }
//             else if("Psikologi".equals(combox2.getSelectedItem()))
//            {
//            combox3.setModel(psikologi);
//            }
//             else if("Ilmu Tarbiyah dan Keguruan".equals(combox2.getSelectedItem()))
//            {
//            combox3.setModel(fitk);
//            } 
//            else if("Semester".equals(combox1.getSelectedItem()))
//            {
//            combox4.setModel(Semester);
//            }
    }//GEN-LAST:event_combox1ActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
         try{
//            if("Teknik Informatika".equals(combox3.getSelectedItem())){
//                st=konek.Koneksi().createStatement();
//                rs=st.executeQuery("select * from makul where fakultas='"+combox2.getSelectedItem()+"' and jurusan='"+combox3.getSelectedItem()+"' and Semester='"+combox4.getSelectedItem()+"'");
//                tbl.setModel(DbUtils.resultSetToTableModel(rs));
//            }
                if("Semester I".equals(combox4.getSelectedItem())){
                st=konek.Koneksi().createStatement();
                rs=st.executeQuery("select * from makul where Semester='"+combox4.getSelectedItem()+"'");
                tbl.setModel(DbUtils.resultSetToTableModel(rs));
                }
                if("Semester II".equals(combox4.getSelectedItem())){
                st=konek.Koneksi().createStatement();
                rs=st.executeQuery("select * from makul where Semester='"+combox4.getSelectedItem()+"'");
                tbl.setModel(DbUtils.resultSetToTableModel(rs));
                }
//            else{
//                 st=konek.Koneksi().createStatement();
//        rs=st.executeQuery("select * from makul");
//        tbl.setModel(DbUtils.resultSetToTableModel(rs));       
//                        }
//            }
                else{st=konek.Koneksi().createStatement();
                rs=st.executeQuery("select * from makul");
                tbl.setModel(DbUtils.resultSetToTableModel(rs));
                }    
                    
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_tampilActionPerformed

    private void combox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combox2ActionPerformed
        
    }//GEN-LAST:event_combox2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> combox1;
    private javax.swing.JComboBox<String> combox2;
    private javax.swing.JComboBox<String> combox3;
    private javax.swing.JComboBox<String> combox4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tampil;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
