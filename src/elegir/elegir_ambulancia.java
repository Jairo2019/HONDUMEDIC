/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elegir;

import Inventarios.inventario_ambulancia;
import ventas.*;
import alertas.principal.AWTUtilities;
import ambulancia.ambulancia;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import ServiciosYConexion.pnl_ambulancia;
import principal.PrincipalAdministrador;
import ambulancia.registrar_ambulancias;

/**
 *
 * @author Rojeru San
 */
public class elegir_ambulancia extends javax.swing.JDialog {

    Timer timer = null;
    TimerTask task;
    int i = 32;

    /**
     * Creates new form ModalElegir
     */
    public elegir_ambulancia(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AWTUtilities.setOpaque(this, false);
        Ubicar(0);
    }

    public elegir_ambulancia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new org.edisoncor.gui.panel.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnListaVentas = new principal.MaterialButtomRectangle();
        btnCancelar = new principal.MaterialButtomRectangle();
        btnlistaambulancia = new principal.MaterialButtomRectangle();
        btnregistrar = new principal.MaterialButtomRectangle();
        btnListaVentas2 = new principal.MaterialButtomRectangle();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/alertas/img/fondo.png"))); // NOI18N

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/elegir.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ELEGIR VENTANA ");

        btnListaVentas.setBackground(new java.awt.Color(0, 111, 177));
        btnListaVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnListaVentas.setText("Servicios");
        btnListaVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaVentas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnListaVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaVentasActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnlistaambulancia.setBackground(new java.awt.Color(0, 111, 177));
        btnlistaambulancia.setForeground(new java.awt.Color(255, 255, 255));
        btnlistaambulancia.setText("ambulancias");
        btnlistaambulancia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlistaambulancia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnlistaambulancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaambulanciaActionPerformed(evt);
            }
        });

        btnregistrar.setBackground(new java.awt.Color(0, 111, 177));
        btnregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnregistrar.setText("registrar ");
        btnregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnListaVentas2.setBackground(new java.awt.Color(0, 111, 177));
        btnListaVentas2.setForeground(new java.awt.Color(255, 255, 255));
        btnListaVentas2.setText("inventario");
        btnListaVentas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaVentas2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnListaVentas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaVentas2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(btnListaVentas, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(btnlistaambulancia, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(btnregistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                            .addComponent(btnListaVentas2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnListaVentas2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlistaambulancia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaVentasActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        this.dispose();
        if (PrincipalAdministrador.estacerrado(PrincipalAdministrador.servicio_ambulancia)) {
            PrincipalAdministrador.servicio_ambulancia = new pnl_ambulancia();
            int width = PrincipalAdministrador.escritorio.getWidth();
            int Height = PrincipalAdministrador.escritorio.getHeight();
            PrincipalAdministrador.servicio_ambulancia.setSize(width, Height);
            PrincipalAdministrador.escritorio.add(PrincipalAdministrador.servicio_ambulancia);
            PrincipalAdministrador.servicio_ambulancia.show();
        }
    }//GEN-LAST:event_btnListaVentasActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    Cerrar();
                } else {
                    Ubicar(i);
                    i -= 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        task = new TimerTask() {
            @Override
            public void run() {
                if (i == 352) {
                    timer.cancel();
                } else {
                    Ubicar(i);
                    i += 32;
                    Trasparencia((float) i / 352);
                }
            }
        };
        timer = new Timer();
        timer.schedule(task, 0, 2);
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        setVisible(false);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnlistaambulanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaambulanciaActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        this.dispose();
        if (PrincipalAdministrador.estacerrado(PrincipalAdministrador.registrar_ambulancia)) {
            PrincipalAdministrador.registrar_ambulancia = new registrar_ambulancias();
            int width = PrincipalAdministrador.escritorio.getWidth();
            int Height = PrincipalAdministrador.escritorio.getHeight();
            PrincipalAdministrador.registrar_ambulancia.setSize(width, Height);
            PrincipalAdministrador.escritorio.add(PrincipalAdministrador.registrar_ambulancia);
            PrincipalAdministrador.registrar_ambulancia.show();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnlistaambulanciaActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        this.dispose();
        if (PrincipalAdministrador.estacerrado(PrincipalAdministrador.registro_ambulancia)) {
            PrincipalAdministrador.registro_ambulancia = new ambulancia();
            int width = PrincipalAdministrador.escritorio.getWidth();
            int Height = PrincipalAdministrador.escritorio.getHeight();
            PrincipalAdministrador.registro_ambulancia.setSize(width, Height);
            PrincipalAdministrador.escritorio.add(PrincipalAdministrador.registro_ambulancia);
            PrincipalAdministrador.registro_ambulancia.show();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnListaVentas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaVentas2ActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        this.dispose();
        if (PrincipalAdministrador.estacerrado(PrincipalAdministrador.inventario_ambulancia)) {
            PrincipalAdministrador.inventario_ambulancia = new inventario_ambulancia();
            int width = PrincipalAdministrador.escritorio.getWidth();
            int Height = PrincipalAdministrador.escritorio.getHeight();
            PrincipalAdministrador.inventario_ambulancia.setSize(width, Height);
            PrincipalAdministrador.escritorio.add(PrincipalAdministrador.inventario_ambulancia);
            PrincipalAdministrador.inventario_ambulancia.show();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnListaVentas2ActionPerformed

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
            java.util.logging.Logger.getLogger(elegir_ambulancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elegir_ambulancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elegir_ambulancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elegir_ambulancia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                elegir_ambulancia dialog = new elegir_ambulancia(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButtomRectangle btnCancelar;
    private principal.MaterialButtomRectangle btnListaVentas;
    private principal.MaterialButtomRectangle btnListaVentas2;
    private principal.MaterialButtomRectangle btnlistaambulancia;
    private principal.MaterialButtomRectangle btnregistrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private org.edisoncor.gui.panel.Panel panel3;
    // End of variables declaration//GEN-END:variables

    private void Cerrar() {
        this.dispose();
        timer = null;
        task = null;
    }

    private void Trasparencia(float trasp) {
        AWTUtilities.setOpacity(this, trasp);
    }

    private void Ubicar(int y) {
        this.setLocation(640, y - 120);
    }
}
