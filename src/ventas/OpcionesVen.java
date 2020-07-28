/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import paneles.Conexion;
import principal.GenerarNumero;


/**
 *
 * @author Rojeru San CL
 */
public class OpcionesVen {

    static Conexion cc = new Conexion();
    static Connection cn = cc.ConnectDB();
    static PreparedStatement ps;

    public static int registrar(VentasCod uc) {
        int rsu = 0;
        String sql = VentasCod.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, uc.getPrimaryKey());
            ps.setString(2, uc.getTotal());
            ps.setString(3, uc.getFecha());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminar(String id) {
        int rsu = 0;
        String sql = VentasCod.ELIMINAR;

        try {
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static int eliminaTodos() {
        int rsu = 0;
        String sql = VentasCod.ELIMINAR_TODO;
        try {
            ps = cn.prepareStatement(sql);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) ventas.RegistroVentas.tablaVentas.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = VentasCod.LISTAR;
        } else {
            sql = "SELECT * FROM registro_venta WHERE (numero like'" + busca + "%' or fecha='" + busca + "')"
                    + " ORDER BY fecha";
        }
        String datos[] = new String[4];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("numero");
                datos[1] = rs.getString("total");
                datos[2] = rs.getString("fecha");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OpcionesVen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void numeros() {
        int j;
        int cont = 1;
        String num = "";
        String c = "";
        String SQL = "SELECT MAX(numero) FROM registro_venta";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getString(1);
            }

            if (c == null) {
                ventas.CajaAd.numFac.setText("00000001");
            } else {
                j = Integer.parseInt(c);
                GenerarNumero gen = new GenerarNumero();
                gen.generar(j);
                ventas.CajaAd.numFac.setText(gen.serie());

            }

        } catch (SQLException ex) {
            Logger.getLogger(OpcionesVen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//    public static void numeros1() {
//        int j;
//        int cont = 1;
//        String num = "";
//        String c = "";
//        String SQL = "SELECT MAX(numero) FROM registro_venta";
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(SQL);
//            if (rs.next()) {
//                c = rs.getString(1);
//            }
//
//            if (c == null) {
//               // ventas.CajaNor.numFac.setText("00000001");
//            } else {
//                j = Integer.parseInt(c);
//                GenerarNumero gen = new GenerarNumero();
//                gen.generar(j);
//                //ventas.CajaNor.numFac.setText(gen.serie());
//
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(OpcionesVen.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
