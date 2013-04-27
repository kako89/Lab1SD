package implementaciones;
import interfaz.*;
import java.rmi.*;
import java.rmi.server.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class interfazServidorImpl extends UnicastRemoteObject implements interfazServidor{

    private ArrayList clientes = new ArrayList();

    public interfazServidorImpl() throws RemoteException{
        super();
    }
    //Este método implementa el servicio de iniciar sesión que se definio en la interfaz
    public boolean inicioSesion(String nombre, String pass) throws RemoteException {
        
        Conexion con= new Conexion("root", "", "violadores", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        try {
            ResultSet rs = s.executeQuery ("select nombre_usuario, contrasena from usuario");
            int columna_nombre = rs.findColumn("nombre_usuario");
            int columna_pass= rs.findColumn("contrasena");
            while (rs.next()) { 
                String nombreDelUsuario = rs.getString(columna_nombre);
                String claveDelUsuario = rs.getString(columna_pass);
                if (nombre.equals(nombreDelUsuario)&& pass.equals(claveDelUsuario)){
                    return true;
                }
                else{
                    return false;
                }
            }
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }
    //Este método registra clientes que se conectan
    public synchronized void registrarCliente(interfazCliente cliente, String Nombre) throws RemoteException{
        if (!(clientes.contains(cliente))) {
            clientes.add(cliente);
            //clientesNombre.addElement(Nombre);
            for (int i=0;i<clientes.size();i++){
                interfazCliente nextClient = (interfazCliente)clientes.get(i);
                if (!cliente.toString().equals(nextClient.toString())){
                    //Mando la notificacion de que se conecto otro usuario
                    nextClient.notificar("Se CONECTO "+Nombre);
                }
            }
        }
    }
    //Este método elimina clientes y notifica la desconexion de alguno.
    public synchronized void desregistrarCliente(interfazCliente cliente, String Nombre) throws RemoteException{
        if (clientes.remove(cliente)) {
            //clientesNombre.removeElement(Nombre);
            for (int i=0;i<clientes.size();i++){
                interfazCliente nextClient = (interfazCliente)clientes.get(i);
                //Mando la notificacion de que se conecto otro usuario
                nextClient.notificar("Se DESCONECTO "+Nombre);
            }
        }
        else{
            System.out.print("Cliente no estaba registrado");
        }
    }
}
