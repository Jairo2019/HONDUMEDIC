
package generadores_codigo;

import cafeteria.OpcionesAl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import ServiciosYConexion.Conexion;


public class GenerarCodigosTest {
    static Conexion cc = new Conexion();
    static Connection cn = cc.ConnectDB();
    static PreparedStatement ps;
    

    public void generarTAmbulancia() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_ambulancia";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                ambulancia.ambulancia.numFac.setText("RA1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                ambulancia.ambulancia.numFac.setText("RA"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generarTCirugia() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_cirugia";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                cirugia.registrar_cirugia.numFac.setText("RC1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                cirugia.registrar_cirugia.numFac.setText("RC"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generarTEmergencia() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_emergencia";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                registro_examen.examen_emergencia.numFac.setText("RE1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                registro_examen.examen_emergencia.numFac.setText("RE"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generarTEmergeciaAPA() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_emergencia_apa";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                unidad_apa.examen_emergencia_apa.numFac.setText("REA1");
            }else{
                id=Integer.parseInt(c.substring(3))+1;
                unidad_apa.examen_emergencia_apa.numFac.setText("REA"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generarTEndoscopia() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_endoscopia";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                registro_examen.examen_endoscopia.numFac.setText("REN1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                registro_examen.examen_endoscopia.numFac.setText("REN"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generarTHospitalizacion() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_hospitalizacion";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                registro_examen.examen_hospitalizacion.numFac.setText("RH1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                registro_examen.examen_hospitalizacion.numFac.setText("RH"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generarTHospiAPA() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_hospitalizacion_apa";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                unidad_apa.examen_hospitalizacion_apa.numFac.setText("RHA1");
            }else{
                id=Integer.parseInt(c.substring(3))+1;
                unidad_apa.examen_hospitalizacion_apa.numFac.setText("RHA"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generarTLab() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_laboratorio";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                registro_examen.examen_laboratorio.numFac.setText("RL1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                registro_examen.examen_laboratorio.numFac.setText("RL"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void generarTRayX() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_rayosx";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                registro_examen.examen_rayosx.numFac.setText("RRX1");
            }else{
                id=Integer.parseInt(c.substring(3))+1;
                registro_examen.examen_rayosx.numFac.setText("RRX"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public void generarTUltrasonido() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM test_ultrasonido";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                registro_examen.examen_ultrasonido.numFac.setText("RU1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                registro_examen.examen_ultrasonido.numFac.setText("RU"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}