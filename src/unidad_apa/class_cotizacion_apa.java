package unidad_apa;

import clases_cajas_servicios.*;

public class class_cotizacion_apa {
    String paciente,num_fac,fecha,isv,codigo,nombre_p, precio, cantidad,importe, subtotal, total;

    public class_cotizacion_apa(String paciente, String num_fac, String fecha, String isv, String codigo, String nombre_p, String precio, String cantidad, String importe, String subtotal, String total) {
        this.paciente = paciente;
        this.num_fac = num_fac;
        this.fecha = fecha;
        this.isv = isv;
        this.codigo = codigo;
        this.nombre_p = nombre_p;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
        this.subtotal = subtotal;
        this.total = total;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getNum_fac() {
        return num_fac;
    }
    public String getFecha() {
        return fecha;
    }

    public String getIsv() {
        return isv;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public String getPrecio() {
        return precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getImporte() {
        return importe;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public String getTotal() {
        return total;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setNum_fac(String num_fac) {
        this.num_fac = num_fac;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIsv(String isv) {
        this.isv = isv;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotal(String total) {
        this.total = total;
    }   
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }  
}
