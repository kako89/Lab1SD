/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clientermi.Validaciones;
import clientermi.conexionRMI;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class vistaRegistro extends javax.swing.JFrame {
    String NombreReal;
    String Paterno;
    String Materno;
    String User;
    String Pass;
    String Cpass;
    public conexionRMI conexion = new conexionRMI();
    /**
     * Creates new form vistaRegistro
     */
    public vistaRegistro() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IngresoNombre = new javax.swing.JTextField();
        IngresoPaterno = new javax.swing.JTextField();
        IngresoMaterno = new javax.swing.JTextField();
        IngresoUser = new javax.swing.JTextField();
        IngresoPass = new javax.swing.JPasswordField();
        IngresoCPass = new javax.swing.JPasswordField();
        AceptarRegistro = new javax.swing.JButton();
        CancelarRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IngresoDeIP = new javax.swing.JTextField();
        BotonVolverLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese sus datos para el registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14))); // NOI18N

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Apellido Materno: ");

        jLabel5.setText("RUT: ");

        jLabel6.setText("Contraseña: ");

        jLabel7.setText("Confirmar Contraseña: ");

        IngresoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoUserActionPerformed(evt);
            }
        });

        IngresoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoPassActionPerformed(evt);
            }
        });

        AceptarRegistro.setText("Aceptar");
        AceptarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarRegistroActionPerformed(evt);
            }
        });

        CancelarRegistro.setText("Cancelar");
        CancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarRegistroActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingreso IP:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(AceptarRegistro)
                .addGap(31, 31, 31)
                .addComponent(CancelarRegistro)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IngresoCPass)
                    .addComponent(IngresoPaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresoMaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresoUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresoNombre)
                    .addComponent(IngresoPass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IngresoDeIP))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IngresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IngresoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IngresoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(IngresoUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(IngresoPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(IngresoCPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IngresoDeIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarRegistro)
                    .addComponent(CancelarRegistro))
                .addGap(20, 20, 20))
        );

        BotonVolverLogIn.setText("Volver al Inicio de Sesión");
        BotonVolverLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverLogInActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonVolverLogIn)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(BotonVolverLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AceptarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarRegistroActionPerformed
        // TODO add your handling code here:
        //vistaPrincipal regreso= new vistaPrincipal();
        vistaPrincipal VP=new vistaPrincipal();
        VP.setIP(this.IngresoDeIP.getText());
                   
               
            try {
                //Intentamos conectarnos con el servidor
                //Si hay exito empezamos a consumir servicios
                String rutEntero=this.IngresoUser.getText();
                String[] PartesRut=rutEntero.split("-");
                String Pass=this.IngresoPass.getText();
                String CPass=this.IngresoCPass.getText();
                boolean var;
                if (conexion.iniciarRegistry()){
                    if (Pass.equals(CPass)){
                        Validaciones aValidar=new Validaciones();
                        boolean EstadoValidacion=aValidar.ValidacionRut(rutEntero);
                        if(EstadoValidacion){
                            var=conexion.getServidor().Registrar(this.IngresoNombre.getText().toLowerCase(), this.IngresoPaterno.getText().toLowerCase(), this.IngresoMaterno.getText().toLowerCase(), PartesRut[0], this.IngresoPass.getText(), 1);
                            if(var){
                                JOptionPane.showMessageDialog(this, "Registro Completado. Se redigirá al sistema", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                                vistaInicio VI= new vistaInicio();
                                VI.setLocationRelativeTo(null);
                                VI.setVisible(true);

                                this.dispose();
                                //conexion.registrarCliente(Nombre);
                            }
                            else{
                                JOptionPane.showMessageDialog(this, "Su registro no pudo ser completado", "Mensaje", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "El RUT ingresado no es valido. Por favor intentelo de nuevo", "Mensaje", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "contraseñas no concuerdan", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "No se pudo Conectar!!", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }

            } catch (RemoteException ex) {
                Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

    }//GEN-LAST:event_AceptarRegistroActionPerformed

    private void IngresoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoUserActionPerformed

    private void IngresoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresoPassActionPerformed

    private void CancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarRegistroActionPerformed
        vistaPrincipal VP=new vistaPrincipal();
        VP.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_CancelarRegistroActionPerformed

    private void BotonVolverLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverLogInActionPerformed
        vistaPrincipal VP= new vistaPrincipal();
        VP.setLocationRelativeTo(null);
        VP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonVolverLogInActionPerformed

     
    
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaRegistro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarRegistro;
    private javax.swing.JButton BotonVolverLogIn;
    private javax.swing.JButton CancelarRegistro;
    private javax.swing.JPasswordField IngresoCPass;
    private javax.swing.JTextField IngresoDeIP;
    public javax.swing.JTextField IngresoMaterno;
    public javax.swing.JTextField IngresoNombre;
    private javax.swing.JPasswordField IngresoPass;
    public javax.swing.JTextField IngresoPaterno;
    public javax.swing.JTextField IngresoUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
