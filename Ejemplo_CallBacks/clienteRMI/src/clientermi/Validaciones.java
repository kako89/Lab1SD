/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clientermi;

/**
 *
 * @author Marco
 */
public class Validaciones {
    String rut;

    public Validaciones() {
    }
    
   
     public  void setRut(String Rut) {
        rut = Rut;
    }   
     
    public boolean ValidacionRut(String rut) {
        
      String[] digitos;
      int rutEntero;
      int verific;
      
      if (rut.length()>0){
        digitos=rut.split("-");
        
        rutEntero=Integer.parseInt(digitos[0]);
        System.out.println(rutEntero+"\n");
        if (digitos[1].equals("k") || digitos[1].equals("K")){
            String num="1";
            verific='K';
        } 
        else{
            verific=(char)(digitos[1].charAt(0));
        }
        
        System.out.println(verific+"\n");
        int m = 0, s = 1;
        /*if(digitos[0].length()>=2){
            return false;
        }*/
        
        for (; rutEntero != 0; rutEntero /= 10)
        {
            s = (s + rutEntero % 10 * (9 - m++ % 6)) % 11;
        }
        return verific == (char) (s != 0 ? s + 47 : 75);
        
      }
      else{
          return false;
      }
        
     
}
}
 
    
