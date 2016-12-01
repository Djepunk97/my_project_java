/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbd;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Naufal
 */
public final class barang extends javax.swing.JFrame {
    protected static Connection connection;
    protected static Statement st;
    protected static ResultSet rs;
    protected static DefaultTableModel model;
    
    String tanggal;
    /**
     * Creates new form barang
     */
    public barang() {
        initComponents();
        tampil_id();
        kategori();
        

    }
    protected void intiTabel(){
            //st=koneksi.Koneksi().createStatement();
            //String sql="select * from brg_msk";  
            //tblbarang.setModel(DbUtils.resultSetToTableModel(sql));
    }
//public void ShowData() {
//    
//    int i=tblbarang.getSelectedRow();
//        
//        if(i==-1)
//        {
//            return;
//        }
//        String id=(String) model.getValueAt(i, 0);
//        txtid_barang.setText(id);
//        String kategori=(String)model.getValueAt(i, 1);
//        combo_jenis.setSelectedItem(kategori);
//        String merk=(String) model.getValueAt(i, 2);
//        txtmerk.setText(merk);
//        String harga=(String) model.getValueAt(i, 3);
//        txtharga.setText(harga);
//        String tgl=(String) model.getValueAt(i, 4);
//        jCalendarCombo1.setSelectedItem(tgl);
//}
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new resources.bg();
        bg2 = new resources.bg();
        combo_jenis = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCalendarCombo1 = new org.freixas.jcalendar.JCalendarCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbarang = new javax.swing.JTable();
        show = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtid_barang = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        spinner = new javax.swing.JSpinner();
        combo_merk = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(925, 548));
        getContentPane().setLayout(null);

        getContentPane().add(combo_jenis);
        combo_jenis.setBounds(72, 158, 256, 30);

        jLabel1.setText("Merk");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 214, 60, 20);

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Add.png"))); // NOI18N
        add.setText("ADD");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(0, 456, 116, 46);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Delete-32.png"))); // NOI18N
        delete.setText("DELETE");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.setFocusable(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(268, 456, 116, 46);

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Edit-32.png"))); // NOI18N
        edit.setText("EDIT");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit.setFocusable(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(134, 456, 116, 46);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Exit.png"))); // NOI18N
        exit.setText("EXIT");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.setFocusable(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(787, 456, 116, 46);

        jLabel2.setText("No. Barang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 107, 70, 30);

        jLabel3.setText("Kategori");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 161, 70, 30);

        jLabel4.setText("Harga");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 261, 70, 30);

        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtharga);
        txtharga.setBounds(72, 264, 256, 30);

        jLabel5.setText("Tgl Masuk");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 310, 70, 30);

        jCalendarCombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalendarCombo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCalendarCombo1);
        jCalendarCombo1.setBounds(72, 313, 256, 30);

        tblbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No. Barang", "Kategori", "Merk", "Harga", "Tgl Masuk"
            }
        ));
        tblbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblbarang);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(373, 99, 530, 230);

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Chart.png"))); // NOI18N
        show.setText("SHOW");
        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.setFocusable(false);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show);
        show.setBounds(402, 456, 131, 46);

        jLabel6.setText("Jumlah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 364, 70, 14);

        txtid_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtid_barangActionPerformed(evt);
            }
        });
        getContentPane().add(txtid_barang);
        txtid_barang.setBounds(72, 107, 256, 33);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Print.png"))); // NOI18N
        jButton1.setText("PRINT");
        jButton1.setMaximumSize(new java.awt.Dimension(131, 73));
        jButton1.setMinimumSize(new java.awt.Dimension(131, 73));
        getContentPane().add(jButton1);
        jButton1.setBounds(551, 456, 119, 46);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("INPUT STOK BARANG");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 11, 262, 70);

        spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000, 1));
        getContentPane().add(spinner);
        spinner.setBounds(70, 360, 40, 30);

        getContentPane().add(combo_merk);
        combo_merk.setBounds(70, 210, 260, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void kategori(){
        try{
            st=koneksi.Koneksi().createStatement();
            String sql="select * from kategori";
            rs=st.executeQuery(sql);
            while(rs.next()){
                combo_jenis.addItem(rs.getObject(2).toString());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "gagal");
        }
    }    
    private void merk(){
        try{
            st=koneksi.Koneksi().createStatement();
            String sql="select * from merk";
            rs=st.executeQuery(sql);
            while(rs.next()){
                combo_merk.addItem(rs.getObject(2).toString());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "gagal");
        }
    }
    private void tampil_id(){
        try{
            st=koneksi.Koneksi().createStatement();
            String sql="select max(id_brg) from brg_msk";
            rs=st.executeQuery(sql);
            while(rs.next()){
                txtid_barang.setText(rs.getObject(1).toString());
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "gagal");
        }
    }
    
    
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String id=txtid_barang.getText();
        String kategori=(String)combo_jenis.getSelectedItem();
        String merk=(String)combo_merk.getSelectedItem();
        String harga=txtharga.getText();
        String tgl=(String)jCalendarCombo1.getSelectedItem();
        String jumlah=spinner.getValue().toString();
        
        if(kategori.equals("")|| merk.equals("") || harga.equals("") || tgl.equals("")){
           JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
           txtid_barang.requestFocus();
        }
        else{
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="insert into brg_msk values("+id+",'"+kategori+"','"+merk+"','"+harga+"','"+tgl+"','"+jumlah+"')";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Barang berhasil disimpan");
        txtid_barang.setText("");
       
        txtharga.setText("");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        String id=txtid_barang.getText();
        String kategori=(String)combo_jenis.getSelectedItem();
        String merk=(String)combo_merk.getSelectedItem();
        String harga=txtharga.getText();
        String tgl=(String)jCalendarCombo1.getSelectedItem();
        String jumlah=spinner.getValue().toString(); 
        
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="update brg_msk set id_brg='"+id+"', kategori='"+kategori+"', merk='"+merk+"', harga='"+harga+"', tgl_masuk='"+tgl+"',jumlah='"+jumlah+"' where id_brg="+id+" or merk="+merk+"";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Barang berhasil disimpan");
        txtid_barang.setText("");
        
        txtharga.setText("");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        String id=txtid_barang.getText();
        String merk=(String)combo_merk.getSelectedItem();
                 
        try{
        st=koneksi.Koneksi().createStatement();
        String sql="delete from brg_msk where id_brg="+id+" or merk="+merk+"";
        st.executeUpdate(sql);
        JOptionPane.showMessageDialog(null, "Barang berhasil disimpan");
        txtid_barang.setText("");
        
        txtharga.setText("");
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_editActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthargaActionPerformed

    private void tblbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblbarangMouseClicked
        
    }//GEN-LAST:event_tblbarangMouseClicked

    private void jCalendarCombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalendarCombo1ActionPerformed
        if(jCalendarCombo1.getDate()!=null){
            SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");
            tanggal=date.format(jCalendarCombo1.getDate());
        }
    }//GEN-LAST:event_jCalendarCombo1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        try{
        st=koneksi.Koneksi().createStatement();
        rs=st.executeQuery("select * from brg_msk");
        tblbarang.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }//GEN-LAST:event_showActionPerformed
    }
    private void txtid_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtid_barangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtid_barangActionPerformed

    

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
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barang().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private resources.bg bg1;
    private resources.bg bg2;
    private javax.swing.JComboBox<String> combo_jenis;
    private javax.swing.JComboBox<String> combo_merk;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private org.freixas.jcalendar.JCalendarCombo jCalendarCombo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton show;
    private javax.swing.JSpinner spinner;
    private javax.swing.JTable tblbarang;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtid_barang;
    // End of variables declaration//GEN-END:variables
}
