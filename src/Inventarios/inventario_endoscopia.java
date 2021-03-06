/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventarios;
import ServiciosYConexion.pnl_menu;
import ServiciosYConexion.Conexion;
import java.awt.Font;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import principal.PrincipalAdministrador;
import static principal.PrincipalAdministrador.escritorio;
import static principal.PrincipalAdministrador.estacerrado;
import static principal.PrincipalAdministrador.menu;
/**
 *
 * @author Rojeru San
 */
public class inventario_endoscopia extends javax.swing.JInternalFrame {
Connection con=null;
Date dato = null;
ResultSet rs=null;
PreparedStatement pst=null;
public PrincipalAdministrador a ;
    /**
     * Creates new form NewJInternalFrame
     */
    public inventario_endoscopia() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        con= Conexion.ConnectDB();
        Get_Data();
        tableUsers.getTableHeader().setFont(new Font("Tahoma", 1, 16));
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
        jPanel2 = new javax.swing.JPanel();
        cerrar = new principal.MaterialButton();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlChange = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        c_search_tbl = new app.bolivia.swing.JCTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        setBorder(dropShadowBorder1);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 111, 177));

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setForeground(new java.awt.Color(58, 159, 171));
        cerrar.setText("X");
        cerrar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Cerrar</h4> </body> </html>");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/previous_48.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N
        jPanel10.setLayout(new java.awt.CardLayout());

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(769, 582));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(128, 128, 131));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Endoscope_64.png"))); // NOI18N
        jLabel7.setText("Endocopia");

        pnlChange.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        c_search_tbl.setBackground(new java.awt.Color(204, 204, 204));
        c_search_tbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c_search_tbl.setForeground(new java.awt.Color(0, 0, 0));
        c_search_tbl.setToolTipText("");
        c_search_tbl.setCaretColor(new java.awt.Color(0, 0, 0));
        c_search_tbl.setFocusCycleRoot(true);
        c_search_tbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        c_search_tbl.setInheritsPopupMenu(true);
        c_search_tbl.setPlaceholder("Buscar Producto");
        c_search_tbl.setPreferredSize(new java.awt.Dimension(300, 32));
        c_search_tbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_search_tblActionPerformed(evt);
            }
        });
        c_search_tbl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c_search_tblKeyReleased(evt);
            }
        });
        jPanel5.add(c_search_tbl);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tableUsers.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellidos", "Domicilio", "Telefono"
            }
        ));
        tableUsers.setGridColor(new java.awt.Color(255, 255, 255));
        tableUsers.setRowHeight(20);
        tableUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUsersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsers);

        javax.swing.GroupLayout pnlChangeLayout = new javax.swing.GroupLayout(pnlChange);
        pnlChange.setLayout(pnlChangeLayout);
        pnlChangeLayout.setHorizontalGroup(
            pnlChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChangeLayout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1030, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlChangeLayout.setVerticalGroup(
            pnlChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChangeLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(384, Short.MAX_VALUE))
            .addGroup(pnlChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlChangeLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel11, "card2");

        jTabbedPane2.addTab("Productos", jPanel10);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1043, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Get_Data(){
        String sql="select codigo_endoscopia as 'Codigo', "
                + "nombre as 'Nombre',"
                + " descripcion as 'Descripción', "
                + "precio as 'Precio', "
                + "cantidad as 'Cantidad Disponible' "
                + "from inventario_endoscopia";
        try{
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         tableUsers.setModel(DbUtils.resultSetToTableModel(rs));
        tableUsers.removeColumn(tableUsers.getColumnModel().getColumn(0));
        lista_productos_servicios.ColorearFilas colorear=new lista_productos_servicios.ColorearFilas(3);
       tableUsers.setDefaultRenderer (Object.class, colorear);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
}
  }
    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_cerrarActionPerformed

    private void c_search_tblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_search_tblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_search_tblActionPerformed

    private void c_search_tblKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c_search_tblKeyReleased
        // search btn code
        String name = c_search_tbl.getText();
        try {

            DefaultTableModel dt = (DefaultTableModel) tableUsers.getModel();
            dt.setRowCount(0);
            Statement s = Conexion.ConnectDB().createStatement();

            ResultSet rs = s.executeQuery("SELECT * FROM inventario_endoscopia WHERE nombre LIKE '%"+name+"%' ");

            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
                v.add(rs.getString(3));
                v.add(rs.getString(4));
                v.add(rs.getString(5));
                dt.addRow(v);

            }

        } catch (Exception e) {
            Get_Data();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_c_search_tblKeyReleased

    private void tableUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUsersMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_tableUsersMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(menu)) {
            menu = new pnl_menu();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            menu.setSize(width, Height);
            escritorio.add(menu);
            menu.show();
            new elegir.elegir_endoscopia(a, true).setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private app.bolivia.swing.JCTextField c_search_tbl;
    private principal.MaterialButton cerrar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel pnlChange;
    private javax.swing.JTable tableUsers;
    // End of variables declaration//GEN-END:variables
}
