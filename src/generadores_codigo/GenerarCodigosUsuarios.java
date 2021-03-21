
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
import ServiciosYConexion.pnl_usuarios;


public class GenerarCodigosUsuarios {
    static Conexion cc = new Conexion();
    static Connection cn = cc.ConnectDB();
    static PreparedStatement ps;
    

    public void generar() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo) FROM usuarios";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                pnl_usuarios.txtCodigo.setText("UID1");
            }else{
                id=Integer.parseInt(c.substring(3))+1;
                pnl_usuarios.txtCodigo.setText("UID"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}