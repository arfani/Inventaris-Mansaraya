package form;

import formbarang.Cek;
import formbarang.InputBarang;
import formbarang.KelolaBarang;
import gedung.Gedung;
import gedung.Ruangan;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import koneksi.Koneksi;

@SuppressWarnings("serial")
public class Utama extends javax.swing.JFrame {

    public Utama() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        user = new javax.swing.JMenu();
        username = new javax.swing.JMenuItem();
        password = new javax.swing.JMenuItem();
        Login = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        keluar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        gedung = new javax.swing.JMenuItem();
        ruangan = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        inputBarang = new javax.swing.JMenuItem();
        editBarang = new javax.swing.JMenuItem();
        cekBarang = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        program = new javax.swing.JMenuItem();
        programmer = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setPreferredSize(new java.awt.Dimension(690, 455));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("INVENTORY OF MANSARAYA");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Untitled-1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 70));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Lucida Handwriting", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/CYMERA_20150326_134531.jpg"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        user.setText("User");
        user.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N

        username.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        username.setText("Ubah Username");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        user.add(username);

        password.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        password.setText("Ubah Password");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        user.add(password);

        Login.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        Login.setText("Log in");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        user.add(Login);
        user.add(jSeparator1);

        keluar.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        user.add(keluar);

        jMenuBar1.add(user);

        jMenu3.setText("Bangunan");
        jMenu3.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N

        gedung.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        gedung.setText("Gedung");
        gedung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gedungActionPerformed(evt);
            }
        });
        jMenu3.add(gedung);

        ruangan.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        ruangan.setText("Ruangan");
        ruangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruanganActionPerformed(evt);
            }
        });
        jMenu3.add(ruangan);

        jMenuBar1.add(jMenu3);

        jMenu2.setText("Barang");
        jMenu2.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N

        inputBarang.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        inputBarang.setText("Input Barang");
        inputBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBarangActionPerformed(evt);
            }
        });
        jMenu2.add(inputBarang);

        editBarang.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        editBarang.setText("Kelola Barang");
        editBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBarangActionPerformed(evt);
            }
        });
        jMenu2.add(editBarang);

        cekBarang.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        cekBarang.setText("Cek Barang");
        cekBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekBarangActionPerformed(evt);
            }
        });
        jMenu2.add(cekBarang);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Tentang");
        jMenu4.setFont(new java.awt.Font("Abyssinica SIL", 1, 14)); // NOI18N

        program.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        program.setText("Program");
        program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programActionPerformed(evt);
            }
        });
        jMenu4.add(program);

        programmer.setFont(new java.awt.Font("Abyssinica SIL", 1, 12)); // NOI18N
        programmer.setText("Programmer");
        programmer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programmerActionPerformed(evt);
            }
        });
        jMenu4.add(programmer);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        int keluarr = JOptionPane.showConfirmDialog(null,
                "Keluar ?",
                "Konfirmasi keluar..",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (keluarr == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_keluarActionPerformed

    private void programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programActionPerformed
        JOptionPane.showMessageDialog(null,
                "Program Aplikasi Inventaris MANSARAYA adalah program yang dibangun oleh "
                + "mahasiswa AMIKOM MATARAM\n yang sedang melaksanakan Praktik Kerja Lapangan pada MAN 1 PRAYA.\n"
                + "Semoga program aplikasi ini dapat membantu dalam mengelola barang inventaris pada MAN 1 PRAYA.",
                "Inventaris Barang MANSARAYA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_programActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        new UbahPass().setVisible(true);
        dispose();
    }//GEN-LAST:event_passwordActionPerformed

    @SuppressWarnings("deprecation")
    private void inputBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBarangActionPerformed
        JPasswordField passwordField = new JPasswordField();
        Object[] obj = {"Masukkan Password \n", passwordField};
        Object stringArray[] = {"OK", "Cancel"};
        int a = JOptionPane.showOptionDialog(null, obj, "Autentikasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, obj);
        if (a == JOptionPane.OK_OPTION) {
            try {
                Connection c = Koneksi.getkoneksi();
                Statement s = c.createStatement();

                String sql = "select*from user";
                try (ResultSet rs = s.executeQuery(sql)) {
                    if (rs.next()) {
                        String pass = rs.getString("password");
                        if (passwordField.getText().equals(pass)) {
                            new InputBarang().setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Password salah!!");
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error\n" + e.getMessage());
            } catch (NullPointerException e) {
            }
        }
    }//GEN-LAST:event_inputBarangActionPerformed

    @SuppressWarnings("deprecation")
    private void editBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBarangActionPerformed
        JPasswordField passwordField = new JPasswordField();
        Object[] obj = {"Masukkan Password \n", passwordField};
        Object stringArray[] = {"OK", "Cancel"};
        int a = JOptionPane.showOptionDialog(null, obj, "Autentikasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, obj);
        if (a == JOptionPane.OK_OPTION) {
            try {
                Connection c = Koneksi.getkoneksi();
                Statement s = c.createStatement();

                String sql = "select*from user";
                try (ResultSet rs = s.executeQuery(sql)) {
                    if (rs.next()) {
                        String pass = rs.getString("password");
                        if (passwordField.getText().equals(pass)) {
                            new KelolaBarang().setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Password salah!!");
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error\n" + e.getMessage());
            } catch (NullPointerException e) {
            }
        }
    }//GEN-LAST:event_editBarangActionPerformed

    private void cekBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekBarangActionPerformed
        new Cek().setVisible(true);
        dispose();
    }//GEN-LAST:event_cekBarangActionPerformed

    @SuppressWarnings("deprecation")
    private void ruanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruanganActionPerformed
        JPasswordField passwordField = new JPasswordField();
        Object[] obj = {"Masukkan Password \n", passwordField};
        Object stringArray[] = {"OK", "Cancel"};
        int a = JOptionPane.showOptionDialog(null, obj, "Autentikasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, obj);
        if (a == JOptionPane.OK_OPTION) {
            try {
                Connection c = Koneksi.getkoneksi();
                Statement s = c.createStatement();

                String sql = "select*from user";
                try (ResultSet rs = s.executeQuery(sql)) {
                    if (rs.next()) {
                        String pass = rs.getString("password");
                        if (passwordField.getText().equals(pass)) {
                            new Ruangan().setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Password salah!!");
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error\n" + e.getMessage());
            } catch (NullPointerException e) {
            }
        }
    }//GEN-LAST:event_ruanganActionPerformed

    @SuppressWarnings("deprecation")
    private void gedungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gedungActionPerformed
        JPasswordField passwordField = new JPasswordField();
        Object[] obj = {"Masukkan Password \n", passwordField};
        Object stringArray[] = {"OK", "Cancel"};
        int a = JOptionPane.showOptionDialog(null, obj, "Autentikasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, stringArray, obj);
        if (a == JOptionPane.OK_OPTION) {
            try {
                Connection c = Koneksi.getkoneksi();
                Statement s = c.createStatement();

                String sql = "select*from user";
                try (ResultSet rs = s.executeQuery(sql)) {
                    if (rs.next()) {
                        String pass = rs.getString("password");
                        if (passwordField.getText().equals(pass)) {
                            new Gedung().setVisible(true);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Password salah!!");
                        }
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error\n" + e.getMessage());
            } catch (NullPointerException e) {
            }
        }
    }//GEN-LAST:event_gedungActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        new UbahUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_usernameActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_LoginActionPerformed

    private void programmerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programmerActionPerformed
        new programmer().setVisible(true);
        dispose();
    }//GEN-LAST:event_programmerActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Login;
    private javax.swing.JMenuItem cekBarang;
    private javax.swing.JMenuItem editBarang;
    private javax.swing.JMenuItem gedung;
    private javax.swing.JMenuItem inputBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem keluar;
    private javax.swing.JMenuItem password;
    private javax.swing.JMenuItem program;
    private javax.swing.JMenuItem programmer;
    private javax.swing.JMenuItem ruangan;
    private javax.swing.JMenu user;
    private javax.swing.JMenuItem username;
    // End of variables declaration//GEN-END:variables
}
