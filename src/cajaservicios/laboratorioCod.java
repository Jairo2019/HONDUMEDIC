/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajaservicios;

import cafeteria.*;
import usuarios.*;
import java.io.FileInputStream;
import java.util.Date;

/**
 *
 * @author Rojeru San CL
 */
public class laboratorioCod {
    
    public static String LISTAR = "SELECT * FROM alimentos ORDER BY nombre_al";
    
    public static String REGISTRAR = "INSERT INTO alimentos(codigo_al, tipo_al, nombre_al, precio_al) "
            + "VALUES(?,?,?,?)";
    
    public static String ACTUALIZAR = "UPDATE alimentos SET "
                + "tipo_al=?, "
                + "nombre_al=?, "
                + "precio_al=? WHERE codigo_al=?";
    
    public static String ELIMINAR = "DELETE FROM alimentos WHERE codigo_al = ?";
    
    public static String ELIMINAR_TODO = "DELETE FROM alimentos";
    
    private String primaryKey;
    private String tipoal;
    private String nombre;
    private String precio;

    public laboratorioCod(){
        
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getTipoal() {
        return tipoal;
    }

    public void setTipoal(String tipoal) {
        this.tipoal = tipoal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    
}
