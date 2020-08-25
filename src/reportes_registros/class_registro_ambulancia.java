package reportes_registros;

import clases_cajas_servicios.*;

public class class_registro_ambulancia {
    String codigo,paciente, medico, conductor,origen,destino, fecha, total;

    public class_registro_ambulancia(String codigo, String paciente, String medico, String conductor, String origen,String destino, String fecha, String total) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.medico = medico;
        this.conductor = conductor;
        this.origen = origen;
        this.destino = destino;
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

    public String getConductor() {
        return conductor;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
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

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setTotal(String total) {
        this.total = total;
    }


    
}
