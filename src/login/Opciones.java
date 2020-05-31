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
import javax.swing.table.DefaultTableModel;
import login.Login;
import paneles.pnl_usuarios;

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

    public static void verifica(String usuario, String pas, JFrame login) {
        String user = "", pass = "", tipo_us = "";
        try {
            String sql = "SELECT * FROM usuarios WHERE usuario = '" + usuario + "'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                user = rs.getString(11);
                pass = rs.getString(12);
                tipo_us = rs.getString(10);
            }

            if (user.equals(usuario) && pass.equals(pas)) {
                if (tipo_us.equals("Administrador")) {
                    login.dispose();
                    new principal.PrincipalAdministrador().setVisible(true);
                }

                if (tipo_us.equals("NORMAL")) {
                    login.dispose();
//                    new principal.Principal().setVisible(true);
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
