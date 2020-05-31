/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;


/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM producto ORDER BY tipoproducto";
    public static String LISTAR1 = "SELECT * FROM ventas, producto WHERE id_producto = idproducto";

    public static String REGISTRAR = "INSERT INTO ventas(idventa, id_producto, cantidad, total, fecha) "
            + "VALUES(?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE producto SET "
            + "nombre=?, "
            + "descripcion=?, "
            + "tipoproducto=?, "
            + "precio=? "
            + "WHERE idproducto=?";

    public static String ELIMINAR = "DELETE FROM ventas WHERE idventa = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE ventas";

    private int id_venta;
    private int id_producto;
    private int cantidad;
    private double total;
    private String fecha;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
   
}
