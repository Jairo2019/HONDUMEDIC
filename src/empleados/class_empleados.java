package empleados;

public class class_empleados {
    String nombre,apellido,rol,direccion,telefono,tipoempleado;

    public class_empleados(String nombre, String apellido, String rol, String direccion, String telefono, String tipoempleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tipoempleado = tipoempleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getRol() {
        return rol;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipoempleado() {
        return tipoempleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipoempleado(String tipoempleado) {
        this.tipoempleado = tipoempleado;
    }

    
  }
