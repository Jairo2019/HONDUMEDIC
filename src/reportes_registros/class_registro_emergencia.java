package reportes_registros;


public class class_registro_emergencia {
    String paciente, medico,encargado,direccion,telefono,unidad,fecha, total;

    public class_registro_emergencia(String paciente, String medico, String encargado, String direccion, String telefono, String unidad, String fecha, String total) {
        this.paciente = paciente;
        this.medico = medico;
        this.encargado = encargado;
        this.direccion = direccion;
        this.telefono = telefono;
        this.unidad = unidad;
        this.fecha = fecha;
        this.total = total;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getMedico() {
        return medico;
    }

    public String getEncargado() {
        return encargado;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getUnidad() {
        return unidad;
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

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    

   
}
