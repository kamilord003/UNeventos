package uneventos;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbosas
 */
public class Conexion {
    public String driver = "com.mysql.jdbc.Driver";
    public String database = "databasemovies";
    public String hostname = "localhost";
    public String port = "3306";
    public String url = "jdbc:mysql://localhost:3306/psicologia";
    public String username = "root";
    public String password = "locomania12";

    public java.sql.Connection conectarMySQL() {
        java.sql.Connection conn = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            if(conn!=null) {
             System.out.println("Conexion Exitosa");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("No se pudo establecer conexion con la base de datos");
        }

        return conn;
    }
}