package reportes_servicios;


public class class_servicios {
    String servicio,descripcion, precio;

    public class_servicios(String servicio, String descripcion, String precio) {
        this.servicio = servicio;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getServicio() {
        return servicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
  }
