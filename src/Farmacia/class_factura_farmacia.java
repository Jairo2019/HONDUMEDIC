package Farmacia;

public class class_factura_farmacia {
    String paciente,num_fac,fecha,codigo,nombre_p, precio, cantidad,importe, total;

    public class_factura_farmacia(String paciente, String num_fac, String fecha, String codigo, String nombre_p, String precio, String cantidad, String importe, String total) {
        this.paciente = paciente;
        this.num_fac = num_fac;
        this.fecha = fecha;
        this.codigo = codigo;
        this.nombre_p = nombre_p;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
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

    public String getCodigo() {
        return codigo;
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

    public String getTotal() {
        return total;
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

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public void setTotal(String total) {
        this.total = total;
    }


}
