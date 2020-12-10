package reportes_registros;

public class class_ingresos {
    String codigo,identidad,paciente, fecha, ingresos, total;

    public class_ingresos(String codigo, String identidad, String paciente, String fecha, String ingresos, String total) {
        this.codigo = codigo;
        this.identidad = identidad;
        this.paciente = paciente;
        this.fecha = fecha;
        this.ingresos = ingresos;
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

    public String getIngresos() {
        return ingresos;
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

    public void setIngresos(String ingresos) {
        this.ingresos = ingresos;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
}
