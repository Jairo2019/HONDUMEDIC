/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registro_Salida;
import alertas.principal.SuccessAlert;
import paneles.*;
import java.util.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import net.proteanit.sql.DbUtils;
import static principal.PrincipalAdministrador.escritorio;
import java.awt.HeadlessException;
import lista_productos_servicios.ProductoDAO;
import principal.PrincipalAdministrador;
import static principal.PrincipalAdministrador.escritorio;
import static principal.PrincipalAdministrador.estacerrado;
import static principal.PrincipalAdministrador.menu;
/**
 *
 * @author Rojeru San
 */
public class salida_hospitalizacion extends javax.swing.JInternalFrame {
SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/yyyy");
Connection con=null;
Date dato = null;
ResultSet rs=null;
PreparedStatement pst=null;
public PrincipalAdministrador a ;
static Conexion cc = new Conexion();
 static Connection cn = cc.ConnectDB();
     ProductoDAO pdao = new ProductoDAO();
     DefaultTableModel modelo = new DefaultTableModel();
    String idp;
    int cant;
    double pre;
    double tpagar;
    /**
     * Creates new form NewJInternalFrame
     */
     public boolean estacerrado(Object obj) {
        JInternalFrame[] activos = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
            }
            i++;
        }
        return cerrado;
    }
 int filas;
    DefaultTableModel m;
    public salida_hospitalizacion() {
        initComponents();
        tablaCaja.getTableHeader().setDefaultRenderer(new principal.EstiloTablaHeader());
        tablaCaja.setDefaultRenderer(Object.class, new principal.EstiloTablaRenderer());
        tablaCaja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        con= Conexion.ConnectDB();
        Get_Data();
        thishide.setVisible(false);
        lblcodigo.hide();
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
        thishide = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        btnVender = new principal.MaterialButton();
        btnCancelar = new principal.MaterialButton();
        jPanel4 = new javax.swing.JPanel();
        txtpaciente = new app.bolivia.swing.JCTextField();
        txtFecha = new app.bolivia.swing.JCTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        btns_paciente = new principal.MaterialButton();
        txtmedicosalida = new app.bolivia.swing.JCTextField();
        btns_medico2 = new principal.MaterialButton();
        jLabel8 = new javax.swing.JLabel();
        c_search_tbl = new app.bolivia.swing.JCTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCaja = new javax.swing.JTable();
        lblcodigo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        setBorder(dropShadowBorder1);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 111, 177));
        jPanel2.setForeground(new java.awt.Color(12, 140, 143));

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
                .addGap(408, 408, 408)
                .addComponent(thishide, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 744, Short.MAX_VALUE)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(thishide, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(769, 582));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(128, 128, 131));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hospitalization_64.png"))); // NOI18N
        jLabel14.setText("Hospitalización");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 111, 177), 3));

        btnVender.setBackground(new java.awt.Color(0, 111, 177));
        btnVender.setForeground(new java.awt.Color(255, 255, 255));
        btnVender.setText("REGISTRAR SALIDA");
        btnVender.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 111, 177));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.setToolTipText("");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 111, 177), 3));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtpaciente.setEditable(false);
        txtpaciente.setBorder(null);
        txtpaciente.setForeground(new java.awt.Color(58, 159, 171));
        txtpaciente.setToolTipText("");
        txtpaciente.setEnabled(false);
        txtpaciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtpaciente.setPlaceholder("PACIENTE DADO DE ALTA");
        jPanel4.add(txtpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 240, 30));

        txtFecha.setBorder(null);
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));
        txtFecha.setEnabled(false);
        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtFecha.setPlaceholder("FECHA");
        jPanel4.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 240, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/campo-cliente.png"))); // NOI18N
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 310, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/campo-calendario.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(58, 159, 171));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 10, 200));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/HODUMEDIC_1.png"))); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 160));

        btns_paciente.setBackground(new java.awt.Color(0, 111, 177));
        btns_paciente.setBorder(null);
        btns_paciente.setForeground(new java.awt.Color(255, 255, 255));
        btns_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_caja.png"))); // NOI18N
        btns_paciente.setText("buscar");
        btns_paciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btns_paciente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btns_paciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btns_paciente.setRippleColor(new java.awt.Color(60, 63, 65));
        btns_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btns_pacienteActionPerformed(evt);
            }
        });
        jPanel4.add(btns_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 80, 50));

        txtmedicosalida.setEditable(false);
        txtmedicosalida.setBorder(null);
        txtmedicosalida.setForeground(new java.awt.Color(58, 159, 171));
        txtmedicosalida.setToolTipText("");
        txtmedicosalida.setEnabled(false);
        txtmedicosalida.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtmedicosalida.setPlaceholder("MEDICO QUE ORDENA SALIDA");
        jPanel4.add(txtmedicosalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 240, 30));

        btns_medico2.setBackground(new java.awt.Color(0, 111, 177));
        btns_medico2.setBorder(null);
        btns_medico2.setForeground(new java.awt.Color(255, 255, 255));
        btns_medico2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_caja.png"))); // NOI18N
        btns_medico2.setText("buscar");
        btns_medico2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btns_medico2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btns_medico2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btns_medico2.setRippleColor(new java.awt.Color(60, 63, 65));
        btns_medico2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btns_medico2ActionPerformed(evt);
            }
        });
        jPanel4.add(btns_medico2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 80, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventas/insert.png"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 310, -1));

        c_search_tbl.setBackground(new java.awt.Color(204, 204, 204));
        c_search_tbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        c_search_tbl.setForeground(new java.awt.Color(0, 0, 0));
        c_search_tbl.setToolTipText("");
        c_search_tbl.setCaretColor(new java.awt.Color(0, 0, 0));
        c_search_tbl.setFocusCycleRoot(true);
        c_search_tbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        c_search_tbl.setInheritsPopupMenu(true);
        c_search_tbl.setPlaceholder("Buscar Paciente");
        c_search_tbl.setPreferredSize(new java.awt.Dimension(400, 32));
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
        jPanel4.add(c_search_tbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 200, -1));

        jSeparator2.setBackground(new java.awt.Color(58, 159, 171));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 12, 10, 200));

        jPanel7.setBackground(new java.awt.Color(0, 111, 177));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 111, 177), 3));

        tablaCaja.setBackground(new java.awt.Color(0, 0, 0));
        tablaCaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaCaja.setForeground(new java.awt.Color(255, 255, 255));
        tablaCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "PRODUCTO / SERVICIO", "PRECIO (L)", "CANTIDAD", "IMPORTE (L)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaCaja.setDoubleBuffered(true);
        tablaCaja.setRowHeight(20);
        tablaCaja.setSelectionBackground(new java.awt.Color(0, 153, 255));
        tablaCaja.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaCaja);

        lblcodigo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblcodigo.setText("0.0");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Salidas", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1300, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
        );

        jTabbedPane2.getAccessibleContext().setAccessibleName("Registro de Ventas");

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //genera el codigo registro de examen 

   public static String fechaactual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
        return formatofecha.format(fecha);

    }

    void limpiaCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaCaja.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        txtpaciente.setText("");
        txtmedicosalida.setText("");
        lblcodigo.setText("");
        txtFecha.setText(fechaactual());
        thishide.setVisible(false);
    }
    //metodo obtener datos de la tabla test_laboratorio dado de alta
  private void Get_Data(){
        limpiaCampos();
        String sql="select codigo as 'Codigo',"
                + "codigo_paciente as 'Identidad',"
                + "CONCAT(nombre, ' ' , apellido) as 'Paciente', "
                + "encargado as 'Encargado del paciente',"
                + "medico_3 as 'Ordeno Salida',"
                + "num_habitacion as 'Habitación',"
                + "observaciones as'Motivo de Ingreso',"
                + "fecha as 'Fecha y Hora',"
                + " total as 'Total (L)'"
                + " from test_hospitalizacion"
                + " inner join paciente on"
                + " paciente = codigo_paciente"
                + " where estado=0";
        try{
         pst=con.prepareStatement(sql);
          rs= pst.executeQuery();
         tablaCaja.setModel(DbUtils.resultSetToTableModel(rs));
         tablaCaja.removeColumn(tablaCaja.getColumnModel().getColumn(0));
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          } 
  }


    void actualizarIngreso() {
        try{
            con=Conexion.ConnectDB();
            String sql= "update test_hospitalizacion set medico_3='"+ txtmedicosalida.getText()+ "'"
                    + ",fecha='" + txtFecha.getText() + "'"
                    + ",estado='" + 0+ "' "
                    + " where codigo='" + lblcodigo.getText()+ "'";
            pst=con.prepareStatement(sql);
            pst.execute();
            this.jTabbedPane2.setSelectedIndex(0);
            Get_Data();
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);
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

            DefaultTableModel dt = (DefaultTableModel) tablaCaja.getModel();
            dt.setRowCount(0);
            Statement s = Conexion.ConnectDB().createStatement();
                ResultSet rs = s.executeQuery("select codigo as 'Codigo',"
                + "codigo_paciente as 'Identidad',"
                + "CONCAT(nombre, ' ' , apellido) as 'Paciente', "
                + "encargado as 'Encargado del paciente',"
                + "medico_3 as 'Ordeno Salida',"
                + "num_habitacion as 'Habitación',"
                + "observaciones as'Motivo de Ingreso',"
                + "fecha as 'Fecha y Hora',"
                + " total as 'Total (L)'"
                + " from test_hospitalizacion"
                + " inner join paciente on"
                + " paciente = codigo_paciente "
                + "WHERE CONCAT(nombre, ' ' , apellido) LIKE '%"+name+"%' or codigo_paciente LIKE '%"+name+"%' and estado=0 ");

                    while (rs.next()) {
                        Vector v = new Vector();
                        v.add(rs.getString(1));
                        v.add(rs.getString(2));
                        v.add(rs.getString(3));
                        v.add(rs.getString(4));
                        v.add(rs.getString(5));
                        v.add(rs.getString(6));
                        v.add(rs.getString(7));
                        v.add(rs.getString(8));
                        v.add(rs.getString(9));

                        dt.addRow(v);
                    }

        } catch (Exception e) {
            Get_Data();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_c_search_tblKeyReleased

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if (thishide.isVisible()){
            limpiaCampos();
            jTabbedPane2.setSelectedIndex(0); 
            btnVender.setEnabled(true);
        }else{
        limpiaCampos();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        try{
            con=Conexion.ConnectDB();
            if (txtpaciente.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese Paciente","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtmedicosalida.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese el Medico que Ordeno la Salida del Paciente","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (txtFecha.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Ingrese Fecha","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
               // insertar datos en test_laboratorio
            actualizarIngreso(); 
            SuccessAlert sa = new SuccessAlert(new JFrame(), true);
            sa.titulo.setText("¡HECHO!");
            sa.msj.setText("REGISTRADO");
            sa.msj1.setText("CON ÉXITO");
            sa.setVisible(true);
            this.jTabbedPane2.setSelectedIndex(0);
            Get_Data();
        }catch(HeadlessException ex){
            JOptionPane.showMessageDialog(this,ex);
        } 
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btns_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btns_pacienteActionPerformed
        new pacientes.lista_pacientes_hospitalizados(new JFrame(), true).setVisible(true);  
        // TODO add your handling code here:
    }//GEN-LAST:event_btns_pacienteActionPerformed

    private void btns_medico2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btns_medico2ActionPerformed
        empleados.lista_empleados_mingreso.cual="2.1";
        new empleados.lista_empleados_mingreso(new JFrame(), true).setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_btns_medico2ActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(menu)) {
            menu = new pnl_menu();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            menu.setSize(width, Height);
            escritorio.add(menu);
            menu.show();
            new elegir.elegir_hospitalizacion(a, true).setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private principal.MaterialButton btnCancelar;
    private principal.MaterialButton btnVender;
    private principal.MaterialButton btns_medico2;
    private principal.MaterialButton btns_paciente;
    private app.bolivia.swing.JCTextField c_search_tbl;
    private principal.MaterialButton cerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane2;
    public static javax.swing.JLabel lblcodigo;
    public static javax.swing.JTable tablaCaja;
    private javax.swing.JLabel thishide;
    private app.bolivia.swing.JCTextField txtFecha;
    public static app.bolivia.swing.JCTextField txtmedicosalida;
    public static app.bolivia.swing.JCTextField txtpaciente;
    // End of variables declaration//GEN-END:variables
}
