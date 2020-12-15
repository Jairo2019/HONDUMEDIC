/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

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
import principal.PrincipalAdministrador;
import static principal.PrincipalAdministrador.escritorio;
import static principal.PrincipalAdministrador.estacerrado;
import static principal.PrincipalAdministrador.menu;

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
    private static void botones_lateral_enfermeria(){
        PrincipalAdministrador.btncafeteria.setEnabled(false);
        PrincipalAdministrador.btnempleados.setEnabled(false);
        PrincipalAdministrador.btnGastos.setEnabled(false);
        PrincipalAdministrador.btnpacientes.setEnabled(true);
        PrincipalAdministrador.btnalmacen.setEnabled(false);
        PrincipalAdministrador.btnUsuarios.setEnabled(false);
        PrincipalAdministrador.btnreportes.setEnabled(false);
    }
    public static void verifica(String usuario, String pas, JFrame login) {
        String user = "", pass = "", tipo_us = "";
        try {
            String sql = "SELECT rol, usuario, password FROM usuarios WHERE usuario = '" + usuario + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                tipo_us = rs.getString(1);
                user = rs.getString(2);
                pass = rs.getString(3);
            }

            if (user.equals(usuario) && pass.equals(pas)) {
                if (tipo_us.equals("Administrador")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    pnl_menu.tipo_usuario="Administrador";
                    pacientes.pacientes.usuario=user;
                }

                if (tipo_us.equals("Enfermeria")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                    botones_lateral_enfermeria();
                    pnl_menu.tipo_usuario="Enfermeria";
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
