/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import paneles.*;
import pacientes.pacientes;
import Inventarios.*;
import cajaservicios.*;
import alertas.principal.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import empleados.empleados;
import salidas.Salidas;
import paneles.pnl_usuarios;
import ventas.ListaVentas;
import ventas.Ventas;
import registro_examen.*;
import Registro_Salida.salida_hospitalizacion;
import ambulancia.*;
import cirugia.registrar_cirugia;
import caja.caja;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
import cotizaciones.*;
import reportes_registros.*;
import contabilidad.*;
import login.*;

/**
 *
 * @author Rojeru San
 */
public class PrincipalAdministrador extends javax.swing.JFrame {
    public int ancho;
    public int alto;
    boolean b = true;
    private boolean minimiza = false;
    public static boolean cerra = false;

    public pacientes producto = null;
    private Salidas salidas = null;
    private pnl_usuarios usuarios = null;
    public  empleados empleados=null;
    public static ListaVentas lista = null;
    public static Ventas ventas = null;
    public static pnl_menu menu = null;
    public static menu_reportes menu_report = null;
    public static pnl_emergencia servicio_emergencia= null;
    public static pnl_laboratorio servicio_laboratorio=null;
    public static pnl_ambulancia servicio_ambulancia=null;
    public static pnl_endoscopia servicio_endoscopia=null;
    public static pnl_hospitalizacion servicio_hospitalizacion=null;
    public static pnl_rayosx servicio_rayosx= null;
    public static pnl_ultrasonido servicio_ultrasonido=null;
    public static pnl_cirugia servicio_cirugia = null;
    public almacen almacen= null;
    public static inventario_ambulancia inventario_ambulancia=null;
    public static inventario_cirugia inventario_cirugia = null;
    public static inventario_emergencia inventario_emergencia=null;
    public static inventario_endoscopia inventario_endoscopia=null;
    public static inventario_hospitalizacion inventario_hospitalizacion=null;
    public static inventario_laboratorio inventario_laboratorio=null;
    public static inventario_rayosx inventario_rayosx = null;
    public static inventario_ultrasonido inventario_ultrasonido = null;
    public static caja_laboratorio caja_laboratorio =null;
    public static caja_rayosx caja_rayosx =null;
    public static caja_ultrasonido caja_ultrasonido =null;
    public static examen_laboratorio examen_laboratorio= null;
    public static examen_emergencia examen_emergencia = null;
    public static examen_hospitalizacion examen_hospitalizacion = null;
    public static salida_hospitalizacion salida_hospitalizacion=null;
    public static examen_rayosx examen_rayosx=null;
    public static examen_endoscopia examen_endoscopia=null;
    public static caja_endoscopia caja_endoscopia=null;
    public static examen_ultrasonido examen_ultrasonido = null;
    public static ambulancia registro_ambulancia = null;
    public static registrar_ambulancias registrar_ambulancia = null;
    public static registrar_cirugia registrar_cirugia=null;
    public static cotizaciones_general cotizacion = null;
    public static caja caja=null;
    public static estado_resultados_general eresultado=null;
    public static estado_resultados_cafeteria eresultado_cafeteria=null;
    public static estado_resultados_farmacia eresultado_farmacia=null;
    public static estado_resultados_endoscopia eresultado_endoscopia=null;
    public static estado_resultados_ultrasonido eresultado_ultrasonido=null;
    public static estado_resultados_laboratorio eresultado_laboratorio=null;
    public static estado_resultados_rayosx eresultado_rayosx=null;
    public static formbgeneral bgeneral=null;
    public static cuentas_cobrar.cuentas_cobrar cuentas_por_cobrar = null;
    public static deposito.depositos depositos = null;
    public static estadosde_cuenta.estadosde_cuenta estadosde_cuenta = null;
    public static boolean estacerrado(Object obj) {
        JInternalFrame[] activos = escritorio.getAllFrames();
        boolean cerrado = true;
        int i = 0;
        while (i < activos.length && cerrado) {
            if (activos[i] == obj) {
                cerrado = false;
                cerra = false;
            }
            i++;
        }
        return cerrado;
    }

