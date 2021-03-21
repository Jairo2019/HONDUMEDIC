
package generadores_codigo;

import principal.*;
import static Inventarios.almacen.txtCodigo;
import cafeteria.OpcionesAl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import ServiciosYConexion.Conexion;


public class GenerarCodigosServicios {
    static Conexion cc = new Conexion();
    static Connection cn = cc.ConnectDB();
    static PreparedStatement ps;
    

    public void generar_ambulancia() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_ambulancia) FROM servicio_ambulancia";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ServiciosYConexion.pnl_ambulancia.txtCodigo.setText("SA1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ServiciosYConexion.pnl_ambulancia.txtCodigo.setText("SA"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generar_cirugia() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_cirugia)  FROM cirugia";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ServiciosYConexion.pnl_cirugia.txtCodigo.setText("SC1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ServiciosYConexion.pnl_cirugia.txtCodigo.setText("SC"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generar_emergencia() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_emergencia) FROM servicio_emergencia";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ServiciosYConexion.pnl_emergencia.txtCodigo.setText("SM1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ServiciosYConexion.pnl_emergencia.txtCodigo.setText("SM"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generar_emergencia_APA() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_emergencia) FROM servicio_emergencia_apa";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                unidad_apa.pnl_emergencia_apa.txtCodigo.setText("SEA1");
            }else{
                id=Integer.parseInt(c.substring(3))+1;
                unidad_apa.pnl_emergencia_apa.txtCodigo.setText("SEA"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generar_endoscopia() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_endoscopia) FROM servicio_endoscopia";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ServiciosYConexion.pnl_endoscopia.txtCodigo.setText("SE1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ServiciosYConexion.pnl_endoscopia.txtCodigo.setText("SE"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generar_hospitalizacion() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_hospitalizacion) FROM servicio_hospitalizacion";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ServiciosYConexion.pnl_hospitalizacion.txtCodigo.setText("SH1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ServiciosYConexion.pnl_hospitalizacion.txtCodigo.setText("SH"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generar_hospitalizacion_APA() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_hospitalizacion) FROM servicio_hospitalizacion_apa";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                unidad_apa.pnl_hospitalizacion_apa.txtCodigo.setText("SHA1");
            }else{
                id=Integer.parseInt(c.substring(3))+1;
                unidad_apa.pnl_hospitalizacion_apa.txtCodigo.setText("SHA"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generar_laboratorio() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_laboratorio) FROM servicio_laboratorio";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ServiciosYConexion.pnl_laboratorio.txtCodigo.setText("SL1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ServiciosYConexion.pnl_laboratorio.txtCodigo.setText("SL"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void generar_rayosx() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_rayosx) FROM servicio_rayosx";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ServiciosYConexion.pnl_rayosx.txtCodigo.setText("SR1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ServiciosYConexion.pnl_rayosx.txtCodigo.setText("SR"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public void generar_ultrasonido() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_ultrasonido) FROM servicio_ultrasonido";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ServiciosYConexion.pnl_ultrasonido.txtCodigo.setText("SU1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ServiciosYConexion.pnl_ultrasonido.txtCodigo.setText("SU"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}