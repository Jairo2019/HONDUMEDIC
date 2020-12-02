package reportes_registros;

import clases_cajas_servicios.*;

public class class_pacientes {
    String codigo,nombre,apellido, edad;

    public class_pacientes(String codigo, String nombre, String apellido, String edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
