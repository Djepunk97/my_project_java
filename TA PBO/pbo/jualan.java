/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo;

import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Naufal
 */
public class jualan extends javax.swing.JFrame {

    private DefaultTableModel model;
    private ResultSet rs;
    private double subTotal=0;
    private double total=0;
    DefaultListModel model_list_makan=new DefaultListModel();
    DefaultListModel model_list_minum=new DefaultListModel();
    public jualan() {
        initComponents();
        
        list_makanan();
        list_minuman();
        
        model=new DefaultTableModel();
        tbljual.setModel(model);
        model.addColumn("Id Transaksi");
        model.addColumn("Nama");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("SubTotal");
  
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
        tbljual = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        list_makan = new javax.swing.JList<>();
        pesan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        spinner = new javax.swing.JSpinner();
        txt_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list_minum = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1325, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        tbljual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Menu", "Nama", "Harga", "Jumlah", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbljual);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(590, 130, 560, 350);

        list_makan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        list_makan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list_makanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list_makan);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 130, 180, 200);

        pesan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pesan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Buy.png"))); // NOI18N
        pesan.setText("PESAN");
        pesan.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });
        getContentPane().add(pesan);
        pesan.setBounds(1200, 90, 100, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Total");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(590, 500, 100, 40);

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Tahoma", 0, 43)); // NOI18N
        getContentPane().add(txt_total);
        txt_total.setBounds(680, 500, 270, 60);

        jLabel2.setFont(new java.awt.Font("Valken", 0, 28)); // NOI18N
        jLabel2.setText("SILAHKAN PILIH MENU ANDA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(450, 10, 450, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Add.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 350, 130, 70);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("MENU ANDA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(690, 90, 80, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Delete-32.png"))); // NOI18N
        jButton2.setText("HAPUS");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1200, 140, 100, 40);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        spinner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        spinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        spinner.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(spinner);
        spinner.setBounds(400, 40, 50, 40);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        jPanel1.add(txt_id);
        txt_id.setBounds(470, 40, 60, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Id Transaksi");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(470, 10, 100, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Jumlah");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(400, 10, 50, 30);

        jScrollPane3.setViewportView(list_minum);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(210, 40, 170, 200);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MAKANAN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 10, 80, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("MINUMAN");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(270, 10, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 90, 550, 250);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(570, 90, 600, 490);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Print.png"))); // NOI18N
        jButton3.setText("PRINT");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jButton3);
        jButton3.setBounds(1200, 190, 100, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void list_makanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list_makanMouseClicked

    }//GEN-LAST:event_list_makanMouseClicked

    public double countSubtotal(){
        
        this.subTotal=0;
        for (int i=0;i<tbljual.getRowCount();i++){
            subTotal=subTotal+Double.parseDouble(tbljual.getValueAt(i,5).toString());
            
        }
        return subTotal;
    }
     public double getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    private void list_minuman(){
        
        try{
            Statement statement;
            statement = (Statement) koneksi.Koneksi().createStatement();
            ResultSet rs=statement.executeQuery("select * from minuman");
            
            while (rs.next()){
            while(rs.next()){
                String ItemList1 = rs.getString("nama_minum");
                
                model_list_minum.addElement(ItemList1);
            }
            list_minum.setModel(model_list_minum);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void list_makanan(){
        
        try{
            Statement statement;
            statement = (Statement) koneksi.Koneksi().createStatement();
            ResultSet rs=statement.executeQuery("select * from makanan");
            
            while (rs.next()){
            while(rs.next()){
                String ItemList1 = rs.getString("nama_makan");
                
                model_list_makan.addElement(ItemList1);
            }
            list_makan.setModel(model_list_makan);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
       
        for(int i=0;i<tbljual.getRowCount();i++){
        total=total+Integer.parseInt(tbljual.getValueAt(i, 4).toString());
        txt_total.setText(Double.toString(total));
            
         }
    }//GEN-LAST:event_pesanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String makan=(String) list_makan.getSelectedValue();
        String minum = (String) list_minum.getSelectedValue();
        if(list_makan.isSelectedIndex(1)){
        try{
            Statement statement;
            statement = (Statement) koneksi.Koneksi().createStatement();
            rs=statement.executeQuery("select * from makanan where nama_makan='"+makan+"'");
            
            while (rs.next()) {
                String jml = String.valueOf(spinner.getValue());
                int harga = Integer.parseInt(rs.getString("harga"));
                int sum = Integer.parseInt(jml);
                int subtotal=harga*sum;
                Object[] o=new Object[5];
                o[0]=rs.getObject(1);
                o[1]=rs.getString(2);               
                o[2]=rs.getString(3);
                o[3]=spinner.getValue();
                o[4]=subtotal;
                model.addRow(o);
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        else if(list_minum.isSelectedIndex(1)){
        try{
            Statement statement;
            statement = (Statement) koneksi.Koneksi().createStatement();
            rs=statement.executeQuery("select * from minuman where nama_minum='"+minum+"'");
            
            while (rs.next()) {
                String jml = String.valueOf(spinner.getValue());
                int harga = Integer.parseInt(rs.getString("harga"));
                int sum = Integer.parseInt(jml);
                int subtotal=harga*sum;
                Object[] o=new Object[5];
                o[0]=rs.getObject(1);
                o[1]=rs.getString(2);               
                o[2]=rs.getString(3);
                o[3]=spinner.getValue();
                o[4]=subtotal;
                model.addRow(o);
            } 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        }
        
            
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tbljual.removeAll();
        txt_total.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

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
            java.util.logging.Logger.getLogger(jualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jualan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JList<String> list_makan;
    private javax.swing.JList<String> list_minum;
    private javax.swing.JButton pesan;
    private javax.swing.JSpinner spinner;
    private javax.swing.JTable tbljual;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}