    /**
     * Creates new form Principal
     */
    public PrincipalAdministrador() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/img1/HODUMEDIC.png")).getImage());
        this.setExtendedState(MAXIMIZED_BOTH);
        FadeEffect.fadeInFrame(this, 50, 0.1f);
        principal();
        Hora_Fecha();
        

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
        minimizar = new principal.MaterialButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnpacientes = new principal.MaterialButtomRectangle();
        btnGastos = new principal.MaterialButtomRectangle();
        btncafeteria = new principal.MaterialButtomRectangle();
        btnUsuarios = new principal.MaterialButtomRectangle();
        cerrarSesion = new principal.MaterialButtomRectangle();
        btnmenu = new principal.MaterialButtomRectangle();
        btnempleados = new principal.MaterialButtomRectangle();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnalmacen = new principal.MaterialButtomRectangle();
        btnreportes = new principal.MaterialButtomRectangle();
        jScrollPane1 = new javax.swing.JScrollPane();
        escritorio = new principal.Escritorio();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 111, 177));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 111, 177));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 111, 177), 5));

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

        minimizar.setBackground(new java.awt.Color(255, 255, 255));
        minimizar.setForeground(new java.awt.Color(58, 159, 171));
        minimizar.setText("__");
        minimizar.setToolTipText("<html> <head> <style> #contenedor{background:white;color:black; padding-left:10px;padding-right:10px;margin:0; padding-top:5px;padding-bottom:5px;} </style> </head> <body> <h4 id=\"contenedor\">Minimizar</h4> </body> </html>");
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.setFont(new java.awt.Font("Roboto Medium", 1, 20)); // NOI18N
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HONDUMEDIC");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo-icono1.png"))); // NOI18N

        hora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hora.setText("HORA");

        fecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fecha.setText("DIA - MES - AÑO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(235, 235, 235)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(371, 371, 371)
                .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cerrar, minimizar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(fecha))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cerrar, minimizar});

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        org.jdesktop.swingx.border.DropShadowBorder dropShadowBorder1 = new org.jdesktop.swingx.border.DropShadowBorder();
        dropShadowBorder1.setShowLeftShadow(true);
        dropShadowBorder1.setShowTopShadow(true);
        jPanel3.setBorder(dropShadowBorder1);

        btnpacientes.setBackground(new java.awt.Color(0, 111, 177));
        btnpacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnpacientes.setText("PACIENTES");
        btnpacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpacientes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnpacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpacientesActionPerformed(evt);
            }
        });

        btnGastos.setBackground(new java.awt.Color(0, 111, 177));
        btnGastos.setForeground(new java.awt.Color(255, 255, 255));
        btnGastos.setText("GASTOS");
        btnGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGastos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastosActionPerformed(evt);
            }
        });

        btncafeteria.setBackground(new java.awt.Color(0, 111, 177));
        btncafeteria.setForeground(new java.awt.Color(255, 255, 255));
        btncafeteria.setText("Cafetería");
        btncafeteria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncafeteria.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btncafeteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncafeteriaActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(0, 111, 177));
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        cerrarSesion.setBackground(new java.awt.Color(0, 111, 177));
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setText("CERRAR SESIÓN");
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        btnmenu.setBackground(new java.awt.Color(0, 111, 177));
        btnmenu.setForeground(new java.awt.Color(255, 255, 255));
        btnmenu.setText("MENU");
        btnmenu.setToolTipText("");
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        btnempleados.setBackground(new java.awt.Color(0, 111, 177));
        btnempleados.setForeground(new java.awt.Color(255, 255, 255));
        btnempleados.setText("EMPLEADOS");
        btnempleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnempleados.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(12, 140, 143));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DR. CARLOS TROCHEZ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(12, 140, 143));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HOSPITAL HONDUMEDIC");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(12, 140, 143));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADMINISTRADOR");

        btnalmacen.setBackground(new java.awt.Color(0, 111, 177));
        btnalmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnalmacen.setText("almacén");
        btnalmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnalmacen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnalmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalmacenActionPerformed(evt);
            }
        });

        btnreportes.setBackground(new java.awt.Color(0, 111, 177));
        btnreportes.setForeground(new java.awt.Color(255, 255, 255));
        btnreportes.setText("reportes");
        btnreportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreportes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnpacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnalmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btncafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnreportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        jScrollPane1.setPreferredSize(new java.awt.Dimension(2000, 1500));

        escritorio.setBackground(new java.awt.Color(255, 255, 255));
        escritorio.setMinimumSize(new java.awt.Dimension(10, 10));
        escritorio.setPreferredSize(new java.awt.Dimension(1218, 876));
        jScrollPane1.setViewportView(escritorio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void Hora_Fecha(){
                //Fehca del sistema
        Date sistemaFech = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM yyyy");
        fecha.setText(formato.format(sistemaFech));

        //Hora del sistema
        Timer tiempo = new Timer(100, new PrincipalAdministrador.horas());
        tiempo.start();
    }
    private void principal(){
        producto = new pacientes();
        this.setExtendedState(MAXIMIZED_BOTH);
            producto.setSize(ancho, alto);
            escritorio.add(producto);
            producto.show();
            
    }

    private void btncafeteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncafeteriaActionPerformed
        cafeteriaPrincipalAd f = new cafeteriaPrincipalAd();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btncafeteriaActionPerformed

    private void btnpacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpacientesActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(producto)) {
            producto = new pacientes();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            producto.setSize(width, Height);
            escritorio.add(producto);
            producto.show();
        }
    }//GEN-LAST:event_btnpacientesActionPerformed

    private void btnGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGastosActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(salidas)) {
            salidas = new Salidas();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            salidas.setSize(width, Height);
            escritorio.add(salidas);
            salidas.show();
        }
    }//GEN-LAST:event_btnGastosActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(usuarios)) {
            usuarios = new pnl_usuarios();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            usuarios.setSize(width, Height);
            escritorio.add(usuarios);
            usuarios.show();
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        WarningAlertSalir wa = new WarningAlertSalir(this, true);
        wa.titulo.setText("¿ESTAS SEGURO?");
        wa.msj.setText("SE CERRARA LA SESIÓN ACTUAL");
        wa.msj1.setText("");
        wa.setVisible(true);

        if (WarningAlertSalir.salir) {
            this.dispose();
            new login.Login().setVisible(true);
        }
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
        if (!minimiza) {
            minimiza = false;
            this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        } else {
            minimiza = true;
        }
    }//GEN-LAST:event_minimizarActionPerformed
    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        WarningAlertCerrar wa = new WarningAlertCerrar(this, true);
        wa.titulo.setText("¿ESTAS SEGURO?");
        wa.msj.setText("SE CERRARA LA APLICACIÓN");
        wa.msj1.setText("");
        wa.setVisible(true);
    }//GEN-LAST:event_cerrarActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(menu)) {
            menu = new pnl_menu();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            menu.setSize(width, Height);
            escritorio.add(menu);
            menu.show();
        }       // TODO add your handling code here:
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleadosActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(empleados)) {
            empleados = new empleados();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            empleados.setSize(width, Height);
            escritorio.add(empleados);
            empleados.show();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnempleadosActionPerformed

    private void btnalmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalmacenActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(almacen)) {
            almacen = new almacen();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            almacen.setSize(width, Height);
            escritorio.add(almacen);
            almacen.show();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnalmacenActionPerformed

    private void btnreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(menu_report)) {
            menu_report = new menu_reportes();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            menu_report.setSize(width, Height);
            escritorio.add(menu_report);
            menu_report.show();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnreportesActionPerformed

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
            java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAdministrador().setVisible(true);
            }
        });
    }
    class horas implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Date sistemaHora = new Date();
            String pmAm = "hh:mm:ss a";
            SimpleDateFormat formato = new SimpleDateFormat(pmAm);
            Calendar now = Calendar.getInstance();
            hora.setText(String.format(formato.format(sistemaHora), now));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static principal.MaterialButtomRectangle btnGastos;
    public static principal.MaterialButtomRectangle btnUsuarios;
    public static principal.MaterialButtomRectangle btnalmacen;
    public static principal.MaterialButtomRectangle btncafeteria;
    public static principal.MaterialButtomRectangle btnempleados;
    public static principal.MaterialButtomRectangle btnmenu;
    public static principal.MaterialButtomRectangle btnpacientes;
    public static principal.MaterialButtomRectangle btnreportes;
    private principal.MaterialButton cerrar;
    private principal.MaterialButtomRectangle cerrarSesion;
    public static principal.Escritorio escritorio;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private principal.MaterialButton minimizar;
    // End of variables declaration//GEN-END:variables
}
