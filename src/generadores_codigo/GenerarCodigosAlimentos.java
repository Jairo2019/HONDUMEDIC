
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


public class GenerarCodigosAlimentos {
    static Conexion cc = new Conexion();
    static Connection cn = cc.ConnectDB();
    static PreparedStatement ps;
    

    public void generar() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(codigo_al) FROM alimentos";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }
            if(c==null){
                cafeteria.Alimentos.codigo.setText("AL1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                cafeteria.Alimentos.codigo.setText("AL"+String.valueOf(id));
            }
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}