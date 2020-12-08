package reportes_registros;

public class class_registros {
    String paciente,encargado,telefono,fecha, total;

    public class_registros(String paciente, String encargado, String telefono, String fecha, String total) {
        this.paciente = paciente;
        this.encargado = encargado;
        this.telefono = telefono;
        this.fecha = fecha;
        this.total = total;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getEncargado() {
        return encargado;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(String total) {
        this.total = total;
    }

}
