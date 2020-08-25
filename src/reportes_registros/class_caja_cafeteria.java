package reportes_registros;

import clases_cajas_servicios.*;

public class class_caja_cafeteria {
    String codigo,total, fecha;

    public class_caja_cafeteria(String codigo,String total, String fecha) {
        this.codigo = codigo;
        this.total = total;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTotal() {
        return total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

   
    
}
