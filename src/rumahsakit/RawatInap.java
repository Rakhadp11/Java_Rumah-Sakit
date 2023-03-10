/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package rumahsakit;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class RawatInap extends javax.swing.JFrame {
    RS rs = new RS();
    /**
     * Creates new form RawatInap
     */
    public RawatInap() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        namaP = new java.awt.TextField();
        Jk = new javax.swing.JComboBox<>();
        TMPL = new java.awt.TextField();
        TGL_L = new com.toedter.calendar.JDateChooser();
        HP = new java.awt.TextField();
        alamat = new java.awt.TextField();
        Isi_total = new java.awt.TextField();
        Sps = new javax.swing.JComboBox<>();
        RK = new javax.swing.JComboBox<>();
        DK = new javax.swing.JComboBox<>();
        RWI = new javax.swing.JComboBox<>();
        Kembali = new java.awt.Button();
        Daftar = new java.awt.Button();
        Konfirmasi = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(41, 83, 127));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("RAWAT INAP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 168, -1));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 110, -1));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Jenis Kelamin");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 120, -1));

        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Tempat Lahir");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, -1));

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Tanggal Lahir");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, -1));

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("No HP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 130, 20));

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 130, 20));

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("Pilih Status Pasien");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 140, -1));

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Pilih Ruang Kamar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 150, -1));

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Pilih Dokter ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 150, 20));

        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Pilih Durasi Rawat Inap");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 150, -1));

        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Total Keseluruhan");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        namaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPActionPerformed(evt);
            }
        });
        getContentPane().add(namaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 330, -1));

        Jk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih ", "Laki - laki", "Perempuan" }));
        Jk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JkActionPerformed(evt);
            }
        });
        getContentPane().add(Jk, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 330, -1));

        TMPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TMPLActionPerformed(evt);
            }
        });
        getContentPane().add(TMPL, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 330, -1));
        getContentPane().add(TGL_L, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 330, -1));
        getContentPane().add(HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 330, -1));

        alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatActionPerformed(evt);
            }
        });
        getContentPane().add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 330, -1));
        getContentPane().add(Isi_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 180, -1));

        Sps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SILAHKAN ISI", "PASIEN ASURANSI", "PASIEN UMUM", "PASIEN BPJS" }));
        Sps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SpsActionPerformed(evt);
            }
        });
        getContentPane().add(Sps, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 330, -1));

        RK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SILAHKAN ISI", "VIP 1(Kipas Angin dan TV)", "VIP 2(AC dan TV)", "VIP 3(AC, TV, dan Sofa)", "Umum 1(Kipas Angin dan TV)", "Umum 2(AC dan TV)", " " }));
        RK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RKActionPerformed(evt);
            }
        });
        getContentPane().add(RK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 330, -1));

        DK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SILAHKAN ISI", "dr. Budi Herdansyah", "dr. Selly Wijaksana", "dr. Anies Simatupang", "dr. Triana Apriani", " " }));
        DK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DKActionPerformed(evt);
            }
        });
        getContentPane().add(DK, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 330, -1));

        RWI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SILAHKAN ISI", "LEBIH DARI 1 HARI", "LEBIH DARI 4 HARI", "LEBIH DARI 7 HARI", " " }));
        RWI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RWIActionPerformed(evt);
            }
        });
        getContentPane().add(RWI, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 330, -1));

        Kembali.setLabel("Kembali");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });
        getContentPane().add(Kembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        Daftar.setLabel("Daftar");
        Daftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarActionPerformed(evt);
            }
        });
        getContentPane().add(Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 70, -1));

        Konfirmasi.setLabel("Konfirmasi");
        Konfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KonfirmasiActionPerformed(evt);
            }
        });
        getContentPane().add(Konfirmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jPanel1.setBackground(new java.awt.Color(41, 83, 127));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JkActionPerformed

    private void alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatActionPerformed

    private void namaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPActionPerformed

    private void TMPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TMPLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TMPLActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HomeP().setVisible(true);
    }//GEN-LAST:event_KembaliActionPerformed

    private void SpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SpsActionPerformed
        // TODO add your handling code here:
        rs.setPasien(Sps.getSelectedItem().toString());
        rs.setSeleksiPasien();
        rs.getBiayapasien();
    }//GEN-LAST:event_SpsActionPerformed

    private void KonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KonfirmasiActionPerformed
        // TODO add your handling code here:
        Isi_total.setText(Long.toString(rs.getTtl()));
    }//GEN-LAST:event_KonfirmasiActionPerformed

    private void DKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DKActionPerformed
        // TODO add your handling code here:
        rs.setDokter(DK.getSelectedItem().toString());
        rs.setSeleksiDokter();
        rs.getBiayaDokter();
    }//GEN-LAST:event_DKActionPerformed

    private void RKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RKActionPerformed
        // TODO add your handling code here:
        rs.setRuang(RK.getSelectedItem().toString());
        rs.setSeleksiRuang();
        rs.getBiayaRuang();
    }//GEN-LAST:event_RKActionPerformed

    private void RWIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RWIActionPerformed
        // TODO add your handling code here:
        rs.setDurasi(DK.getSelectedItem().toString());
        rs.setSeleksiDurasi();
        rs.getBiayadurasi();
    }//GEN-LAST:event_RWIActionPerformed

    private void DaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarActionPerformed
        // TODO add your handling code here:
        simpandata();
    }//GEN-LAST:event_DaftarActionPerformed

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
            java.util.logging.Logger.getLogger(RawatInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RawatInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RawatInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RawatInap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RawatInap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> DK;
    private java.awt.Button Daftar;
    private java.awt.TextField HP;
    private java.awt.TextField Isi_total;
    private javax.swing.JComboBox<String> Jk;
    private java.awt.Button Kembali;
    private java.awt.Button Konfirmasi;
    private javax.swing.JComboBox<String> RK;
    private javax.swing.JComboBox<String> RWI;
    private javax.swing.JComboBox<String> Sps;
    private com.toedter.calendar.JDateChooser TGL_L;
    private java.awt.TextField TMPL;
    private java.awt.TextField alamat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField namaP;
    // End of variables declaration//GEN-END:variables

void simpandata() {
    //Deklarasi variabel
   String namapasien = namaP.getText(); //nama text field di form
    String jeniskelamin = Jk.getSelectedItem().toString();
    String tmpL = TMPL.getText();
    String tgl = new SimpleDateFormat("yyyy-MM-dd").format(TGL_L.getDate());
    String hp = HP.getText();
    String almt = alamat.getText();
    String spas = Sps.getSelectedItem().toString();
    String ruang = RK.getSelectedItem().toString();
    String dokter = DK.getSelectedItem().toString();
    String rawat = RWI.getSelectedItem().toString();
    String total = Isi_total.getText();
    
    //Koneksi terhadap database
    Connection connection = new Koneksi().getConnection();
    
    
    //Proses penyimpanan
    try {
        String sql = "Insert into datarawatinap values(?,?,?,?,?,?,?,?,?,?,?)"; //jumlah sesuai dengan variabel di tabel
      PreparedStatement statement = connection.prepareStatement(sql);
      //connection.prepareStatement(sql);
      
      
      statement.setString(1,namapasien);
      statement.setString(2,jeniskelamin);
      statement.setString(3,tmpL);
      statement.setString(4,tgl);
      statement.setString(5,hp);
      statement.setString(6,almt);
      statement.setString(7,spas);
      statement.setString(8,ruang);
      statement.setString(9,dokter);
      statement.setString(10,rawat);
      statement.setString(11,total);
      
     
      
      statement.executeUpdate();
      
      JOptionPane.showMessageDialog(null, "Berhasil daftar", "informasi", JOptionPane.INFORMATION_MESSAGE);
      
      //Jika data tidak berhasil diinput
      //TampilData();
      //Tambah fungsi refresh
    
    } catch (HeadlessException | SQLException e) {
       // JOptionPane.showMessageDialog(null, "DATA GAGAL DISIMPAN","informasi",);
       //JOptionPane.INFORMATION_MESSAGE;
       JOptionPane.showMessageDialog(null, "Gagal Daftar \n" +e) ; //Gagal menampilkan data
    }
    
    }
}
