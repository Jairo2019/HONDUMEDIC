//package conexion;
//
//import java.sql.*;
//import javax.swing.*;
//
///**
// *
// * @author Sony
// */
//
//public class ConexionBD {
//
//    Connection conect = null;
//
//    public Connection conexion() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conect = DriverManager.getConnection("jdbc:mysql://localhost/botanasplebes", "root", "J_17"); 
//        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
//        }
//        return conect;
//    }   
//    
//     public Connection Desconectar() {
//        try {
//            conect.close();
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error en la conexión" + e);
//        }
//        return conect;
//    }   
//}
