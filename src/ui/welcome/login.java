/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.welcome;


import ObjekClass.User;
import javax.swing.JOptionPane;
import ui.admin.welcome;
import ui.warga.welcome_warga;

/**
 *
 * @author Zidan
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    User Data = new User();

    public void empty_data() {
        User_Field.setText("");
        Pass_Field.setText("");

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
        Keluarga = new javax.swing.JLabel();
        Informasi = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        Pass_Field = new javax.swing.JPasswordField();
        User_Field = new javax.swing.JTextField();
        Lbl_Daftar = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        belumpunyaakun = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Data Penduduk");
        setLocation(new java.awt.Point(350, 80));

        jPanel1.setBackground(new java.awt.Color(0, 0, 54));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Keluarga.setFont(new java.awt.Font("Futura Bk BT", 0, 64)); // NOI18N
        Keluarga.setForeground(new java.awt.Color(255, 255, 255));
        Keluarga.setText("Keluarga");
        jPanel1.add(Keluarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        Informasi.setFont(new java.awt.Font("Futura Bk BT", 0, 64)); // NOI18N
        Informasi.setForeground(new java.awt.Color(255, 255, 255));
        Informasi.setText("Informasi");
        jPanel1.add(Informasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo.png"))); // NOI18N
        jPanel1.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        btn_login.setBackground(new java.awt.Color(39, 174, 96));
        btn_login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("Masuk");
        btn_login.setBorder(null);
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 460, 380, 90));

        Pass_Field.setFont(new java.awt.Font("Anonymous Pro", 0, 24)); // NOI18N
        Pass_Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pass_Field.setBorder(null);
        jPanel1.add(Pass_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 460, 80));

        User_Field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        User_Field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        User_Field.setBorder(null);
        User_Field.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(User_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 460, 85));

        Lbl_Daftar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Lbl_Daftar.setForeground(new java.awt.Color(255, 255, 255));
        Lbl_Daftar.setText("Daftar");
        Lbl_Daftar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Lbl_DaftarMouseClicked(evt);
            }
        });
        jPanel1.add(Lbl_Daftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 580, -1, -1));

        username.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, -1, -1));

        password.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password");
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, -1, -1));

        belumpunyaakun.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        belumpunyaakun.setForeground(new java.awt.Color(255, 255, 255));
        belumpunyaakun.setText("Belum punya akun?");
        jPanel1.add(belumpunyaakun, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 580, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/BackGround_Kota.png"))); // NOI18N
        jPanel1.add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Lbl_DaftarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_DaftarMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new ui.welcome.regis().setVisible(true);
    }//GEN-LAST:event_Lbl_DaftarMouseClicked

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        Data.setUsername(User_Field.getText());
        Data.setPassword(Pass_Field.getText());
        Data.cariAdmin();
        Data.cari();
        Data.cariUser();
        

        if (User_Field.getText().equals("")
                || String.valueOf(Pass_Field.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(this, "Form Login Tidak Boleh Kosong", "alert..!",
                    JOptionPane.ERROR_MESSAGE);
        } else if (Data.getPosisi().equals("Admin")) {
            JOptionPane.showMessageDialog(null, "Login Berhasil `Anda sebagai Admin`",
                    "succes", JOptionPane.INFORMATION_MESSAGE);
            welcome welcom = new welcome();
            welcom.setVisible(true);
            dispose();
        } else if (Data.getPosisi().equals("User")) {
            JOptionPane.showMessageDialog(null, "Login Berhasil `Anda sebagai User`",
                    "succes", JOptionPane.INFORMATION_MESSAGE);
            welcome_warga welcom1 = new welcome_warga();
            welcom1.setVisible(true);
            dispose();
        } else if (Data.getPosisi().equals("Tidakditemukan")){
            JOptionPane.showMessageDialog(this,
                    "Username atau Password salah",
                    "Login Error", JOptionPane.ERROR_MESSAGE);
            empty_data();
        }


    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Informasi;
    private javax.swing.JLabel Keluarga;
    private javax.swing.JLabel Lbl_Daftar;
    private javax.swing.JLabel Logo;
    private javax.swing.JPasswordField Pass_Field;
    private javax.swing.JTextField User_Field;
    private javax.swing.JLabel belumpunyaakun;
    private javax.swing.JButton btn_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}