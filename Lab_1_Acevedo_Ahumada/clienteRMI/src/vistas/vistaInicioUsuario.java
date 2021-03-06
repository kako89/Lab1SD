/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clientermi.conexionRMI;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marco
 */
public class vistaInicioUsuario extends javax.swing.JFrame {
    private conexionRMI conexion = new conexionRMI();
    /**
     * Creates new form vistaInicioUsuario
     */
    public vistaInicioUsuario() {
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
        BotonBiblioConsulUsuario = new javax.swing.JButton();
        BotLibrosPorBiblio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BotonConsultaLibros = new javax.swing.JButton();
        BotonComentarLibro = new javax.swing.JButton();
        BotonVerComentario = new javax.swing.JButton();
        BotonMenuInicial = new javax.swing.JButton();
        botonEditarPerfil = new javax.swing.JButton();
        BotonCambiarContraseña = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonCerrarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas Biblioteca"));

        BotonBiblioConsulUsuario.setText("Consultar Biblioteca");
        BotonBiblioConsulUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBiblioConsulUsuarioActionPerformed(evt);
            }
        });

        BotLibrosPorBiblio.setText("Libros por Biblioteca");
        BotLibrosPorBiblio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotLibrosPorBiblioActionPerformed(evt);
            }
        });

        jLabel5.setText("Usted puede consultar por los datos de una biblioteca y conocer su nombre y dirección.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(BotLibrosPorBiblio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonBiblioConsulUsuario)
                .addGap(42, 42, 42))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBiblioConsulUsuario)
                    .addComponent(BotLibrosPorBiblio))
                .addGap(27, 27, 27))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas Libros"));

        jLabel2.setText("Usted puede consultar por los libros disponibles en las bibliotecas.");

        BotonConsultaLibros.setText("Consultar Libros");
        BotonConsultaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultaLibrosActionPerformed(evt);
            }
        });

        BotonComentarLibro.setText("Comentar Libro");
        BotonComentarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComentarLibroActionPerformed(evt);
            }
        });

        BotonVerComentario.setText("Ver Comentarios Libro");
        BotonVerComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVerComentarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(BotonVerComentario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonComentarLibro)
                .addGap(120, 120, 120)
                .addComponent(BotonConsultaLibros)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonConsultaLibros)
                    .addComponent(BotonComentarLibro)
                    .addComponent(BotonVerComentario))
                .addGap(26, 26, 26))
        );

        BotonMenuInicial.setText("Volver al Menú Inicial");
        BotonMenuInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenuInicialActionPerformed(evt);
            }
        });

        botonEditarPerfil.setText("Editar Perfil");
        botonEditarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarPerfilActionPerformed(evt);
            }
        });

        BotonCambiarContraseña.setText("Cambiar Contraseña");
        BotonCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarContraseñaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido(a) a SIBICHAT");

        BotonCerrarSesion.setText("Cerrar Sesión");
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonCerrarSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEditarPerfil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCambiarContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonMenuInicial))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonMenuInicial)
                    .addComponent(botonEditarPerfil)
                    .addComponent(BotonCambiarContraseña)
                    .addComponent(jLabel1)
                    .addComponent(BotonCerrarSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMenuInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenuInicialActionPerformed
        vistaInicio VIU=new vistaInicio();
        VIU.setLocationRelativeTo(null);
        VIU.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotonMenuInicialActionPerformed

    private void BotonBiblioConsulUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBiblioConsulUsuarioActionPerformed
        vistaBibliotecaConsultaUsuario VBCU = new vistaBibliotecaConsultaUsuario();
        VBCU.setLocationRelativeTo(null);
        VBCU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonBiblioConsulUsuarioActionPerformed

    private void BotLibrosPorBiblioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotLibrosPorBiblioActionPerformed
        VistaBusquedaLibroBiblioUsuario VBLBU= new VistaBusquedaLibroBiblioUsuario();
        VBLBU.setLocationRelativeTo(null);
        VBLBU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotLibrosPorBiblioActionPerformed

    private void BotonConsultaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultaLibrosActionPerformed
        vistaBusquedaBiblioUsuario VBBU=new vistaBusquedaBiblioUsuario();
        VBBU.setLocationRelativeTo(null);
        VBBU.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotonConsultaLibrosActionPerformed

    private void BotonComentarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComentarLibroActionPerformed
        vistaComentarLibro VCL= new vistaComentarLibro();
        VCL.setLocationRelativeTo(null);
        VCL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonComentarLibroActionPerformed

    private void BotonVerComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVerComentarioActionPerformed
        vistaVerComentarios VVC= new vistaVerComentarios();
        VVC.setLocationRelativeTo(null);
        VVC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonVerComentarioActionPerformed

    private void botonEditarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarPerfilActionPerformed
        vistaEditarUsuario VEU=new vistaEditarUsuario();
        VEU.setLocationRelativeTo(null);
        VEU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonEditarPerfilActionPerformed

    private void BotonCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarContraseñaActionPerformed
        vistaCambiarContrasenaUsuario VCCU=new vistaCambiarContrasenaUsuario();
        VCCU.setLocationRelativeTo(null);
        VCCU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonCambiarContraseñaActionPerformed

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
       try {
            conexion.desregistrarCliente(vistaPrincipal.getAux());
        } catch (RemoteException ex) {
            Logger.getLogger(vistaInicioAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        vistaPrincipal VP=new vistaPrincipal();
        VP.setLocationRelativeTo(null);
        VP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(vistaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaInicioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaInicioUsuario().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotLibrosPorBiblio;
    private javax.swing.JButton BotonBiblioConsulUsuario;
    private javax.swing.JButton BotonCambiarContraseña;
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonComentarLibro;
    private javax.swing.JButton BotonConsultaLibros;
    private javax.swing.JButton BotonMenuInicial;
    private javax.swing.JButton BotonVerComentario;
    private javax.swing.JButton botonEditarPerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
