package interfaz;
import java.rmi.*;

public interface interfazServidor extends Remote{
    public boolean inicioSesion(String nombre, String pass) throws RemoteException;
    public boolean Registrar( String Nombre, String Paterno, String Materno, String User, String Pass, int tipo ) throws RemoteException;
    public void registrarCliente(interfazCliente cliente, String Nombre) throws RemoteException;
    public void desregistrarCliente(interfazCliente cliente, String Nombre) throws RemoteException;
}
