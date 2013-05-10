package interfaz;
import java.rmi.*;
import java.util.Vector;

public interface interfazServidor extends Remote{
    public String MostrarLibrosBiblio(String Nombre) throws RemoteException;
    public boolean EliminarUsuario(String RUT) throws RemoteException;
    public String ListadoBiblios() throws RemoteException;
    public String ConsultarUsuario(String RutUsuario)throws RemoteException;
    public int inicioSesion(String nombre, String pass) throws RemoteException;
    public boolean RegistrarAdm(String NombreAdm,String ApPatAdm, String ApMatAdm, String RutAdm, String PassAdm, int tipo) throws RemoteException;
    public boolean RegistrarBiblioteca(String NombreBiblioteca, String DireccionBiblioteca)throws RemoteException;
    public void registrarCliente(interfazCliente cliente, String Nombre) throws RemoteException;
    public void desregistrarCliente(interfazCliente cliente, String Nombre) throws RemoteException;
    public boolean Registrar(String Nombre, String Paterno, String Materno, String User, String Pass, int i);
    public void mensajeCliente(interfazCliente cliente, String Nombre) throws RemoteException;
    public String MostrarBiblio(String Nombre) throws RemoteException;
    public boolean EliminarBiblioteca(String Nombre) throws RemoteException;
    public boolean IngresarLibro(String NombreBiblio, String Titulo, int copias)throws RemoteException;
    public String MostrarBiblioLibro(String Libro) throws RemoteException;
    public String ListadoLibros() throws RemoteException;
    public boolean IngresoComentario(String rut, String seleccionado, String comentario)throws RemoteException;
    public String MostrarComentarios(String seleccionado)throws RemoteException;
    public String ConsultarUsuarioE(String Rut)throws RemoteException;
    public boolean ActualizarUsuario (String Nombre, String ApPaterno, String ApMaterno, String RUT, String RutAnterior, int tipo)throws RemoteException;
    public boolean CambiarContrasena( String rut, String PassAnterior, String PassNueva)throws RemoteException;
    public int retornarInicio(String rut)throws RemoteException;
}
