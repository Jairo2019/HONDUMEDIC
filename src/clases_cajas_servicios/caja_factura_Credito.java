package clases_cajas_servicios;

public class caja_factura_Credito {
    String paciente,num_fac,estado,fecha,isv,codigo,nombre_p,fecha_servicio, precio, cantidad,importe, subtotal,adeuda, total;

    public caja_factura_Credito(String paciente, String num_fac, String estado, String fecha, String isv, String codigo, String nombre_p, String fecha_servicio, String precio, String cantidad, String importe, String subtotal, String adeuda, String total) {
        this.paciente = paciente;
        this.num_fac = num_fac;
        this.estado = estado;
        this.fecha = fecha;
        this.isv = isv;
        this.codigo = codigo;
        this.nombre_p = nombre_p;
        this.fecha_servicio = fecha_servicio;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
        this.subtotal = subtotal;
        this.adeuda = adeuda;
        this.total = total;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getNum_fac() {
        return num_fac;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getIsv() {
        return isv;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre_p() {
        return nombre_p;
    }

    public String getFecha_servicio() {
        return fecha_servicio;
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

    public String getAdeuda() {
        return adeuda;
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

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIsv(String isv) {
        this.isv = isv;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre_p(String nombre_p) {
        this.nombre_p = nombre_p;
    }

    public void setFecha_servicio(String fecha_servicio) {
        this.fecha_servicio = fecha_servicio;
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

    public void setAdeuda(String adeuda) {
        this.adeuda = adeuda;
    }

    public void setTotal(String total) {
        this.total = total;
    }


}
