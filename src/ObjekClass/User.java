package ObjekClass;

import Database.Koneksi;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Zidan
 */
public class User {

    private String username;
    private String password;
    private String posisi;

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void simpan() {
        try {

            String url = "INSERT INTO user VALUES (?,?)";
            Connection conn = (Connection) Koneksi.configDB();                                          //MENGKONEKSIKAN KE DATABASE
            PreparedStatement stm = conn.prepareStatement(url);                                         //MEMBUAT STATEMENT DATABASE
            stm.setString(1, getUsername());
            stm.setString(2, getPassword());

            stm.execute();                                                                              //MENGEKSEKUSI STATEMENT

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");                              //MENAMPILKAN JOPTION DENGAN TAMPILAN "DATA BERHASIL DISIMPAN"
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Gunakan Nama atau Password lain");
        }
    }

    public void cariUser() {
        try {
            String sql = "SELECT * FROM user WHERE Username = '" + getUsername() + "'" + 
                    "AND Password = '" + getPassword() + "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {
                setUsername(rs.getString("Username"));
                setPassword(rs.getString("Password"));
                setPosisi("User");
                

            } else {
            
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void cariAdmin() {
        try {
            String sql = "SELECT * FROM admin WHERE adminName = '" + getUsername() + "'" + 
                    "AND Password = '" + getPassword() + "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {
                setUsername(rs.getString("adminName"));
                setPassword(rs.getString("Password"));
                setPosisi("Admin");

            } else {
               
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void cari() {
        try {
            String sql = "SELECT * FROM admin WHERE adminName != '" + getUsername() + "'" + 
                    "OR Password != '" + getPassword() + "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {
               
                setPosisi("Tidakditemukan");

            } else {
               
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    

}
