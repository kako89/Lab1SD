package implementaciones;
import interfaz.*;
import java.rmi.*;
import java.rmi.server.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class interfazServidorImpl extends UnicastRemoteObject implements interfazServidor{

    private ArrayList clientes = new ArrayList();
    

    public interfazServidorImpl() throws RemoteException{
        super();
    }
    //Este método implementa el servicio de iniciar sesión que se definio en la interfaz
    public int inicioSesion(String nombre, String pass) throws RemoteException {
        
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        try {
            ResultSet rs = s.executeQuery ("SELECT rut, id_tipo_usuario, contrasena FROM usuario");
            int columna_rut = rs.findColumn("rut");
            int columna_tipo=rs.findColumn("id_tipo_usuario");
            int columna_pass= rs.findColumn("contrasena");
           
            String nombreDelUsuario;
            String claveDelUsuario;
            String tipoDelUsuario;
            
            int tipo;
            while (rs.next()) { 
                nombreDelUsuario = rs.getString(columna_rut);
                claveDelUsuario = rs.getString(columna_pass);
                if (nombre.equals(nombreDelUsuario)&& pass.equals(claveDelUsuario)){
                    tipoDelUsuario = rs.getString(columna_tipo);
                    tipo=Integer.parseInt(tipoDelUsuario);
                    if(tipo==1){
                        // el usuario es de tipo natural
                        
                        return 1;
                    }
                    else{
                        // el usuario es de tipo administrador
                        
                        return 2;
                    }
                    //con=null; // se cierra la conexion con la base de datos
                    
                }
                
                
                
            }
            
            
            
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return 0; // en caso de no encontrar el usuario
    }
    
    public boolean Registrar( String Nombre, String Paterno, String Materno, String User, String Pass, int tipo )throws RemoteException{
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();

        Statement s;
        s= con.stm;
        
        try {
            int rs = s.executeUpdate ("INSERT INTO usuario VALUES(null,'1','"+Nombre+"','"+Materno+"','"+Paterno+"','"+User+"','"+Pass+"')");
            //System.out.println("lala");
            con=null;// cierra la conexion con la base de datos
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public boolean RegistrarBiblioteca(String NombreBiblioteca, String DireccionBiblioteca){
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        
        try {
            int rs = s.executeUpdate ("INSERT INTO biblioteca VALUES(null,'"+NombreBiblioteca+"','"+DireccionBiblioteca+"')");
            //System.out.println("lala");
            con=null;// cierra la conexion con la base de datos
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public boolean RegistrarAdm(String NombreAdm,String ApPatAdm, String ApMatAdm, String RutAdm, String PassAdm, int tipo){
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        
        try {
            int rs = s.executeUpdate ("INSERT INTO usuario VALUES(null,'2','"+NombreAdm+"','"+ApMatAdm+"','"+ApPatAdm+"', '"+RutAdm+"','"+PassAdm+"')");
            //System.out.println("lala");
            con=null;// cierra la conexion con la base de datos
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public String ConsultarUsuario(String Rut){
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        String resultado="";
        try {
            ResultSet rs = s.executeQuery ("SELECT * FROM usuario WHERE ('"+Rut+"'=usuario.rut)");
            int columna_nombreUsuario = rs.findColumn("nombre_usuario");
            int columna_apellidoPaternoUsuario = rs.findColumn("apellido_paterno");
            int columna_apellidoMaternoUsuario = rs.findColumn("apellido_materno");
            int columna_rutUsuario = rs.findColumn("rut");
            //int columna_direccion=rs.findColumn("direccion");
           
            String nombre_usuario;
            String apellido_paterno;
            String apellido_materno;
            String rut;
            //String direccion;
            
            
            while (rs.next()) { 
                nombre_usuario =rs.getString(columna_nombreUsuario);
                apellido_paterno =rs.getString(columna_apellidoPaternoUsuario);
                apellido_materno =rs.getString(columna_apellidoMaternoUsuario);
                rut =rs.getString(columna_rutUsuario);
                //direccion =rs.getString(columna_direccion);
      
                resultado=resultado + nombre_usuario+";"+ apellido_paterno+";"+ apellido_materno+";"+ rut+";";
                

            }
            
               
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);

        }
       
        return resultado;
    }
    
    public String ListadoBiblios(){
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        String resultado="";
        try {
            ResultSet rs = s.executeQuery ("SELECT nombre_biblioteca FROM biblioteca");
            int columna_nombre = rs.findColumn("nombre_biblioteca");
           
            String nombre_biblioteca;
            
            
            while (rs.next()) { 
                nombre_biblioteca =rs.getString(columna_nombre);
      
                resultado=resultado + nombre_biblioteca+";";
                System.out.println(resultado+"\n");

            }
            
               
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);

        }
       
        return resultado;
        
         
    }
    
   public String MostrarBiblio(String Nombre){
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        String resultado="";
        try {
            ResultSet rs = s.executeQuery ("SELECT nombre_biblioteca,direccion FROM biblioteca WHERE ('"+Nombre+"'=biblioteca.nombre_biblioteca)");
            int columna_nombre = rs.findColumn("nombre_biblioteca");
            int columna_direccion=rs.findColumn("direccion");
           
            String nombre_biblioteca;
            String direccion;
            
            
            while (rs.next()) { 
                nombre_biblioteca =rs.getString(columna_nombre);
                direccion =rs.getString(columna_direccion);
      
                resultado=resultado + nombre_biblioteca+";"+ direccion+ ";";
                

            }
            
               
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);

        }
       
        return resultado;
    }
   // muestra que biblioteca tiene determinado libro
   
   public String MostrarBiblioLibro(String Nombre){
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        String resultado="";
        try {
            ResultSet rs = s.executeQuery ("SELECT * FROM libro,biblioteca,biblioteca_libro WHERE ('"+Nombre+"'=libro.titulo AND libro.id_libro=biblioteca_libro.id_libro AND biblioteca.id_biblioteca=biblioteca_libro.id_biblioteca)");
            int columna_nombre = rs.findColumn("nombre_biblioteca");
            int columna_direccion = rs.findColumn("direccion");
           
            String nombre_biblioteca;
            String direccion_biblioteca;
            
            while (rs.next()) { 
                nombre_biblioteca =rs.getString(columna_nombre);
                direccion_biblioteca =rs.getString(columna_direccion);
                
                resultado=resultado + nombre_biblioteca+";"+ direccion_biblioteca+";";
                

            }
            
               
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);

        }
       
        return resultado;
    } 
   
   public boolean EliminarUsuario(String RUT){
       Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        
        try {
            int rs = s.executeUpdate ("DELETE  FROM usuario WHERE('"+RUT+"'= usuario.rut)");
            
            con=null;// cierra la conexion con la base de datos
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
   }

   public boolean EliminarBiblioteca(String Nombre){
       Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        
        try {
            int rs = s.executeUpdate ("DELETE  FROM biblioteca WHERE('"+Nombre+"'= biblioteca.nombre_biblioteca)");
            
            con=null;// cierra la conexion con la base de datos
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
   }
   
   public boolean IngresarLibro(String NombreBiblio, String Titulo, int copias){
        String id_libro="";
        String id_biblioteca="";
        
       
       
        Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s1;
        Statement s2;
        Statement s3;
        Statement s4;
        
        s1= con.stm;
        s2=con.stm;
        s3=con.stm;
        s4=con.stm;
        
        // se hace la insercion en la tabla libro
         try {
            int rs = s1.executeUpdate ("INSERT INTO libro VALUES(null,'"+Titulo+"','"+copias+"')");
             System.out.println("Hizo el primer try");
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         // se guarda el identificador del la reciente insercion
        try{
            ResultSet rs2 = s2.executeQuery ("SELECT id_libro FROM libro WHERE ('"+Titulo+"'=libro.titulo)");
            int columna_id = rs2.findColumn("id_libro");
            
            System.out.println("Hizo segundo try");
            
            
            while (rs2.next()) { 
                id_libro =rs2.getString(columna_id);
                System.out.println("id_libro es "+ id_libro);
                           
            }
            
            
            
        }catch (SQLException ex){
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //se guarda el identificador de la biblioteca
        try{
            ResultSet rs3 = s3.executeQuery ("SELECT id_biblioteca FROM biblioteca WHERE ('"+NombreBiblio+"'=biblioteca.nombre_biblioteca)");
            int columna_nombreBiblio = rs3.findColumn("id_biblioteca");
            System.out.println("Hizo tercer try");
         
            
            while (rs3.next()) { 
                id_biblioteca =rs3.getString(columna_nombreBiblio);
                System.out.println("id_biblioteca es "+id_biblioteca);     
            }
            
            
            
            
        }catch (SQLException ex){
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         try {
            int rs4 = s4.executeUpdate ("INSERT INTO biblioteca_libro VALUES('"+id_biblioteca+"','"+id_libro+"')");
             System.out.println("Hizo cuarto try");
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         if (id_biblioteca!=null && id_libro!=null){
             return true;
         }
         else{
             return false;
         }
        
        
        
   }
   
   public String MostrarLibrosBiblio(String Nombre){
       Conexion con= new Conexion("root", "", "biblioteca", "localhost");
        con.conectar();
        
        Statement s;
        s= con.stm;
        String resultado="";
        try {
            
            ResultSet rs = s.executeQuery ("SELECT * FROM libro,biblioteca,biblioteca_libro WHERE ('"+Nombre+"'=biblioteca.nombre_biblioteca AND libro.id_libro=biblioteca_libro.id_libro AND biblioteca.id_biblioteca=biblioteca_libro.id_biblioteca)");
            int columna_libro = rs.findColumn("titulo");
            int columna_copias = rs.findColumn("numero_copias");
             
            String nombre_libro;
            String numero_copias;
                
            while (rs.next()) { 

                nombre_libro =rs.getString(columna_libro);
                numero_copias=rs.getString(columna_copias);
      
                resultado=resultado + nombre_libro+";"+ numero_copias+";";
                

            }
            
               
            
        }catch (SQLException ex) {
            Logger.getLogger(interfazServidorImpl.class.getName()).log(Level.SEVERE, null, ex);

        }
       
        return resultado;
       
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
                    String Datos=new String();
                    Datos=this.ConsultarUsuario(Nombre);
                    String[] resultadoConsulta=Datos.split(";");
                    nextClient.notificar("SE CONECTO "+resultadoConsulta[0]);
                }
            }
        }
    }
    
    public synchronized void mensajeCliente(interfazCliente cliente, String Nombre) throws RemoteException{
            //clientes.add(cliente);
            //clientesNombre.addElement(Nombre);
            for (int i=0;i<clientes.size();i++){
                interfazCliente nextClient = (interfazCliente)clientes.get(i);
                        //Mando la notificacion de que se conecto otro usuario
                nextClient.notificar(Nombre);
                System.out.println("lala");
                
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
