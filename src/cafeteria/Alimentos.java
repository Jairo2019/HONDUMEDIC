/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import java.awt.Cursor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
//import usuarios.OpcionesUs;
//import static usuarios.Usuarios.codigo;
//import usuarios.UsuariosCod;

/**
 *
 * @author Rojeru San CL
 */
public class Alimentos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuarios
     */
    public Alimentos() {
        initComponents();
        tablaAlimentos.getTableHeader().setDefaultRenderer(new principal.EstiloTablaHeader());
        tablaAlimentos.setDefaultRenderer(Object.class, new principal.EstiloTablaRenderer());
        this.tipoAl.setCursor(new Cursor(12));       
        this.setFrameIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/icono.png")));
        limpiaCampos();
        
        tipoAl.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (tipoAl.getSelectedIndex() == 0) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/tipoAlL.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/nombreL.png")));
                }
                if (tipoAl.getSelectedIndex() == 1) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/bebida.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/bebida1.png")));
                }
                if (tipoAl.getSelectedIndex() == 2) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/botana.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/botana1.png")));
                }
                if (tipoAl.getSelectedIndex() == 3) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caldo.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/caldo1.png")));
                }
                if (tipoAl.getSelectedIndex() == 4) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/camaron.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/camaron1.png")));
                }
                if (tipoAl.getSelectedIndex() == 5) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/coctel.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/coctel1.png")));
                }
                if (tipoAl.getSelectedIndex() == 6) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/desayuno.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/desayuno1.png")));
                }
                if (tipoAl.getSelectedIndex() == 7) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/filete.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/filete1.png")));
                }
                if (tipoAl.getSelectedIndex() == 8) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langosta.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langosta1.png")));
                }
                if (tipoAl.getSelectedIndex() == 9) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langostino.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/langostino1.png")));
                }
                if (tipoAl.getSelectedIndex() == 10) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pescado.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pescado1.png")));
                }
                if (tipoAl.getSelectedIndex() == 11) {
                    tipoL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pulpo.png")));
                    nombreL.setIcon(new ImageIcon(getClass().getResource("/imagenes/alimentos/pulpo1.png")));
                }
            }
        });

        tablaAlimentos.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                if (tablaAlimentos.getSelectedRow() != -1) {
                    cambiaDatos();
                    selecionRegistro = true;
                }
            }
        });
    }

    void cambiaDatos() {
        int fila = tablaAlimentos.getSelectedRow();
        codigo.setText(tablaAlimentos.getValueAt(fila, 0).toString());
        tipoAl.setSelectedItem(tablaAlimentos.getValueAt(fila, 1).toString());
        nombre.setText(tablaAlimentos.getValueAt(fila, 2).toString());        
        precio.setText(tablaAlimentos.getValueAt(fila, 3).toString());
    }
    boolean selecionRegistro = false;

    void limpiaCampos() {
        if (tablaAlimentos.getSelectedRow() > -1) {
            tablaAlimentos.removeRowSelectionInterval(tablaAlimentos.getSelectedRow(), tablaAlimentos.getSelectedRow());
        }
        codigo.setText("");
        nombre.setText("");
        tipoAl.setSelectedItem("TIPO ALIMENTO");
        precio.setText("");
        buscar.setText("");
        selecionRegistro = false;
        OpcionesAl.listar("");
        OpcionesAl.extraerID();
    }

    void selecionaFila(String id) {
        for (int i = 0; i < tablaAlimentos.getRowCount(); i++) {
            if (id.equals(tablaAlimentos.getValueAt(i, 0))) {
                tablaAlimentos.setRowSelectionInterval(i, i);
                break;
            }
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        codigo = new app.bolivia.swing.JCTextField();
        codigoL = new javax.swing.JLabel();
        nombre = new app.bolivia.swing.JCTextField();
        nombreL = new javax.swing.JLabel();
        tipoAl = new org.bolivia.combo.SComboBoxBlue();
        tipoL = new javax.swing.JLabel();
        precio = new app.bolivia.swing.JCTextField();
        nombreL1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlimentos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        buscar = new app.bolivia.swing.JCTextField();
        codigoL1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        registrar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        eliminarT = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 111, 177));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 111, 177))); // NOI18N
        setClosable(true);
        setForeground(java.awt.Color.blue);
        setTitle("ALIMENTOS");
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setOpaque(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "REGISTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo.setEditable(false);
        codigo.setBackground(new java.awt.Color(0, 111, 177));
        codigo.setBorder(null);
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codigo.setOpaque(false);
        codigo.setPhColor(new java.awt.Color(255, 255, 255));
        codigo.setPlaceholder("CÓDIGO");
        jPanel2.add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 180, -1));

        codigoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/codigoL.png"))); // NOI18N
        jPanel2.add(codigoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 52));

        nombre.setBackground(new java.awt.Color(0, 111, 177));
        nombre.setBorder(null);
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombre.setOpaque(false);
        nombre.setPhColor(new java.awt.Color(255, 255, 255));
        nombre.setPlaceholder("NOMBRE ALIMENTO");
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 180, -1));

        nombreL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/nombreL.png"))); // NOI18N
        jPanel2.add(nombreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 52));

        tipoAl.setBackground(new java.awt.Color(0, 111, 177));
        tipoAl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 111, 177), 10));
        tipoAl.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TIPO ALIMENTO", "BEBIDA", "BOTANA", "DESAYUNO", "ALMUERZO", "CENA", "COMIDA RÁPIDA", "OTRO" }));
        tipoAl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(tipoAl, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 183, 40));

        tipoL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/tipoAlL.png"))); // NOI18N
        jPanel2.add(tipoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, 52));

        precio.setBackground(new java.awt.Color(0, 111, 177));
        precio.setBorder(null);
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        precio.setOpaque(false);
        precio.setPhColor(new java.awt.Color(255, 255, 255));
        precio.setPlaceholder("PRECIO");
        precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precioKeyTyped(evt);
            }
        });
        jPanel2.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 180, -1));

        nombreL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/precioL.png"))); // NOI18N
        jPanel2.add(nombreL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, 52));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(0, 83, 0, 0);
        jPanel1.add(jPanel2, gridBagConstraints);

        tablaAlimentos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tablaAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TIPO ALIMENTO", "NOMBRE ALIMENTO", "PRECIO L"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAlimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaAlimentos.setRowHeight(20);
        tablaAlimentos.setSelectionBackground(new java.awt.Color(12, 140, 143));
        jScrollPane1.setViewportView(tablaAlimentos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 955;
        gridBagConstraints.ipady = 172;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 29, 6);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "BUSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscar.setBackground(new java.awt.Color(0, 111, 177));
        buscar.setBorder(null);
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buscar.setOpaque(false);
        buscar.setPhColor(new java.awt.Color(255, 255, 255));
        buscar.setPlaceholder("BUSCAR NOMBRE / CÓDIGO");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarKeyReleased(evt);
            }
        });
        jPanel4.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 190, -1));

        codigoL1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        codigoL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/buscarL.png"))); // NOI18N
        jPanel4.add(codigoL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 52));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registrar.setForeground(new java.awt.Color(0, 0, 0));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/regis1.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.setBorder(null);
        registrar.setBorderPainted(false);
        registrar.setContentAreaFilled(false);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alimentos/regis2.png"))); // NOI18N
        registrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        actualizar.setForeground(new java.awt.Color(51, 51, 51));
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/actualizar.png"))); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.setBorder(null);
        actualizar.setBorderPainted(false);
        actualizar.setContentAreaFilled(false);
        actualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/actualizar1.png"))); // NOI18N
        actualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        eliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(51, 51, 51));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/borrar1.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/borrar2.png"))); // NOI18N
        eliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        eliminarT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        eliminarT.setForeground(new java.awt.Color(51, 51, 51));
        eliminarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/borrarT1.png"))); // NOI18N
        eliminarT.setText("Eliminar Todo");
        eliminarT.setBorder(null);
        eliminarT.setBorderPainted(false);
        eliminarT.setContentAreaFilled(false);
        eliminarT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminarT.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarT.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/borrarT2.png"))); // NOI18N
        eliminarT.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        limpiar.setForeground(new java.awt.Color(51, 51, 51));
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/limpiar1.png"))); // NOI18N
        limpiar.setText("Limpiar Campos");
        limpiar.setBorder(null);
        limpiar.setBorderPainted(false);
        limpiar.setContentAreaFilled(false);
        limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        limpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        limpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuarios/limpiar2.png"))); // NOI18N
        limpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(actualizar)
                .addGap(10, 10, 10)
                .addComponent(eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminarT)
                .addGap(18, 18, 18)
                .addComponent(limpiar))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {actualizar, eliminar, eliminarT, limpiar});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrar)
            .addComponent(actualizar)
            .addComponent(eliminar)
            .addComponent(eliminarT)
            .addComponent(limpiar)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(6, 62, 0, 0);
        jPanel1.add(jPanel5, gridBagConstraints);

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (selecionRegistro) {
            JOptionPane.showMessageDialog(this, "El CODIGO: " + this.codigo.getText() + "\nya existe en un registro.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/impo.png")));
        } else if (codigo.getText().equals("") || nombre.getText().equals("") || tipoAl.getSelectedItem().equals("TIPO ALIMENTOS")
                || precio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Todos los campos\nson obligatorios.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        } else {
           cafeteria.AlimentosCod us = new AlimentosCod();
            us.setNombre(nombre.getText());
            us.setTipoal(tipoAl.getSelectedItem().toString());
            us.setPrecio(precio.getText());
            OpcionesAl.registrar(us);
//            int opcion = OpcionesAl.registrar(us);
//            if (opcion != 0) {
//                String id = codigo.getText();
//                limpiaCampos();
//                selecionaFila(id);
                JOptionPane.showMessageDialog(this, "Registro éxitoso.", "Alimentos", 0,
                        new ImageIcon(getClass().getResource("/imagenes/alimentos/registrado.png")));
                 OpcionesAl.listar("");
//            }
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        if (tablaAlimentos.getRowCount() > 0) {
            if (tablaAlimentos.getSelectedRowCount() > 0) {
                if (codigo.getText().equals("") || nombre.getText().equals("") || tipoAl.getSelectedItem().equals("TIPO ALIMENTOS")
                        || precio.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Es necesario completar\ntodos los campos.", "Alimentos", 0,
                            new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
                } else if (JOptionPane.showConfirmDialog(this, "Esta a punto de actualizar\nun registro.\n¿Desea continuar?", "Alimentos", JOptionPane.YES_NO_OPTION, 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                    cafeteria.AlimentosCod us = new AlimentosCod();
                    us.setPrimaryKey(codigo.getText());
                    us.setNombre(nombre.getText());
                    us.setTipoal(tipoAl.getSelectedItem().toString());
                    us.setPrecio(precio.getText());
                    int opcion = OpcionesAl.actualizar(us);
                    if (opcion != 0) {
                        String id = codigo.getText();
                        limpiaCampos();
                        selecionaFila(id);
                        JOptionPane.showMessageDialog(this, "Registro actualizado.", "Alimentos", 0,
                                new ImageIcon(getClass().getResource("/imagenes/alimentos/actualizado.png")));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Alimentos", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara actualizar.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if (tablaAlimentos.getRowCount() > 0) {
            if (tablaAlimentos.getSelectedRowCount() > 0) {
                if (JOptionPane.showConfirmDialog(this, "Esta a punto de eliminar\nun registro.\n¿Desea continuar?", "Alimentos", JOptionPane.YES_NO_OPTION, 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                    int fila = tablaAlimentos.getSelectedRow();
                    String id = tablaAlimentos.getValueAt(fila, 0).toString();
                    int elimina = OpcionesAl.eliminar(id);
                    if (elimina != 0) {
                        limpiaCampos();
                        JOptionPane.showMessageDialog(this, "Registro eliminado.", "Alimentos", 0,
                                new ImageIcon(getClass().getResource("/imagenes/alimentos/borrado1.png")));
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un registro.", "Alimentos", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            }

        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void eliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTActionPerformed
        if (tablaAlimentos.getRowCount() > 0) {
            if (JOptionPane.showConfirmDialog(this, "Esta a punto de elimnar\ntodos los registros.\n¿Desea continuar?", "Alimentos", JOptionPane.YES_NO_OPTION, 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/seguro.png"))) == JOptionPane.YES_OPTION) {
                int eliminaT = OpcionesAl.eliminaTodos();
                if (eliminaT != 0) {
                    limpiaCampos();
                    JOptionPane.showMessageDialog(this, "Registros eliminados.", "Alimentos", 0,
                            new ImageIcon(getClass().getResource("/imagenes/alimentos/borrado.png")));
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Alimentos", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_eliminarTActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char letras = evt.getKeyChar();
        if ((letras < 'a' || letras > 'z') && (letras < 'A' | letras > 'Z')) {
            if ((letras != 'ñ') && (letras != 'Ñ') && (letras != 'á') && (letras != 'Á') && (letras != 'é') && (letras != 'É') && (letras != 'í')
                    && (letras != 'Í') && (letras != 'ó') && (letras != 'Ó') && (letras != 'ú') && (letras != 'Ú') && (letras != ' ')) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precioKeyTyped
        char num = evt.getKeyChar();
        if ((num < '0' || num > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_precioKeyTyped

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        nombre.setText(nombre.getText().toUpperCase());        
    }//GEN-LAST:event_nombreKeyReleased

    private void buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarKeyReleased
        buscar.setText(buscar.getText().toUpperCase());
        OpcionesAl.listar(buscar.getText());
    }//GEN-LAST:event_buscarKeyReleased

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        limpiaCampos();
    }//GEN-LAST:event_buscarMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiaCampos();
    }//GEN-LAST:event_limpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private app.bolivia.swing.JCTextField buscar;
    public static app.bolivia.swing.JCTextField codigo;
    private javax.swing.JLabel codigoL;
    private javax.swing.JLabel codigoL1;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton eliminarT;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpiar;
    private app.bolivia.swing.JCTextField nombre;
    private javax.swing.JLabel nombreL;
    private javax.swing.JLabel nombreL1;
    private app.bolivia.swing.JCTextField precio;
    private javax.swing.JButton registrar;
    public static javax.swing.JTable tablaAlimentos;
    private org.bolivia.combo.SComboBoxBlue tipoAl;
    private javax.swing.JLabel tipoL;
    // End of variables declaration//GEN-END:variables
}
