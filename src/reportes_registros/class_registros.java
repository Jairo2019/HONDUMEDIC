package reportes_registros;

import clases_cajas_servicios.*;

public class class_registros {
    String codigo,paciente, medico, habitacion,observaciones, fecha, total;

    public class_registros(String codigo, String paciente, String medico, String habitacion, String observaciones, String fecha, String total) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.medico = medico;
        this.habitacion = habitacion;
        this.observaciones = observaciones;
        this.fecha = fecha;
        this.total = total;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getMedico() {
        return medico;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public String getObservaciones() {
        return observaciones;
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

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(String total) {
        this.total = total;
    }


    
}
