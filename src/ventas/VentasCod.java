/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.util.Date;

/**
 *
 *
 */
public class VentasCod {
    
    public static String LISTAR = "SELECT * FROM registro_venta ORDER BY fecha";
    
    public static String REGISTRAR = "INSERT INTO registro_venta(numero, total, fecha) "
            + "VALUES(?,?,?)";
    
    public static String ELIMINAR = "DELETE FROM registro_venta WHERE numero = ?";
    
    public static String ELIMINAR_TODO = "DELETE FROM registro_venta";
    
    private String primaryKey;
    private String total;
    private String fecha;

    public VentasCod(){
        
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
