package modelo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Operaciones {
    Database db = new Database();

    public ArrayList consultar(String tabla){
        ArrayList<Object> datos= new ArrayList<>();
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql="select * from "+tabla;
        try {
            Class.forName(db.getDriver());
            con=DriverManager.getConnection(db.getUrl(), 
                                            db.getUss(), db.getPass());
            pst=con.prepareStatement(sql);
            rs= pst.executeQuery();
            //switchiamos dependiendo de la tabla a ver
            switch(tabla){
                case "persona":
                    while(rs.next()){
                        datos.add(new Persona(rs.getInt("id"), 
                                              rs.getString("nombres"), 
                                              rs.getString("apellidos"), 
                                              rs.getInt("edad"), 
                                              rs.getString("direccion"))); 
                    }
                break;
                case "otratabla":
                    
                break;
            }
            con.close();
            
        } catch (Exception e) {
        }
        
        return datos;
    } 
       
     public  String Agregar(Object obj, String tabla){
        Persona p;
        //una variable que represente la estructura de datos para cada tabla
        //por ejemplo  Producto prod; Clientes cli, etc.... para que en cada case
        //hacer el casting
        Connection con;
        PreparedStatement pst;
        String sql="";
        switch(tabla){
            case "persona":
                p = (Persona) obj; //un casting para cada objeto
                sql="insert into persona values("+
                p.getId() +",'"+p.getNombres()+"','"+
                p.getApellidos()+"',"+p.getEdad()+ ",'"+
                p.getDireccion()+"')";
            break;
            case "otraTAbla":
                //el casting para este objeto
                sql="el valor de la sentencia para esa tabla";
                break;
        }
        try {
             con= DriverManager.getConnection(db.getUrl(), db.getUss(), db.getPass());
             pst=con.prepareStatement(sql);
             pst.executeUpdate();
             return "ok";
             
        } catch (Exception e) {
              return "error";
        }
             
    }   
      public  String Eliminar(String id, String tabla){
        Connection con;
        PreparedStatement pst;
        String sql="delete from " + tabla + " where id="+ id;
                //considerando que todas las tablas tienen el campo id con ese nombre,
                //sino deverian ser los parametros (campoId, valor, tabla)         
        try {
             con= DriverManager.getConnection(db.getUrl(), db.getUss(), db.getPass());
             pst=con.prepareStatement(sql);
             pst.executeUpdate();
             return "ok";
        } catch (Exception e) {
              return "error";
        }
             
    } 
      
      public  String Modificar(Object obj, String tabla){
        Persona p;
        //una variable que represente la estructura de datos para cada tabla
        //por ejemplo  Producto prod; Clientes cli, etc.... para que en cada case
        //hacer el casting
        Connection con;
        PreparedStatement pst;
        String sql="";
        switch(tabla){
            case "persona":
                p = (Persona) obj; //un casting para cada objeto
                sql="update persona set nombres='"+p.getNombres()
                        +"', apellidos='"+p.getApellidos()
                        +"', edad="+p.getEdad()
                        +", direccion='"+p.getDireccion()
                        +"' where id="+p.getId();
            break;
            case "otraTAbla":
                //el casting para este objeto
                sql="el valor de la sentencia para esa tabla";
                break;
        }
        try {
             con= DriverManager.getConnection(db.getUrl(), db.getUss(), db.getPass());
             pst=con.prepareStatement(sql);
             pst.executeUpdate();
             return "ok";
             
        } catch (Exception e) {
              return "error";
        }
             
    }  
     
     
     
     
     
     
     
}
