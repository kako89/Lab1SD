/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clientermi.conexionRMI;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class vistaIngresarLibro extends javax.swing.JFrame {
    public int contador=0;
    public String seleccionado;
    public conexionRMI conexion = new conexionRMI();
    /**
     * Creates new form vistaIngresarLibro
     */
    public vistaIngresarLibro() {
        initComponents();
        try {
            //Intentamos conectarnos con el servidor
            //Si hay exito empezamos a consumir servicios
            if (conexion.iniciarRegistry()){
                String Bibliotecas=new String();
                Bibliotecas=conexion.getServidor().ListadoBiblios();
                String[] resultadoConsulta=Bibliotecas.split(";");
                
                for(int i=0; i<resultadoConsulta.length;i++){
                    
                    SeleccionBiblioteca.addItem(resultadoConsulta[i]);

                }
                
                 
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo Conectar", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
            
            //String seleccionado=(String)ListadoBiblios.getSelectedItem();


        } catch (RemoteException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonVolverMenuLibro = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreLibro = new javax.swing.JTextField();
        CopiasLibro = new javax.swing.JTextField();
        SeleccionBiblioteca = new javax.swing.JComboBox();
        AceptarIngresoLibro = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonVolverMenuLibro.setText("Volver al Menú Libro");
        BotonVolverMenuLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverMenuLibroActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Libro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 14))); // NOI18N

        jLabel2.setText("Complete los siguientes campos para agregar un libro");

        jLabel3.setText("Titulo del libro:");

        jLabel4.setText("Número de copias:");

        jLabel5.setText("Biblioteca:");

        CopiasLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopiasLibroActionPerformed(evt);
            }
        });

        SeleccionBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionBibliotecaActionPerformed(evt);
            }
        });

        AceptarIngresoLibro.setText("Aceptar");
        AceptarIngresoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarIngresoLibroActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(AceptarIngresoLibro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(jButton2))
                                    .addComponent(SeleccionBiblioteca, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CopiasLibro))))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CopiasLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(SeleccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarIngresoLibro)
                    .addComponent(jButton2))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 251, Short.MAX_VALUE)
                .addComponent(BotonVolverMenuLibro)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonVolverMenuLibro)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CopiasLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopiasLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CopiasLibroActionPerformed

    private void SeleccionBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionBibliotecaActionPerformed
        // TODO add your handling code here:
        seleccionado=(String)SeleccionBiblioteca.getSelectedItem();
        
    }//GEN-LAST:event_SeleccionBibliotecaActionPerformed

    private void AceptarIngresoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarIngresoLibroActionPerformed
        // TODO add your handling code here:
        String Titulo=this.NombreLibro.getText();
        int numCopias=Integer.parseInt(this.CopiasLibro.getText());
        
        //String seleccionado=(String)SeleccionBiblioteca.getSelectedItem();
        
         if (contador==0){
             contador++;
         }
         else{
             System.out.println(seleccionado);
             contador++;
             
             try {
            //Intentamos conectarnos con el servidor
            //Si hay exito empezamos a consumir servicios
            if (conexion.iniciarRegistry()){
                boolean Resultado;
                Resultado=conexion.getServidor().IngresarLibro(seleccionado, Titulo.toLowerCase(),numCopias );
                
                
                if(Resultado){
                    
                   JOptionPane.showMessageDialog(this, "Ingreso Exitoso!!!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                   this.setVisible(false);
                   vistaIngresarLibro VIL = new vistaIngresarLibro();
                   VIL.setLocationRelativeTo(null);
                   VIL.setVisible(true);

                }
                else{
                    JOptionPane.showMessageDialog(this, "Simplemente Cagaste", "Mensaje", JOptionPane.ERROR_MESSAGE);
                
                }
                
                 
            }
            else{
                JOptionPane.showMessageDialog(this, "No se pudo Conectar", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
            
            //String seleccionado=(String)ListadoBiblios.getSelectedItem();


        } catch (RemoteException ex) {
            Logger.getLogger(vistaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
             
         }
    }//GEN-LAST:event_AceptarIngresoLibroActionPerformed

    private void BotonVolverMenuLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverMenuLibroActionPerformed
        vistaLibros VL= new vistaLibros();
        VL.setLocationRelativeTo(null);
        VL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverMenuLibroActionPerformed

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
            java.util.logging.Logger.getLogger(vistaIngresarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaIngresarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaIngresarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaIngresarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaIngresarLibro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarIngresoLibro;
    private javax.swing.JButton BotonVolverMenuLibro;
    private javax.swing.JTextField CopiasLibro;
    private javax.swing.JTextField NombreLibro;
    private javax.swing.JComboBox SeleccionBiblioteca;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
