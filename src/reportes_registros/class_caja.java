package reportes_registros;

import clases_cajas_servicios.*;

public class class_caja {
    String codigo,identidad,paciente, fecha, total;

    public class_caja(String codigo, String identidad, String paciente, String fecha, String total) {
        this.codigo = codigo;
        this.identidad = identidad;
        this.paciente = paciente;
        this.fecha = fecha;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getIdentidad() {
        return identidad;
    }

    public String getPaciente() {
        return paciente;
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

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
}
