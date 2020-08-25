package reportes_registros;

import clases_cajas_servicios.*;

public class class_caja {
    String codigo,paciente,estado, fecha, total;

    public class_caja(String codigo, String paciente, String estado, String fecha, String total) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.estado = estado;
        this.fecha = fecha;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
}
