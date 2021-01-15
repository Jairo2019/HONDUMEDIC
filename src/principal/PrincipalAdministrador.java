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
import unidad_apa.*;
import login.*;

/**
 *
 * @author Rojeru San
 */
public class PrincipalAdministrador extends javax.swing.JFrame {
    public static String tipo_usuario="";
    public static String name_usuario="";
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
    public static pnl_emergencia_apa servicio_emergencia_apa = null;
    public static inventario_emergencia_apa inventario_emergencia_apa = null;
    public static examen_emergencia_apa examen_emergencia_apa = null;
    public  static pnl_hospitalizacion_apa servicio_hospitalizacion_apa = null;
    public static inventario_hospitalizacion_apa inventario_hospitalizacion_apa =null;
    public static examen_hospitalizacion_apa examen_hospitalizacion_apa = null;
    public static salida_hospitalizacion_apa salida_hospitalizacion_apa = null;
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
        this.setTitle("SISTEMA HONDUMEDIC");
        user();
        FadeEffect.fadeInFrame(this, 50, 0.1f);
        principal();
        Hora_Fecha();
        botones();
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
        lblrol = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cerrarSesion = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnempleados = new principal.MaterialButton();
        btnmenu = new principal.MaterialButton();
        btncafeteria = new principal.MaterialButton();
        btnpacientes = new principal.MaterialButton();
        btnGastos = new principal.MaterialButton();
        btnreportes = new principal.MaterialButton();
        btnalmacen = new principal.MaterialButton();
        btnUsuarios = new principal.MaterialButton();
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
                .addContainerGap(14, Short.MAX_VALUE))
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

        lblrol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblrol.setForeground(new java.awt.Color(12, 140, 143));
        lblrol.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblrol.setText("Acceso");

        lbluser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbluser.setForeground(new java.awt.Color(12, 140, 143));
        lbluser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbluser.setText("Nombre Usuario");
        lbluser.setIconTextGap(10);

        cerrarSesion.setBackground(new java.awt.Color(0, 111, 177));
        cerrarSesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sign_out_32.png"))); // NOI18N
        cerrarSesion.setText("Cerrar Sesión");
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cerrarSesion.setIconTextGap(10);
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/-usuario.png"))); // NOI18N

        btnempleados.setBackground(new java.awt.Color(0, 111, 177));
        btnempleados.setForeground(new java.awt.Color(255, 255, 255));
        btnempleados.setText("Empleados");
        btnempleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnempleados.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnempleados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnempleados.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnempleados.setIconTextGap(0);
        btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadosActionPerformed(evt);
            }
        });

        btnmenu.setBackground(new java.awt.Color(0, 111, 177));
        btnmenu.setForeground(new java.awt.Color(255, 255, 255));
        btnmenu.setText("Menu");
        btnmenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmenu.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnmenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnmenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnmenu.setIconTextGap(0);
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });

        btncafeteria.setBackground(new java.awt.Color(0, 111, 177));
        btncafeteria.setForeground(new java.awt.Color(255, 255, 255));
        btncafeteria.setText("Cefetería");
        btncafeteria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncafeteria.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btncafeteria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btncafeteria.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btncafeteria.setIconTextGap(0);
        btncafeteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncafeteriaActionPerformed(evt);
            }
        });

        btnpacientes.setBackground(new java.awt.Color(0, 111, 177));
        btnpacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnpacientes.setText("Pacientes");
        btnpacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnpacientes.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnpacientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnpacientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnpacientes.setIconTextGap(0);
        btnpacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpacientesActionPerformed(evt);
            }
        });

        btnGastos.setBackground(new java.awt.Color(0, 111, 177));
        btnGastos.setForeground(new java.awt.Color(255, 255, 255));
        btnGastos.setText("Gastos");
        btnGastos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGastos.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnGastos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGastos.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnGastos.setIconTextGap(0);
        btnGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGastosActionPerformed(evt);
            }
        });

        btnreportes.setBackground(new java.awt.Color(0, 111, 177));
        btnreportes.setForeground(new java.awt.Color(255, 255, 255));
        btnreportes.setText("Reportes");
        btnreportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnreportes.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnreportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnreportes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnreportes.setIconTextGap(0);
        btnreportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportesActionPerformed(evt);
            }
        });

        btnalmacen.setBackground(new java.awt.Color(0, 111, 177));
        btnalmacen.setForeground(new java.awt.Color(255, 255, 255));
        btnalmacen.setText("Almacén");
        btnalmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnalmacen.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnalmacen.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnalmacen.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnalmacen.setIconTextGap(0);
        btnalmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalmacenActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(0, 111, 177));
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIconTextGap(0);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbluser, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(lblrol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnempleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncafeteria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnpacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGastos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnreportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnalmacen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblrol)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncafeteria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnempleados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnpacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnreportes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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
    //mostrar acceo y nombre del usuario
    private void user(){
        String user, rol;
        user=name_usuario;
        rol=tipo_usuario;
        lblrol.setText(rol);
        lbluser.setText(user);
    }
     //Acceso a Para cada Usuario
    private void botones(){
        if("Enfermeria".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("Médico".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("Administración".equals(tipo_usuario)){
            Opciones.botones_lateral_administracion();
        }else if("Caja".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("Ambulancia".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("Endoscopia".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("RayosX".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("Laboratorio".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("Ultrasonido".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("Farmacia".equals(tipo_usuario)){
            Opciones.botones_lateral_farmacia();
        }else if("Cirugía".equals(tipo_usuario)){
            Opciones.botones_lateral();
        }else if("Almacén".equals(tipo_usuario)){
            Opciones.botones_lateral_almacen();
        }
        else if("Cafetería".equals(tipo_usuario)){
            Opciones.botones_lateral_cafeteria();
        }else if("Gerencia".equals(tipo_usuario)){
            Opciones.botones_lateral_gerencia();
        }
    }
    private void principal(){
        producto = new pacientes();
        this.setExtendedState(MAXIMIZED_BOTH);
            producto.setSize(ancho, alto);
            escritorio.add(producto);
            producto.show();
            
    }

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

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        WarningAlertSalir wa = new WarningAlertSalir(this, true);
        wa.titulo.setText("¿ESTAS SEGURO?");
        wa.msj.setText("SE CERRARA LA SESIÓN ACTUAL");
        wa.msj1.setText("");
        wa.setVisible(true);

        if (WarningAlertSalir.salir) {
            this.dispose();
            new login.Login().setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void btnempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleadosActionPerformed
     PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(empleados)) {
            empleados = new empleados();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            empleados.setSize(width, Height);
            escritorio.add(empleados);
            empleados.show();
        } 
    }//GEN-LAST:event_btnempleadosActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(menu)) {
            menu = new pnl_menu();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            menu.setSize(width, Height);
            escritorio.add(menu);
            menu.show();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btncafeteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncafeteriaActionPerformed
        cafeteriaPrincipalAd f = new cafeteriaPrincipalAd();
        f.setVisible(true);
        hide();
        cafeteriaPrincipalAd.lbluser.setText(name_usuario);
        cafeteriaPrincipalAd.lblrol.setText(tipo_usuario);
         // TODO add your handling code here:
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
        }        // TODO add your handling code here:
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
        }         // TODO add your handling code here:
    }//GEN-LAST:event_btnGastosActionPerformed

    private void btnreportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportesActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(menu_report)) {
            menu_report = new menu_reportes();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            menu_report.setSize(width, Height);
            escritorio.add(menu_report);
            menu_report.show();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnreportesActionPerformed

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

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        PrincipalAdministrador.escritorio.removeAll();
        if (estacerrado(usuarios)) {
            usuarios = new pnl_usuarios();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            usuarios.setSize(width, Height);
            escritorio.add(usuarios);
            usuarios.show();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnUsuariosActionPerformed

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
    public static principal.MaterialButton btnGastos;
    public static principal.MaterialButton btnUsuarios;
    public static principal.MaterialButton btnalmacen;
    public static principal.MaterialButton btncafeteria;
    public static principal.MaterialButton btnempleados;
    public static principal.MaterialButton btnmenu;
    public static principal.MaterialButton btnpacientes;
    public static principal.MaterialButton btnreportes;
    private principal.MaterialButton cerrar;
    public static javax.swing.JButton cerrarSesion;
    public static principal.Escritorio escritorio;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblrol;
    public static javax.swing.JLabel lbluser;
    private principal.MaterialButton minimizar;
    // End of variables declaration//GEN-END:variables
}
