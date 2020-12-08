/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elegir;

import Inventarios.inventario_cirugia;
import elegir.*;
import alertas.principal.AWTUtilities;
import java.util.Timer;
import java.util.TimerTask;
import principal.PrincipalAdministrador;
import cirugia.registrar_cirugia;
import javax.swing.JFrame;
import paneles.pnl_cirugia;
import reportes_registros.lista_caja_apa;
import reportes_registros.lista_caja_cafeteria;
import reportes_registros.lista_caja_farmacia;
import reportes_registros.lista_caja_general;
import reportes_registros.lista_caja_laboratorio;
import reportes_registros.lista_caja_rayosx;
/**
 *
 * @author Rojeru San
 */
public class elegir_caja_reportes extends javax.swing.JDialog {

    Timer timer = null;
    TimerTask task;
    int i = 32;

    /**
     * Creates new form ModalElegir
     */
    public elegir_caja_reportes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        AWTUtilities.setOpaque(this, false);
        Ubicar(0);
    }

    public elegir_caja_reportes() {
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
        btncajageneral = new principal.MaterialButtomRectangle();
        btnCancelar = new principal.MaterialButtomRectangle();
        btncajalaboratorio = new principal.MaterialButtomRectangle();
        btncajarayosx = new principal.MaterialButtomRectangle();
        btncajaapa = new principal.MaterialButtomRectangle();
        btncajacafeteria = new principal.MaterialButtomRectangle();
        btncajafarmacia = new principal.MaterialButtomRectangle();
        btncajaendoscopia = new principal.MaterialButtomRectangle();

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
        panel3.setPreferredSize(new java.awt.Dimension(399, 529));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/elegir.png"))); // NOI18N

        btncajageneral.setBackground(new java.awt.Color(0, 111, 177));
        btncajageneral.setForeground(new java.awt.Color(255, 255, 255));
        btncajageneral.setText("CAJA GENERAL");
        btncajageneral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncajageneral.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncajageneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncajageneralActionPerformed(evt);
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

        btncajalaboratorio.setBackground(new java.awt.Color(0, 111, 177));
        btncajalaboratorio.setForeground(new java.awt.Color(255, 255, 255));
        btncajalaboratorio.setText("CAJA LABORATORIO");
        btncajalaboratorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncajalaboratorio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncajalaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncajalaboratorioActionPerformed(evt);
            }
        });

        btncajarayosx.setBackground(new java.awt.Color(0, 111, 177));
        btncajarayosx.setForeground(new java.awt.Color(255, 255, 255));
        btncajarayosx.setText("CAJA RAYOSX");
        btncajarayosx.setActionCommand("registrar emrgencia");
        btncajarayosx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncajarayosx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncajarayosx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncajarayosxActionPerformed(evt);
            }
        });

        btncajaapa.setBackground(new java.awt.Color(0, 111, 177));
        btncajaapa.setForeground(new java.awt.Color(255, 255, 255));
        btncajaapa.setText("CAJA ULTRASONIDO");
        btncajaapa.setActionCommand("registrar emrgencia");
        btncajaapa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncajaapa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncajaapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncajaapaActionPerformed(evt);
            }
        });

        btncajacafeteria.setBackground(new java.awt.Color(0, 111, 177));
        btncajacafeteria.setForeground(new java.awt.Color(255, 255, 255));
        btncajacafeteria.setText("CAJA CAFETERIA");
        btncajacafeteria.setActionCommand("registrar emrgencia");
        btncajacafeteria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncajacafeteria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncajacafeteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncajacafeteriaActionPerformed(evt);
            }
        });

        btncajafarmacia.setBackground(new java.awt.Color(0, 111, 177));
        btncajafarmacia.setForeground(new java.awt.Color(255, 255, 255));
        btncajafarmacia.setText("CAJA FARMACIA");
        btncajafarmacia.setActionCommand("registrar emrgencia");
        btncajafarmacia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncajafarmacia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncajafarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncajafarmaciaActionPerformed(evt);
            }
        });

        btncajaendoscopia.setBackground(new java.awt.Color(0, 111, 177));
        btncajaendoscopia.setForeground(new java.awt.Color(255, 255, 255));
        btncajaendoscopia.setText("CAJA ENDOSCOPIA");
        btncajaendoscopia.setActionCommand("registrar emrgencia");
        btncajaendoscopia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncajaendoscopia.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncajaendoscopia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncajaendoscopiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btncajalaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncajageneral, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncajaapa, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncajarayosx, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncajacafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncajafarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncajaendoscopia, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncajacafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncajaendoscopia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncajafarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncajageneral, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncajalaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncajarayosx, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncajaapa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncajageneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncajageneralActionPerformed
        this.dispose();
        new lista_caja_general(new JFrame(), true).setVisible(true);  
    }//GEN-LAST:event_btncajageneralActionPerformed

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

    private void btncajalaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncajalaboratorioActionPerformed
        this.dispose();
        new lista_caja_laboratorio(new JFrame(), true).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncajalaboratorioActionPerformed

    private void btncajarayosxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncajarayosxActionPerformed
        this.dispose();
        new lista_caja_rayosx(new JFrame(), true).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncajarayosxActionPerformed

    private void btncajaapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncajaapaActionPerformed
        this.dispose();
        new lista_caja_apa(new JFrame(), true).setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btncajaapaActionPerformed

    private void btncajacafeteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncajacafeteriaActionPerformed
        this.dispose();
        new lista_caja_cafeteria(new JFrame(), true).setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btncajacafeteriaActionPerformed

    private void btncajafarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncajafarmaciaActionPerformed
        this.dispose();
        new lista_caja_farmacia(new JFrame(), true).setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btncajafarmaciaActionPerformed

    private void btncajaendoscopiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncajaendoscopiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncajaendoscopiaActionPerformed
    
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
            java.util.logging.Logger.getLogger(elegir_caja_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(elegir_caja_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(elegir_caja_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(elegir_caja_reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                elegir_caja_reportes dialog = new elegir_caja_reportes(new javax.swing.JFrame(), true);
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
    private principal.MaterialButtomRectangle btncajaapa;
    private principal.MaterialButtomRectangle btncajacafeteria;
    private principal.MaterialButtomRectangle btncajaendoscopia;
    private principal.MaterialButtomRectangle btncajafarmacia;
    private principal.MaterialButtomRectangle btncajageneral;
    private principal.MaterialButtomRectangle btncajalaboratorio;
    private principal.MaterialButtomRectangle btncajarayosx;
    private javax.swing.JLabel jLabel3;
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
