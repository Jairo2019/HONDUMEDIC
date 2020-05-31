/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import cafeteria.ListaAlimentosAd;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import static principal.cafeteriaPrincipalAd.escritorio;

/**
 *
 * @author Rojeru San CL
 */
public class CajaAd extends javax.swing.JInternalFrame {

    /**
     * Creates new form Usuarios
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
    
    public CajaAd() {
        initComponents();
        tablaCaja.getTableHeader().setDefaultRenderer(new principal.EstiloTablaHeader());
        tablaCaja.setDefaultRenderer(Object.class, new principal.EstiloTablaRenderer());
        this.setFrameIcon(new ImageIcon(getClass().getResource("/imagenes/caja/icono.png")));
        tablaCaja.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        limpiaCampos();

    }

    public static String fechaactual() {
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);

    }

    void limpiaCampos() {
        DefaultTableModel modelo = (DefaultTableModel) tablaCaja.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        recibi.setText("");
        cambio.setText("");
        total.setText("0.0");
        fecha.setText("");
        fecha.setText(fechaactual());
        OpcionesVen.numeros();
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
        busca = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        cambio = new app.bolivia.swing.JCTextField();
        codigoL7 = new javax.swing.JLabel();
        calculo = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        recibi = new app.bolivia.swing.JCTextField();
        codigoL6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        fecha = new app.bolivia.swing.JCTextField();
        codigoL5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        vender = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCaja = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        total = new app.bolivia.swing.JCTextField();
        codigoL3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        subtotal = new app.bolivia.swing.JCTextField();
        codigoL9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        isv = new app.bolivia.swing.JCTextField();
        numFac = new app.bolivia.swing.JCTextField();
        codigoL4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        codigoL8 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("CAJA DE COBRO");
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        busca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        busca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/alimento2.png"))); // NOI18N
        busca.setBorder(null);
        busca.setContentAreaFilled(false);
        busca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        busca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        busca.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/alimento1.png"))); // NOI18N
        busca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        busca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 23, 0, 0);
        jPanel2.add(busca, gridBagConstraints);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        cambio.setEditable(false);
        cambio.setBackground(new java.awt.Color(0, 111, 177));
        cambio.setBorder(null);
        cambio.setForeground(new java.awt.Color(255, 255, 255));
        cambio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cambio.setOpaque(false);
        cambio.setPhColor(new java.awt.Color(255, 255, 255));
        cambio.setPlaceholder("CAMBIO");

        codigoL7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/cambio.png"))); // NOI18N
        codigoL7.setToolTipText("CAMBIO");

        calculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        calculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/calculo2.png"))); // NOI18N
        calculo.setBorder(null);
        calculo.setContentAreaFilled(false);
        calculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calculo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/calculo1.png"))); // NOI18N
        calculo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codigoL7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoL7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(calculo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 39);
        jPanel2.add(jPanel8, gridBagConstraints);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        recibi.setBackground(new java.awt.Color(0, 111, 177));
        recibi.setBorder(null);
        recibi.setForeground(new java.awt.Color(255, 255, 255));
        recibi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recibi.setOpaque(false);
        recibi.setPhColor(new java.awt.Color(255, 255, 255));
        recibi.setPlaceholder("RECIBI");

        codigoL6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/recibi.png"))); // NOI18N
        codigoL6.setToolTipText("RECIBI");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(recibi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(codigoL6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoL6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(recibi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 12, 0, 0);
        jPanel2.add(jPanel9, gridBagConstraints);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        fecha.setEditable(false);
        fecha.setBackground(new java.awt.Color(0, 111, 177));
        fecha.setBorder(null);
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fecha.setOpaque(false);
        fecha.setPhColor(new java.awt.Color(255, 255, 255));
        fecha.setPlaceholder("FECHA");

        codigoL5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/fecha.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codigoL5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(codigoL5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 0, 0);
        jPanel2.add(jPanel10, gridBagConstraints);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        vender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/venta2.png"))); // NOI18N
        vender.setBorder(null);
        vender.setContentAreaFilled(false);
        vender.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        vender.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        vender.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/venta1.png"))); // NOI18N
        vender.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        vender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 12, 0);
        jPanel3.add(vender, gridBagConstraints);

        borrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        borrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/elimina2.png"))); // NOI18N
        borrar.setBorder(null);
        borrar.setContentAreaFilled(false);
        borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        borrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        borrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/elimina1.png"))); // NOI18N
        borrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 242, 12, 0);
        jPanel3.add(borrar, gridBagConstraints);

        cancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/cancela2.png"))); // NOI18N
        cancelar.setBorder(null);
        cancelar.setContentAreaFilled(false);
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/cancela1.png"))); // NOI18N
        cancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 12, 190);
        jPanel3.add(cancelar, gridBagConstraints);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.GridBagLayout());

        tablaCaja.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tablaCaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "TIPO ALIMENTO", "DESCRIPCIÓN", "PRECIO (L)", "CANTIDAD", "IMPORTE (L)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaCaja.setRowHeight(20);
        jScrollPane1.setViewportView(tablaCaja);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1056;
        gridBagConstraints.ipady = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 11);
        jPanel4.add(jScrollPane1, gridBagConstraints);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(0, 111, 177));
        total.setBorder(null);
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        total.setOpaque(false);
        total.setPhColor(new java.awt.Color(255, 255, 255));
        total.setPlaceholder("TOTAL");

        codigoL3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/total.png"))); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subtotal.setEditable(false);
        subtotal.setBackground(new java.awt.Color(0, 111, 177));
        subtotal.setBorder(null);
        subtotal.setForeground(new java.awt.Color(255, 255, 255));
        subtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subtotal.setOpaque(false);
        subtotal.setPhColor(new java.awt.Color(255, 255, 255));
        subtotal.setPlaceholder("SUBTOTAL");
        jPanel11.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 16, 84, 30));

        codigoL9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/subT.png"))); // NOI18N
        jPanel11.add(codigoL9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 50));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(0, 651, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(codigoL3))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(codigoL3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 728;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(6, 196, 0, 11);
        jPanel4.add(jPanel7, gridBagConstraints);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img1/HODUMEDIC_1.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 0);
        jPanel5.add(jLabel1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HONDUMEDIC");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(18, 40, 0, 0);
        jPanel5.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CAFETERÍA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        jPanel5.add(jLabel4, gridBagConstraints);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        isv.setBackground(new java.awt.Color(0, 111, 177));
        isv.setBorder(null);
        isv.setForeground(new java.awt.Color(255, 255, 255));
        isv.setText("15");
        isv.setToolTipText("");
        isv.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        isv.setOpaque(false);
        isv.setPhColor(new java.awt.Color(255, 255, 255));
        isv.setPlaceholder("IMPUESTO");
        jPanel6.add(isv, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 120, 38));

        numFac.setEditable(false);
        numFac.setBackground(new java.awt.Color(0, 111, 177));
        numFac.setBorder(null);
        numFac.setForeground(new java.awt.Color(255, 255, 255));
        numFac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        numFac.setOpaque(false);
        numFac.setPhColor(new java.awt.Color(255, 255, 255));
        numFac.setPlaceholder("FACTURA");
        jPanel6.add(numFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 130, 30));

        codigoL4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/numFac.png"))); // NOI18N
        jPanel6.add(codigoL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("NÚMERO DE VENTA");
        jPanel6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        codigoL8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja/igv.png"))); // NOI18N
        jPanel6.add(codigoL8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.insets = new java.awt.Insets(25, 12, 0, 6);
        jPanel5.add(jPanel6, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents
cafeteria.ListaAlimentosAd la;
    private void buscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaActionPerformed
        if (estacerrado(la)) {
            la = new ListaAlimentosAd();
            principal.cafeteriaPrincipalAd.escritorio.add(la);
            la.setVisible(true);
            la.setLocation(200,200);
            la.toFront();
        }else{
            JOptionPane.showMessageDialog(this, "La ventana LISTA DE ALIMENTOS\nya esta abierta !!!", "Aviso", 0,
                    new ImageIcon(getClass().getResource("/imagenes/principal/adver.png")));
        }
    }//GEN-LAST:event_buscaActionPerformed

    private void calculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculoActionPerformed
        if (tablaCaja.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Imposible realizar operación.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (recibi.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor.", "Caja de cobro", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        } else {
            double recibe = Double.parseDouble(recibi.getText());
            double tota = Double.parseDouble(total.getText());

            if (recibe < tota) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor valido.", "Caja de cobro", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            } else {
                CajaAd.cambio.setText(String.valueOf(recibe - tota));
            }
        }
    }//GEN-LAST:event_calculoActionPerformed

    private void venderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderActionPerformed
        if (tablaCaja.getRowCount() < 1) {
            JOptionPane.showMessageDialog(this, "Imposible realizar venta.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            VentasCod vc = new VentasCod();
            vc.setPrimaryKey(numFac.getText());
            vc.setTotal(total.getText());
            vc.setFecha(fecha.getText());
            int opcion = OpcionesVen.registrar(vc);
            if (opcion != 0) {
                limpiaCampos();
                JOptionPane.showMessageDialog(this, "Venta realizada.", "Caja de cobro", 0,
                        new ImageIcon(getClass().getResource("/imagenes/caja/ralizada.png")));
                if (principal.cafeteriaPrincipalAd.cerra1) {
                    OpcionesVen.listar("");
                }
            }
            
                
        }
    }//GEN-LAST:event_venderActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if (tablaCaja.getRowCount() > 0) {
            DefaultTableModel modelo = (DefaultTableModel) tablaCaja.getModel();
            int fila = tablaCaja.getSelectedRow();
            if (fila >= 0) {
                modelo.removeRow(fila);
                ListaAlimentosAd la = new ListaAlimentosAd();
                la.calcular();
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione una fila.", "Caja de cobro", 0,
                        new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay registros\npara eliminar.", "Caja de cobro", 0,
                    new ImageIcon(getClass().getResource("/imagenes/usuarios/info.png")));
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpiaCampos();
    }//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton busca;
    private javax.swing.JButton calculo;
    public static app.bolivia.swing.JCTextField cambio;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel codigoL3;
    private javax.swing.JLabel codigoL4;
    private javax.swing.JLabel codigoL5;
    private javax.swing.JLabel codigoL6;
    private javax.swing.JLabel codigoL7;
    private javax.swing.JLabel codigoL8;
    private javax.swing.JLabel codigoL9;
    private app.bolivia.swing.JCTextField fecha;
    public static app.bolivia.swing.JCTextField isv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public static app.bolivia.swing.JCTextField numFac;
    public static app.bolivia.swing.JCTextField recibi;
    public static app.bolivia.swing.JCTextField subtotal;
    public static javax.swing.JTable tablaCaja;
    public static app.bolivia.swing.JCTextField total;
    private javax.swing.JButton vender;
    // End of variables declaration//GEN-END:variables
}
