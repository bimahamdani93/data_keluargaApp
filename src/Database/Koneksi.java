package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bima dan Zidan
 */
    public class Koneksi {

    public static Connection con;                                               //MENDEKLARASIKAN CONNECTION 

    public static Connection configDB() throws SQLException {                   //MEMBUAT METHOD CONFIG DB UNTUK DIPANGGIL 
        try {
            String url = "jdbc:mysql://localhost/data_keluarga";                //URL MYSQL
            String user = "root";                                               //USER
            String pass = "";                                                   //PASS

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());          //MENDAFTARKAN DRIVER MANAGER
            con = DriverManager.getConnection(url, user, pass);                 //MENYAMBUNGKAN DATABASE DAN DISIMPAN DALAM VAR CON

        } catch (SQLException e) {                                              //JIKA TERDAPAT ERROR DALAM PENYAMBUNGAN DATABASE MAKA
            System.out.println("error on " + e.getMessage());                   //DITAMPILKAN ERROR PADA KONSOL
        }
        return con;                                                             //MERETURN NILAI CON
    }
    
}
