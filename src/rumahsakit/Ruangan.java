/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rumahsakit;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class Ruangan extends javax.swing.JFrame {

    private DefaultTableModel model;

    /**
     * Creates new form Ruangan
     */
    public Ruangan() {
        initComponents();
        TampilData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kode_ruangan = new javax.swing.JTextField();
        nama_ruangan = new javax.swing.JTextField();
        kapasitas = new javax.swing.JTextField();
        fasilitas = new javax.swing.JTextField();
        jenis_kamar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 83, 127));
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("RUANGAN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 140, 30));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Kode Ruangan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 100, 20));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Nama Ruangan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 100, 20));

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Kapasitas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 100, 20));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Fasilitas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 90, 20));

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Jenis Kamar");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 90, 20));
        jPanel1.add(kode_ruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 480, -1));
        jPanel1.add(nama_ruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 480, -1));

        kapasitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kapasitasActionPerformed(evt);
            }
        });
        jPanel1.add(kapasitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 480, -1));
        jPanel1.add(fasilitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 480, -1));
        jPanel1.add(jenis_kamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 480, -1));

        jButton1.setText("Input");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 243, 70, 20));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 70, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 70, -1));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 70, -1));

        Tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "kode_ruangan", "nama_ruangan", "kapasitas", "fasilitas", "jenis_kamar"
            }
        ));
        Tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 540, 130));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kapasitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kapasitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kapasitasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ubahdata();
        TampilData();
        bersih();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        hapusdata();
        TampilData();
        bersih();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //Button Back
        this.setVisible(false);
            new Home().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        simpandata();
        TampilData();
        bersih();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelMouseClicked
        // TODO add your handling code here:
         // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel)Tabel.getModel();
            int SelectedRowIndex = Tabel.getSelectedRow();
            
            kode_ruangan.setText(model.getValueAt(SelectedRowIndex, 0).toString());
            nama_ruangan.setText(model.getValueAt(SelectedRowIndex, 1).toString());
            kapasitas.setText(model.getValueAt(SelectedRowIndex, 2).toString());
            fasilitas.setText(model.getValueAt(SelectedRowIndex, 3).toString());
            jenis_kamar.setText(model.getValueAt(SelectedRowIndex, 4).toString());
            
        }catch (NullPointerException ex){
            
        }
    }//GEN-LAST:event_TabelMouseClicked

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
            java.util.logging.Logger.getLogger(Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ruangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ruangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabel;
    private javax.swing.JTextField fasilitas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenis_kamar;
    private javax.swing.JTextField kapasitas;
    private javax.swing.JTextField kode_ruangan;
    private javax.swing.JTextField nama_ruangan;
    // End of variables declaration//GEN-END:variables

//Codingan untuk tampil data
public void TampilData() {
    Object[] baris = {"kode_ruangan","nama_ruangan","kapasitas","fasilitas","jenis_kamar"};

        model = new DefaultTableModel(null, baris);
        Tabel.setModel(model);
        Connection connection = new Koneksi().getConnection();
        try {
            String sql = "select * from Ruangan order by kode_ruangan asc";
            java.sql.Statement statement = connection.createStatement();
            java.sql.ResultSet hasil = statement.executeQuery(sql);
            while (hasil.next()){
                String kode = hasil.getString("kode_ruangan");
                String nama = hasil.getString("nama_ruangan");
                String kps = hasil.getString("kapasitas");
                String fsl = hasil.getString("fasilitas");
                String JKamar = hasil.getString("jenis_kamar");
                String[] data = {kode, nama, kps, fsl, JKamar};
                model.addRow(data);
            }
            
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Menampilkan data Gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "Menampilkan data Gagal" + e);
        }
}

//codingan untuk input data
void simpandata() {
    //Deklarasi variabel
    String kode = kode_ruangan.getText(); //nama text field di form
    String nama = nama_ruangan.getText();
    String kps = kapasitas.getText();
    String fsl = fasilitas.getText();
    String JKamar = jenis_kamar.getText();

    
    
    
    //Koneksi terhadap database
    Connection connection = new Koneksi().getConnection();
    
    
    //Proses penyimpanan
    try {
        String sql = "Insert into Ruangan values(?,?,?,?,?)"; //jumlah sesuai dengan variabel di tabel
      PreparedStatement statement = connection.prepareStatement(sql);
      //connection.prepareStatement(sql);
      
      
      statement.setString(1,kode);
      statement.setString(2,nama);
      statement.setString(3,kps);
      statement.setString(4,fsl);
      statement.setString(5,JKamar);
      
      statement.executeUpdate();
      
      JOptionPane.showMessageDialog(null, "DATA BERHASIL DISIMPAN", "informasi", JOptionPane.INFORMATION_MESSAGE);
      
    
    } catch (HeadlessException | SQLException e) {
       // JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN","informasi",);
       //JOptionPane.INFORMATION_MESSAGE;
       JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN \n" +e) ; //Gagal menampilkan data
    } 

    
    }

//codingan untuk input data
void ubahdata() {
    //Deklarasi variabel
    String kode = kode_ruangan.getText(); //nama text field di form
    String nama = nama_ruangan.getText();
    String kps = kapasitas.getText();
    String fsl = fasilitas.getText();
    String JKamar = jenis_kamar.getText();

    
    
    
    //Koneksi terhadap database
    Connection connection = new Koneksi().getConnection();
    
    
    //Proses penyimpanan
    try {
        String sql = "update Ruangan set nama_ruangan=?, kapasitas=?, fasilitas=?, jenis_kamar=? where kode_ruangan=?"; //jumlah sesuai dengan variabel di tabel
      PreparedStatement statement = connection.prepareStatement(sql);
      //connection.prepareStatement(sql);
      
      
      
      statement.setString(1,nama);
      statement.setString(2,kps);
      statement.setString(3,fsl);
      statement.setString(4,JKamar);
      statement.setString(5,kode);
      
      statement.executeUpdate();
      
      JOptionPane.showMessageDialog(null, "DATA BERHASIL DIUBAH", "informasi", JOptionPane.INFORMATION_MESSAGE);
      
      //Jika data tidak berhasil diinput
      //TampilData();
      //Tambah fungsi refresh
    
    } catch (HeadlessException | SQLException e) {
       // JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN","informasi",);
       //JOptionPane.INFORMATION_MESSAGE;
       JOptionPane.showMessageDialog(null, "DATA GAGAL DIUBAH \n" +e) ; //Gagal menampilkan data
    } 
}


public void hapusdata(){
    
    int baris = Tabel.getSelectedRow();//namavariabeltabel pasien
    String kode_ruangan = model.getValueAt(baris, 0).toString();
    
    int Data = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin untuk menghapus data kode_ruangan :" +kode_ruangan+ "?",
            "konfirmasi", JOptionPane.YES_NO_OPTION); //primary key
    
    if (Data == 0){
        try {
            //memanggil method koneksi
            Connection connection = new Koneksi().getConnection();
            String sql = "delete from Ruangan where kode_ruangan = '" +kode_ruangan + "'";
            Statement statement = connection.createStatement();
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
            
            TampilData();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Dataa Gagal Dihapus");
        }
    }
}

//Untuk kodingan bersih setelah proses 
public void bersih(){
    kode_ruangan.setText("");
    nama_ruangan.setText("");
    kapasitas.setText("");
    fasilitas.setText("");
    jenis_kamar.setText("");
}


}
