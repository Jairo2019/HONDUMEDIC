/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_cajas_servicios;

import ventas.*;


/**
 *
 * @author Rojeru San CL
 */
public class sentencias_laboratorio {

    public static String LISTAR = "SELECT * FROM caja_laboratorio where estado='activo' ORDER BY fecha";
    public static String LISTAR1 = "SELECT * FROM caja_laboratorio, servicio_laboratorio WHERE id_paciente = idpaciente";

    public static String REGISTRAR = "INSERT INTO caja_laboratorio(idventa, id_paciente, total, fecha, estado_pago, estado) "
            + "VALUES(?,?,?,?,?,?)";



    public static String ELIMINAR = "DELETE FROM caja_laboratorio WHERE idventa = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE ventas";

    private int id_venta;
    private int id_paciente;
    private double total;
    private String fecha;
     private String estado_pago;
    private String estado;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
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

    public String getEstado_pago() {
        return estado_pago;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
   
}
