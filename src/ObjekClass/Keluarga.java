package ObjekClass;

import Database.Koneksi;
import TreeClass.Tree;
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
public class Keluarga {

    private String nomorKK;
    private String kepalaKeluarga;
    private String ibu;
    private String anak1;
    private String anak2;
    private String anak3;
    private String alamat;

    public String getNomorKK() {
        return nomorKK;
    }

    public void setNomorKK(String nomorKK) {
        this.nomorKK = nomorKK;
    }

   

   

    public String getKepalaKeluarga() {
        return kepalaKeluarga;
    }

    public void setKepalaKeluarga(String kepalaKeluarga) {
        this.kepalaKeluarga = kepalaKeluarga;
    }

    public String getAnak1() {
        return anak1;
    }

    public void setAnak1(String anak1) {
        this.anak1 = anak1;
    }

    public String getAnak2() {
        return anak2;
    }

    public void setAnak2(String anak2) {
        this.anak2 = anak2;
    }

    public String getAnak3() {
        return anak3;
    }

    public void setAnak3(String anak3) {
        this.anak3 = anak3;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void simpan() {
        try {

            String url = "INSERT INTO keluarga VALUES (?,?,?,?,?,?,?)";
            Connection conn = (Connection) Koneksi.configDB();                                          //MENGKONEKSIKAN KE DATABASE
            PreparedStatement stm = conn.prepareStatement(url);                                         //MEMBUAT STATEMENT DATABASE
            stm.setString(1, getNomorKK());
            stm.setString(2, getKepalaKeluarga());
            stm.setString(3, getIbu());
            stm.setString(4, getAnak1());
            stm.setString(5, getAnak2());
            stm.setString(6, getAnak3());
            stm.setString(7, getAlamat());

            stm.execute();                                                                              //MENGEKSEKUSI STATEMENT

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");                              //MENAMPILKAN JOPTION DENGAN TAMPILAN "DATA BERHASIL DISIMPAN"
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
    }

    public void cari() {
        try {
            String sql = "SELECT * FROM keluarga WHERE nomor_kk = '" + getNomorKK()+ "'";
            Connection conn = (Connection) Koneksi.configDB();
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);

            if (rs.next()) {

                setNomorKK(rs.getString("nomor_kk"));
                setKepalaKeluarga(rs.getString("kepala_keluarga"));
                setIbu(rs.getString("ibu"));
                setAnak1(rs.getString("anak1"));
                setAnak2(rs.getString("anak2"));
                setAnak3(rs.getString("anak3"));
                setAlamat(rs.getString("alamat"));

            } else {
                JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public String TampilkanSilsilah() {
        
        Tree theTree = new Tree();
        theTree.insert(50, getNomorKK());
        theTree.insert(25, getKepalaKeluarga());
        theTree.insert(75, getIbu());
        theTree.insert(15, getAnak1());
        theTree.insert(40, getAnak2());
        theTree.insert(60, getAnak3());
        
        String tampil = "Silsilah Bapak "+getKepalaKeluarga()+"\n\n"+theTree.displayTree();
        return tampil;
    }

}
