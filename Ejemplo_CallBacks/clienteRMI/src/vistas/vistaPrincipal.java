package vistas;
import clientermi.conexionRMI;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class vistaPrincipal extends javax.swing.JFrame {
    private conexionRMI conexion = new conexionRMI();

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
        TextFieldPass = new javax.swing.JTextField();
        ButtonIngresar = new javax.swing.JButton();
        Registro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejemplo Cliente RMI");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Inicio de Sesión"));

        LabelNombre.setText("Nombre de Usuario:");

        LabelPass.setText("Contraseña:");

        ButtonIngresar.setText("Ingresar");
        ButtonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresar(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Registro))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TextFieldPass)
                        .addComponent(TextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        String Pass = this.TextFieldPass.getText();
        try {
            //Intentamos conectarnos con el servidor
            //Si hay exito empezamos a consumir servicios
            if (conexion.iniciarRegistry()){
                if (conexion.getServidor().inicioSesion(Nombre, Pass)){
                    new vistaInicio().setVisible(true);
                    //this.setVisible(false);
                    conexion.registrarCliente(Nombre);
                    
                }
                else{
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
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonIngresar;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPass;
    private javax.swing.JButton Registro;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldPass;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
