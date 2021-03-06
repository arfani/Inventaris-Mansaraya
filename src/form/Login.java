
package form;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import koneksi.Koneksi;

@SuppressWarnings("serial")
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();

        jTextField1.setFocusAccelerator('u');
        jLabel2.setDisplayedMnemonic('u');
        jPasswordField1.setFocusAccelerator('p');
        jLabel4.setDisplayedMnemonic('p');
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
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventaris MANSARAYA"); // NOI18N
        setFont(new java.awt.Font("Lucida Handwriting", 0, 10)); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOG IN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 282, -1));

        jLabel2.setFont(new java.awt.Font("Abyssinica SIL", 0, 14)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTextField1.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, 25));

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 0, 14)); // NOI18N
        jLabel4.setText("Password");
        jLabel4.setName("pass"); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 92, -1));

        jPasswordField1.setFont(new java.awt.Font("Abyssinica SIL", 0, 15)); // NOI18N
        jPasswordField1.setMargin(new java.awt.Insets(0, 2, 2, 2));
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 210, 25));

        jButtonLogin.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/s_rights.png"))); // NOI18N
        jButtonLogin.setText("LOG IN");
        jButtonLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 102, 30));

        jButtonCancel.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/error.png"))); // NOI18N
        jButtonCancel.setText("CANCEL");
        jButtonCancel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonCancel.setPreferredSize(new java.awt.Dimension(101, 28));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 102, 30));

        jLabel6.setFont(new java.awt.Font("Abyssinica SIL", 0, 12)); // NOI18N
        jLabel6.setText("Created by");
        jLabel6.setName("pass"); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 65, -1));

        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Arfani Hidayat");
        jLabel3.setName("pass"); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Login.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 120, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 1, 14));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setFont(new java.awt.Font("Abyssinica SIL", 0, 12));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        try {
            Desktop desktop = Desktop.getDesktop();
            URI url = new URI("https://www.facebook.com/muhammadarfanihidayat");
            if (Desktop.isDesktopSupported()) {
                try {
                    desktop.browse(url);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error ngelink\n" + ex.getMessage());
                    //Logger.getLogger(FormCopy.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "URL salah\n" + ex.getMessage());
            //Logger.getLogger(FormCopy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        int keluar = JOptionPane.showConfirmDialog(null,
            "Keluar?",
            "Konfirmasi..",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        if (keluar == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        try {
            Connection c = Koneksi.getkoneksi();
            Statement s = c.createStatement();

            @SuppressWarnings("deprecation")
            String sql = "Select * from user where username like binary '" + jTextField1.getText() + "' and password like binary '" + jPasswordField1.getText() + "'";
            ResultSet rs = s.executeQuery(sql);

            if (rs.next()) {
                new Utama().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Username dan Password Salah");
                jTextField1.requestFocus();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error Login\n"
                + "Pesan Error: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Aktifkan XAMPP\n"
                + "Pesan Error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButtonLogin.requestFocus();
            jButtonLoginActionPerformed(null);
        }
    }//GEN-LAST:event_jPasswordField1KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jPasswordField1.requestFocus();
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

//         set tema
//        try {
//            UIManager.setLookAndFeel(new AcrylLookAndFeel());
//
//        } catch (UnsupportedLookAndFeelException e) {
//            JOptionPane.showMessageDialog(null, "error tema jtatto");
//        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
