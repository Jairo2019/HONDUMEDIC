package clases_cajas_servicios;

public class caja_pago_cuota {
    String paciente,num_fac,estado,fecha,debe,codigo,nombre_p,fecha_servicio, precio, cantidad,importe, saldo_adeudado, total;

    public caja_pago_cuota(String paciente, String num_fac, String estado, String fecha, String debe, String codigo, String nombre_p, String fecha_servicio, String precio, String cantidad, String importe, String saldo_adeudado, String total) {
        this.paciente = paciente;
        this.num_fac = num_fac;
        this.estado = estado;
        this.fecha = fecha;
        this.debe = debe;
        this.codigo = codigo;
        this.nombre_p = nombre_p;
        this.fecha_servicio = fecha_servicio;
        this.precio = precio;
        this.cantidad = cantidad;
        this.importe = importe;
        this.saldo_adeudado = saldo_adeudado;
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

    public String getDebe() {
        return debe;
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

    public String getSaldo_adeudado() {
        return saldo_adeudado;
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

    public void setDebe(String debe) {
        this.debe = debe;
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

    public void setSaldo_adeudado(String saldo_adeudado) {
        this.saldo_adeudado = saldo_adeudado;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
 }