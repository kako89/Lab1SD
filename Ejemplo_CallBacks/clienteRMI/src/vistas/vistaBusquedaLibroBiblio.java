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
public class vistaBusquedaLibroBiblio extends javax.swing.JFrame {
    public conexionRMI conexion = new conexionRMI();
    public int contador=0;
    public String auxiliar;
    /**
     * Creates new form vistaBusquedaLibroBiblio
     */
    public vistaBusquedaLibroBiblio() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        SeleccionBiblioteca = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        MostrarLibros = new javax.swing.JTextArea();
        VolverLibro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Búsqueda de libro");

        jLabel2.setText("Seleccione una biblioteca: ");

        SeleccionBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionBibliotecaActionPerformed(evt);
            }
        });

        MostrarLibros.setColumns(20);
        MostrarLibros.setRows(5);
        jScrollPane1.setViewportView(MostrarLibros);

        VolverLibro.setText("Volver al Menú libro");
        VolverLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(SeleccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VolverLibro)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VolverLibro)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SeleccionBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionBibliotecaActionPerformed
        // TODO add your handling code here:
        String seleccionado=(String)SeleccionBiblioteca.getSelectedItem();
        
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
                String LibrosBiblio=new String();
                LibrosBiblio=conexion.getServidor().MostrarLibrosBiblio(seleccionado);
                String[] resultadoConsulta=LibrosBiblio.split(";");
                
                auxiliar=seleccionado;
                //MostrarLibros.append("Listado Libros:");
                MostrarLibros.setText("");
                
                if(!resultadoConsulta[0].equals("")){
                    for(int i=0; i<resultadoConsulta.length; i++){
                        MostrarLibros.append("Titulo: "+ resultadoConsulta[i]+"\n"+"Numero de copias: "+resultadoConsulta[i+1]+"\n\n");
                        i++;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "La biblioteca no tiene ningun libro asociado", "Mensaje", JOptionPane.ERROR_MESSAGE);
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
    }//GEN-LAST:event_SeleccionBibliotecaActionPerformed

    private void VolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverLibroActionPerformed
        vistaLibros VL= new vistaLibros();
        VL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverLibroActionPerformed

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
            java.util.logging.Logger.getLogger(vistaBusquedaLibroBiblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaBusquedaLibroBiblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaBusquedaLibroBiblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaBusquedaLibroBiblio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaBusquedaLibroBiblio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea MostrarLibros;
    private javax.swing.JComboBox SeleccionBiblioteca;
    private javax.swing.JButton VolverLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}