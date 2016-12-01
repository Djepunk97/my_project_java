/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Naufal
 */
public class input_menu extends javax.swing.JFrame {

    private Connection con;
    private ResultSet result;
    private Statement st;
    
    public input_menu() {
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

        txt_id = new javax.swing.JTextField();
        combo_jenis = new javax.swing.JComboBox<>();
        txt_nama = new javax.swing.JTextField();
        txt_harga = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        tampil = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_menu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id);
        txt_id.setBounds(90, 70, 50, 30);

        combo_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH--", "Makanan", "Minuman" }));
        combo_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_jenisActionPerformed(evt);
            }
        });
        getContentPane().add(combo_jenis);
        combo_jenis.setBounds(90, 30, 200, 30);
        getContentPane().add(txt_nama);
        txt_nama.setBounds(90, 120, 200, 30);
        getContentPane().add(txt_harga);
        txt_harga.setBounds(90, 170, 200, 30);

        jLabel1.setText("Jenis");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 30, 80, 30);

        jLabel2.setText("ID Menu");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 70, 30);

        jLabel3.setText("Nama Menu");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 120, 70, 30);

        jLabel4.setText("Harga");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 170, 70, 30);

        simpan.setText("SAVE");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(20, 250, 80, 40);

        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(110, 250, 80, 40);

        hapus.setText("DELETE");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus);
        hapus.setBounds(300, 250, 80, 40);

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(690, 250, 90, 40);

        tampil.setText("SHOW");
        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });
        getContentPane().add(tampil);
        tampil.setBounds(200, 250, 90, 40);

        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear);
        clear.setBounds(390, 250, 90, 40);

        tbl_menu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id Menu", "Nama Menu", "Harga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_menu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 10, 452, 210);

        setSize(new java.awt.Dimension(814, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void makanan(){
        String id = txt_id.getText();
        String nama=txt_nama.getText();
        String harga=txt_harga.getText();
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="insert into makanan values('"+id+"','"+nama+"','"+harga+"')";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Menu Makanan Berhasil Dimasukkan");
        txt_id.setText("");
        txt_nama.setText("");
        txt_harga.setText("");
        }
        catch(Exception e){
            
        }
    }
    
    private void minuman(){
        String id = txt_id.getText();
        String nama=txt_nama.getText();
        String harga=txt_harga.getText();
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="insert into minuman values('"+id+"','"+nama+"','"+harga+"')";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Menu Minuman Berhasil Dimasukkan");
        txt_id.setText("");
        txt_nama.setText("");
        txt_harga.setText("");
        }
        catch(Exception e){
            
        }
    }
    
    private void tampil_id_makan(){
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="select max(id_makan) from makanan";
        result=st.executeQuery(sql);
        while(result.next()){
            txt_id.setText(result.getObject(1).toString());
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void tampil_id_minum(){
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="select max(id_minum) from minuman";
        result=st.executeQuery(sql);
        while(result.next()){
            txt_id.setText(result.getObject(1).toString());
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void edit_makanan(){
        String id = txt_id.getText();
        String nama=txt_nama.getText();
        String harga=txt_harga.getText();
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="update makanan set id_makan='"+id+"',nama_makan='"+nama+"',harga='"+harga+"' where id_makan='"+id+"'";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Menu Makanan Berhasil Diperbarui");
        txt_id.setText("");
        txt_nama.setText("");
        txt_harga.setText("");
        }
        catch(Exception e){
            
        }
    }
     
    private void edit_minuman(){
        String id = txt_id.getText();
        String nama=txt_nama.getText();
        String harga=txt_harga.getText();
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="update minuman set id_minum='"+id+"',nama_minum='"+nama+"',harga='"+harga+"' where id_minum='"+id+"'";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Menu Minuman Berhasil Diperbarui");
        txt_id.setText("");
        txt_nama.setText("");
        txt_harga.setText("");
        }
        catch(Exception e){
            
        }
    }
    
    private void tampil_makanan(){
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="select * from makanan where id_makan='"+txt_id.getText()+"'";
        result=st.executeQuery(sql);
        while(result.next()){
            txt_id.setText(result.getObject(1).toString());
            txt_nama.setText(result.getObject(2).toString());
            txt_harga.setText(result.getObject(3).toString());
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void tampil_minum(){
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="select * from minuman where id_minum='"+txt_id.getText()+"'";
        result=st.executeQuery(sql);
        while(result.next()){
            txt_id.setText(result.getObject(1).toString());
            txt_nama.setText(result.getObject(2).toString());
            txt_harga.setText(result.getObject(3).toString());
        }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void hapus_makanan(){
        try{
            st=koneksi.Koneksi().createStatement();
            String sql="delete from makanan where id_makan='"+txt_id.getText()+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void hapus_minuman(){
        try{
            st=koneksi.Koneksi().createStatement();
            String sql="delete from minuman where id_minum='"+txt_id.getText()+"'";
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void tabel_makanan(){
        try{
            st=koneksi.Koneksi().createStatement();
            String sql="select * from makanan";
            result=st.executeQuery(sql);
            tbl_menu.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void tabel_minuman(){
        try{
            st=koneksi.Koneksi().createStatement();
            String sql="select * from minuman";
            result=st.executeQuery(sql);
            tbl_menu.setModel(DbUtils.resultSetToTableModel(result));
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        if(combo_jenis.getSelectedItem().equals("Makanan")){
            makanan();
            tabel_makanan();
        }
        else if(combo_jenis.getSelectedItem().equals("Minuman")){
            minuman();
            tabel_minuman();
        }
     
    }//GEN-LAST:event_simpanActionPerformed

    
    
    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        
    }//GEN-LAST:event_txt_idActionPerformed

    private void combo_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_jenisActionPerformed
        if(combo_jenis.getSelectedItem().equals("Makanan")){
            tampil_id_makan();
            tabel_makanan();
        }
        else if(combo_jenis.getSelectedItem().equals("Minuman")){
            tampil_id_minum();
            tabel_minuman();
        }
    }//GEN-LAST:event_combo_jenisActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        if(combo_jenis.getSelectedItem().equals("Makanan")){
            edit_makanan();
        }
        else if(combo_jenis.getSelectedItem().equals("Minuman")){
            edit_minuman();
        }
    }//GEN-LAST:event_editActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        if(combo_jenis.getSelectedItem().equals("Makanan")){
            tampil_makanan();
        }
        else if(combo_jenis.getSelectedItem().equals("Minuman")){
            tampil_minum();
        }
    }//GEN-LAST:event_tampilActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        if(combo_jenis.getSelectedItem().equals("Makanan")){
            hapus_makanan();
        }
        else if(combo_jenis.getSelectedItem().equals("Minuman")){
            hapus_minuman();
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        txt_id.setText("");
        txt_nama.setText("");
        txt_harga.setText("");
    }//GEN-LAST:event_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(input_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> combo_jenis;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton simpan;
    private javax.swing.JButton tampil;
    private javax.swing.JTable tbl_menu;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nama;
    // End of variables declaration//GEN-END:variables
}