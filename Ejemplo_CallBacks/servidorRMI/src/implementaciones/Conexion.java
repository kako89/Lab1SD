/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Marco
 */
public class Conexion {
    private String user;
    private String password;
    private String db;
    private String host;
    private String url;
    public Connection conn = null;
    public Statement stm;
    private ResultSet rs;
    
    
    public Conexion(String usuario, String contraseña, String bd, String servidor){
        this.user = usuario;
        this.password = contraseña;
        this.db = bd;
        this.host = servidor;
        this.url = "jdbc:mysql://" + this.host + "/" + this.db;
    }
    
    public void conectar(){
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null){
                System.out.println("Conexión a base de datos "+url+" ... Ok");
                stm = conn.createStatement();
            }
        }
        catch(SQLException ex) {
            System.out.println("Hubo un problema al intentar conectarse con la base de datos "+url);
        }
        catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
     }
    
    public void consultar() throws SQLException{
        rs = stm.executeQuery("SELECT nombre_usuario FROM usuario");
        while(rs.next()){
            
        }
    }
}
