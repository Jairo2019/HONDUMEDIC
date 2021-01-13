/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import cirugia.registrar_cirugia;
import paneles.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import login.Login;
import paneles.pnl_menu;
import principal.*;
import static principal.PrincipalAdministrador.escritorio;
import static principal.PrincipalAdministrador.estacerrado;
import static principal.PrincipalAdministrador.menu;
import registro_examen.examen_emergencia;
import registro_examen.examen_hospitalizacion;
import unidad_apa.*;

/**
 *
 * @author Rojeru San CL
 */
public class Opciones {

    static Conexion cc = new Conexion();
    static Connection cn = cc.ConnectDB();
    static PreparedStatement ps;

    public static int registrar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getUsuario());
            ps.setString(2, uc.getPassword());
            ps.setString(3, uc.getTipo());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        System.out.println(sql);
        return rsu;
    }

    public static int actualizar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.ACTUALIZAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getUsuario());
            ps.setString(2, uc.getPassword());
            ps.setString(3, uc.getTipo());
            ps.setInt(4, uc.getId());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminar(int id) {
        int rsu = 0;
        String sql = Sentencias.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }


    public static boolean verificaUsuario(String usuario) {
        boolean existe = false;
        String user = "";
        try {
            String sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString(2);
            }

            if (user.equals(usuario)) {
                existe = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return existe;
    }
    private static void show_menu(){
        if (estacerrado(menu)) {
            menu = new pnl_menu();
            int width = escritorio.getWidth();
            int Height = escritorio.getHeight();
            menu.setSize(width, Height);
            escritorio.add(menu);
            menu.show();
        }
    }
     public static void botones_menu_enfermeria(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(true);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(true);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }
       public static void botones_menu_caja(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(true);
        pnl_menu.btncaja.setEnabled(true);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }
       public static void botones_menu_medico(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(true);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(true);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(true);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }
    public static void botones_lateral(){
         PrincipalAdministrador.btnmenu.setEnabled(true);
        PrincipalAdministrador.btncafeteria.setEnabled(false);
        PrincipalAdministrador.btnempleados.setEnabled(false);
        PrincipalAdministrador.btnGastos.setEnabled(false);
        PrincipalAdministrador.btnpacientes.setEnabled(true);
        PrincipalAdministrador.btnalmacen.setEnabled(false);
        PrincipalAdministrador.btnUsuarios.setEnabled(false);
        PrincipalAdministrador.btnreportes.setEnabled(false);
    }
    public static void botones_lateral_administracion(){
        PrincipalAdministrador.btnmenu.setEnabled(true);
        PrincipalAdministrador.btncafeteria.setEnabled(false);
        PrincipalAdministrador.btnempleados.setEnabled(true);
        PrincipalAdministrador.btnGastos.setEnabled(false);
        PrincipalAdministrador.btnpacientes.setEnabled(true);
        PrincipalAdministrador.btnalmacen.setEnabled(false);
        PrincipalAdministrador.btnUsuarios.setEnabled(false);
        PrincipalAdministrador.btnreportes.setEnabled(false);
    }
    public static void botones_lateral_farmacia(){
        PrincipalAdministrador.btnmenu.setEnabled(true);
        PrincipalAdministrador.btncafeteria.setEnabled(false);
        PrincipalAdministrador.btnempleados.setEnabled(false);
        PrincipalAdministrador.btnGastos.setEnabled(false);
        PrincipalAdministrador.btnpacientes.setEnabled(false);
        PrincipalAdministrador.btnalmacen.setEnabled(false);
        PrincipalAdministrador.btnUsuarios.setEnabled(false);
        PrincipalAdministrador.btnreportes.setEnabled(false);
    }
     public static void botones_lateral_almacen(){
         PrincipalAdministrador.btnmenu.setEnabled(false);
        PrincipalAdministrador.btncafeteria.setEnabled(false);
        PrincipalAdministrador.btnempleados.setEnabled(false);
        PrincipalAdministrador.btnGastos.setEnabled(false);
        PrincipalAdministrador.btnpacientes.setEnabled(false);
        PrincipalAdministrador.btnalmacen.setEnabled(true);
        PrincipalAdministrador.btnUsuarios.setEnabled(false);
        PrincipalAdministrador.btnreportes.setEnabled(false);
    }
     public static void botones_lateral_cafeteria(){
         PrincipalAdministrador.btnmenu.setEnabled(false);
        PrincipalAdministrador.btncafeteria.setEnabled(true);
        PrincipalAdministrador.btnempleados.setEnabled(false);
        PrincipalAdministrador.btnGastos.setEnabled(false);
        PrincipalAdministrador.btnpacientes.setEnabled(false);
        PrincipalAdministrador.btnalmacen.setEnabled(false);
        PrincipalAdministrador.btnUsuarios.setEnabled(false);
        PrincipalAdministrador.btnreportes.setEnabled(false);
    }
     public static void botones_lateral_gerencia(){
         PrincipalAdministrador.btnmenu.setEnabled(true);
        PrincipalAdministrador.btncafeteria.setEnabled(true);
        PrincipalAdministrador.btnempleados.setEnabled(true);
        PrincipalAdministrador.btnGastos.setEnabled(true);
        PrincipalAdministrador.btnpacientes.setEnabled(true);
        PrincipalAdministrador.btnalmacen.setEnabled(true);
        PrincipalAdministrador.btnUsuarios.setEnabled(true);
        PrincipalAdministrador.btnreportes.setEnabled(true);
    }
     public static void botones_menu_administracion(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(true);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }
     public static void botones_menu_ambulancia(){
        pnl_menu.btnambulancia.setEnabled(true);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }
     public static void botones_menu_endoscopia(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(true);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }
    public static void botones_menu_rayosx(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(true);
        pnl_menu.btnultrasonido.setEnabled(false);
    } 
    public static void botones_menu_laboratorio(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(true);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }
    public static void botones_menu_ultrasonido(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(true);
    }
    public static void botones_menu_farmacia(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(false);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(true);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }
    public static void botones_menu_cirugia(){
        pnl_menu.btnambulancia.setEnabled(false);
        pnl_menu.btnadmin.setEnabled(false);
        pnl_menu.btncaja.setEnabled(false);
        pnl_menu.btncirugia.setEnabled(true);
        pnl_menu.btncontabilidad.setEnabled(false);
        pnl_menu.btnemergencia.setEnabled(false);
        pnl_menu.btnendoscopia.setEnabled(false);
        pnl_menu.btnfarmacia.setEnabled(false);
        pnl_menu.btnhopitalizacion.setEnabled(false);
        pnl_menu.btnlaboratorio.setEnabled(false);
        pnl_menu.btnrayosx.setEnabled(false);
        pnl_menu.btnultrasonido.setEnabled(false);
    }

    public static void verifica(String usuario, String pas, JFrame login) {
        String user = "", pass = "", tipo_us = "",name="";
        try {
            String sql = "SELECT rol, usuario, password, concat(nombre,' ',apellido) FROM usuarios WHERE usuario = '" + usuario + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                tipo_us = rs.getString(1);
                user = rs.getString(2);
                pass = rs.getString(3);
                name = rs.getString(4);
            }

            if (user.equals(usuario) && pass.equals(pas)) {        
                if (tipo_us.equals("Administración")) {
          
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral_administracion();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Administración";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Administración";
                    examen_emergencia.tipo_usuario="Administración";
                    examen_hospitalizacion.tipo_usuario="Administración";
                    examen_emergencia_apa.tipo_usuario="Administración";
                    examen_hospitalizacion_apa.tipo_usuario="Administración";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Enfermeria")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Enfermeria";
                    pnl_menu.name_usuario=name;
                     registrar_cirugia.tipo_usuario="";
                    examen_emergencia.tipo_usuario="";
                    examen_hospitalizacion.tipo_usuario="";
                    examen_emergencia_apa.tipo_usuario="";
                     examen_hospitalizacion_apa.tipo_usuario="";
                    pacientes.pacientes.usuario=user;   
                }else if (tipo_us.equals("Médico")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Médico";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Médico";
                    examen_emergencia.tipo_usuario="Médico";
                    examen_hospitalizacion.tipo_usuario="Médico";
                    examen_emergencia_apa.tipo_usuario="Médico";
                    examen_hospitalizacion_apa.tipo_usuario="Médico";
                    pacientes.pacientes.usuario=user;   
                }else if (tipo_us.equals("Almacén")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral_almacen();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Almacén";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Almacén";
                    examen_emergencia.tipo_usuario="Almacén";
                    examen_hospitalizacion.tipo_usuario="Almacén";
                    examen_emergencia_apa.tipo_usuario="Almacén";
                    examen_hospitalizacion_apa.tipo_usuario="Almacén";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Ambulancia")) {
                    login.dispose();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral();
                    pnl_menu.tipo_usuario="Ambulancia";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Ambulancia";
                    examen_emergencia.tipo_usuario="Ambulancia";
                    examen_hospitalizacion.tipo_usuario="Ambulancia";
                    examen_emergencia_apa.tipo_usuario="Ambulancia";
                    examen_hospitalizacion_apa.tipo_usuario="Ambulancia";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Caja")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Caja";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Caja";
                    examen_emergencia.tipo_usuario="Caja";
                    examen_hospitalizacion.tipo_usuario="Caja";
                    examen_emergencia_apa.tipo_usuario="Caja";
                    examen_hospitalizacion_apa.tipo_usuario="Caja";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Cafetería")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral_cafeteria();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Cafetería";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Cafetería";
                    examen_emergencia.tipo_usuario="Cafetería";
                    examen_hospitalizacion.tipo_usuario="Cafetería";
                    examen_emergencia_apa.tipo_usuario="Cafetería";
                    examen_hospitalizacion_apa.tipo_usuario="Cafetería";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Cirugía")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Cirugía";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Cirugía";
                    examen_emergencia.tipo_usuario="Cirugía";
                    examen_hospitalizacion.tipo_usuario="Cirugía";
                    examen_emergencia_apa.tipo_usuario="Cirugía";
                    examen_hospitalizacion_apa.tipo_usuario="Cirugía";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Endoscopia")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Endoscopia";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Endoscopia";
                    examen_emergencia.tipo_usuario="Endoscopia";
                    examen_hospitalizacion.tipo_usuario="Endoscopia";
                    examen_emergencia_apa.tipo_usuario="Endoscopia";
                    examen_hospitalizacion_apa.tipo_usuario="Endoscopia";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Farmacia")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral_farmacia();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Farmacia";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Farmacia";
                    examen_emergencia.tipo_usuario="Farmacia";
                    examen_hospitalizacion.tipo_usuario="Farmacia";
                    examen_emergencia_apa.tipo_usuario="Farmacia";
                    examen_hospitalizacion_apa.tipo_usuario="Farmacia";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Gerencia")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    botones_lateral_gerencia();
                    pnl_menu.tipo_usuario="Gerencia";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Gerencia";
                    examen_emergencia.tipo_usuario="Gerencia";
                    examen_hospitalizacion.tipo_usuario="Gerencia";
                    examen_emergencia_apa.tipo_usuario="Gerencia";
                    examen_hospitalizacion_apa.tipo_usuario="Gerencia";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("Laboratorio")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="Laboratorio";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="Laboratorio";
                    examen_emergencia.tipo_usuario="Laboratorio";
                    examen_hospitalizacion.tipo_usuario="Laboratorio";
                    examen_emergencia_apa.tipo_usuario="Laboratorio";
                    examen_hospitalizacion_apa.tipo_usuario="Laboratorio";
                    pacientes.pacientes.usuario=user;
                }else if (tipo_us.equals("RayosX")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral();
                    PrincipalAdministrador.name_usuario=name;
                    PrincipalAdministrador.tipo_usuario=tipo_us;
                    PrincipalAdministrador.lbluser.setText(name);
                    PrincipalAdministrador.lblrol.setText(tipo_us);
                    pnl_menu.tipo_usuario="RayosX";
                    pnl_menu.name_usuario=name;
                    registrar_cirugia.tipo_usuario="RayosX";
                    examen_emergencia.tipo_usuario="RayosX";
                    examen_hospitalizacion.tipo_usuario="RayosX";
                    examen_emergencia_apa.tipo_usuario="RayosX";
                    examen_hospitalizacion_apa.tipo_usuario="RayosX";
                    pacientes.pacientes.usuario=user;
                }
            } else {
                Login.info.setText("¡ USUARIO O CONTRASEÑA INCORRECTOS !");
                Login.txtUserName.setText("");
                Login.txtPassword.setText("");
                Login.txtUserName.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
