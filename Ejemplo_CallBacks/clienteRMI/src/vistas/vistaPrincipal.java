package vistas;
import clientermi.conexionRMI;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import interfaz.*;


public class vistaPrincipal extends javax.swing.JFrame {

    /**
     * @return the aux
     */
    public static String getAux() {
        return aux;
    }

    /**
     * @param aAux the aux to set
     */
    public static void setAux(String aAux) {
        aux = aAux;
    }
    private conexionRMI conexion = new conexionRMI();
    private static String aux;

    public vistaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelNombre = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        LabelPass = new javax.swing.JLabel();
        ButtonIngresar = new javax.swing.JButton();
        Registro = new javax.swing.JButton();
        TextFieldPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplo Cliente RMI");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio de Sesión"));

        LabelNombre.setText("Rut sin verificador:");

        TextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextFieldNombreKeyTyped(evt);
            }
        });

        LabelPass.setText("Contraseña:");

        ButtonIngresar.setText("Ingresar");
        ButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresar(evt);
            }
        });
        ButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonIngresarActionPerformed(evt);
            }
        });

        Registro.setText("Registrese");
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelPass)
                    .addComponent(LabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Registro))
                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(TextFieldPass))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre)
                    .addComponent(TextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPass)
                    .addComponent(TextFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonIngresar)
                    .addComponent(Registro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresar(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar
        //Recuperamos nombre y pass de la vista
        String Nombre = this.TextFieldNombre.getText();
        setAux(Nombre);
        String Pass = this.TextFieldPass.getText();
        try {
            //Intentamos conectarnos con el servidor
            //Si hay exito empezamos a consumir servicios
            if (conexion.iniciarRegistry()){
                
                int ValorRetorno=conexion.getServidor().inicioSesion(Nombre, Pass);
                if (ValorRetorno==1){
                    //new vistaInicio().setVisible(true);
                    this.setVisible(false);
                    
                    new vistaInicio().setVisible(true);
                    
                   
                    // registro dentro del servidor para el chat
                    conexion.registrarCliente(Nombre);
                    
                }
                if (ValorRetorno ==2){
                    //new vistaSecundaria().setVisible(true);
                    //new vistaInicioAdm().setVisible(true);
                    this.setVisible(false);
                    new vistaInicioAdm().setVisible(true);
                            
                    //Registro dentro del servidor para el chat
                    conexion.registrarCliente(Nombre);
                                        
                    
                }
                if (ValorRetorno==0){
                    JOptionPane.showMessageDialog(this, "Nombre y/o Contraseña Inválida", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo Conectar", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }


        } catch (RemoteException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ingresar

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        this.setVisible(false);
        vistaRegistro Vista=new vistaRegistro();
        Vista.setVisible(true);
        
        
        
        
       
       
            
        
    }//GEN-LAST:event_RegistroActionPerformed

    private void ButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonIngresarActionPerformed

    private void TextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldNombreKeyTyped
        // Validación paara el RUT.
        
    }//GEN-LAST:event_TextFieldNombreKeyTyped
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonIngresar;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JButton Registro;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JPasswordField TextFieldPass;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
