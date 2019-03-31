package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection konek;
    public static Connection getkoneksi() {
        //cek apakah koneksinya null
        if (konek == null) {
            try {
                String url = "jdbc:mysql://localhost/inventarismansaraya";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                konek = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                JOptionPane.showMessageDialog(null, "gagal koneksi ke database");
            }
        }
        return konek;
    }
}