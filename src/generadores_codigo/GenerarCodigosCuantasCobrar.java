
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


public class GenerarCodigosCuantasCobrar {
    static Conexion cc = new Conexion();
    static Connection cn = cc.ConnectDB();
    static PreparedStatement ps;
    

    public void generar() {
        int id=0;
        String c = "";
        String SQL = "SELECT MAX(idventa) FROM cuentas_cobrar";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {
                c = rs.getString(1);
            }if(c==null){
                caja.caja.numFac.setText("CC1");
            }else{
                id=Integer.parseInt(c.substring(2))+1;
                caja.caja.numFac.setText("CC"+String.valueOf(id));}
        }catch (SQLException ex) {
            Logger.getLogger(OpcionesAl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}