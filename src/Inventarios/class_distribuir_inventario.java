package Inventarios;

public class class_distribuir_inventario {
    String codigo,producto,precio, decripcion, cantidad;

    public class_distribuir_inventario(String codigo, String producto, String precio, String decripcion, String cantidad) {
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
        this.decripcion = decripcion;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProducto() {
        return producto;
    }

    public String getPrecio() {
        return precio;
    }

    public String getDecripcion() {
        return decripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public void setDecripcion(String decripcion) {
        this.decripcion = decripcion;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}
