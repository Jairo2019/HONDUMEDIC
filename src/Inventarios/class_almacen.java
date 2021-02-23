package Inventarios;


public class class_almacen {
    String producto, proveedor, precio_compra,cantidad,fechavenc,cantidad_minima;

    public class_almacen(String producto, String proveedor, String precio_compra, String cantidad, String fechavenc, String cantidad_minima) {
        this.producto = producto;
        this.proveedor = proveedor;
        this.precio_compra = precio_compra;
        this.cantidad = cantidad;
        this.fechavenc = fechavenc;
        this.cantidad_minima = cantidad_minima;
    }

    public String getProducto() {
        return producto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getPrecio_compra() {
        return precio_compra;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getFechavenc() {
        return fechavenc;
    }

    public String getCantidad_minima() {
        return cantidad_minima;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setPrecio_compra(String precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechavenc(String fechavenc) {
        this.fechavenc = fechavenc;
    }

    public void setCantidad_minima(String cantidad_minima) {
        this.cantidad_minima = cantidad_minima;
    }
    
    
}
