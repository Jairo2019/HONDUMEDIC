
package lista_productos_servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import ServiciosYConexion.Conexion;

public class ProductoDAO {
    int r;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion acceso = new Conexion();
    Producto pro = new Producto();
    public int actualizarEstado_Gastos (int cant, String idp){
       String sql="update gastos set estado=? where idgasto=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }
    //metodo actualizar la tabla almacen
     public int actualizarStock_almacen (int cant, String idp){
       String sql="update almacen set cantidad=? where codigo_almacen=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }
   public int actualizarStock(int cant, String idp){
       String sql="update inventario_laboratorio set cantidad=? where codigo_laboratorio=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }public int actualizarStock_farmacia(int cant, String idp){
       String sql="update inventario_farmacia set cantidad=? where codigo_farmacia=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }
     public int actualizarStock_emergencia(int cant, String idp){
       String sql="update inventario_emergencia set cantidad=? where codigo_emergencia=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }public int actualizarStock_emergencia_apa(int cant, String idp){
       String sql="update inventario_emergencia_apa set cantidad=? where codigo_emergencia=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }
          public int actualizarStock_hospitalizacion(int cant, String idp){
       String sql="update inventario_hospitalizacion set cantidad=? where codigo_hospitalizacion=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }public int actualizarStock_hospitalizacion_apa(int cant, String idp){
       String sql="update inventario_hospitalizacion_apa set cantidad=? where codigo_hospitalizacion=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }
          public int actualizarStock_rayosx(int cant, String idp){
       String sql="update inventario_rayosx set cantidad=? where codigo_rayosx=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }  public int actualizarStock_cirugia(int cant, String idp){
       String sql="update inventario_cirugia set cantidad=? where codigo_cirugia=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   } 
          public int actualizarStock_ambulancia(int cant, String idp){
       String sql="update inventario_ambulancia set cantidad=? where codigo_ambulancia=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }  
          public int actualizarStock_endoscopia(int cant, String idp){
       String sql="update inventario_endoscopia set cantidad=? where codigo_endoscopia=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   } 
          public int actualizarStock_ultrasonido(int cant, String idp){
       String sql="update inventario_ultrasonido set cantidad=? where codigo_ultrasonido=?";
       try {
           con=acceso.ConnectDB();
           ps=con.prepareStatement(sql);
           ps.setInt(1, cant);
           ps.setString(2, idp);
           ps.executeUpdate();
       } catch (Exception e) {
       }
       return r;
   }   
    public Producto listarID(String id){
        Producto p=new Producto();
        String sql="select * from inventario_laboratorio where codigo_laboratorio=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
    //metodo listar el id de la tabla alamacen para actulizar stock
    public Producto listarID_almacen(String id){
        Producto p=new Producto();
        String sql="select codigo_almacen, producto, precio_venta,descripcion, cantidad from almacen where codigo_almacen=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
    public Producto listarID_inventarioFarmacia(String id){
        Producto p=new Producto();
        String sql="select codigo_farmacia,nombre,precio_venta,fechavencimiento,cantidad from inventario_farmacia where codigo_farmacia=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
       public Producto listarID_emergencia(String id){
        Producto p=new Producto();
        String sql="select * from inventario_emergencia where codigo_emergencia=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
       public Producto listarID_emergencia_no(String id){
        Producto p=new Producto();
        String sql="select * from WHERE NOT EXISTS (SELECT codigo_emergencia FROM inventario_emergencia WHERE codigo_emergencia=?)";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
            public Producto listarID_emergencia_APA(String id){
        Producto p=new Producto();
        String sql="select * from inventario_emergencia_apa where codigo_emergencia=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
       public Producto listarID_hospitalizacion(String id){
        Producto p=new Producto();
        String sql="select * from inventario_hospitalizacion where codigo_hospitalizacion=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }public Producto listarID_hospitalizacion_apa(String id){
        Producto p=new Producto();
        String sql="select * from inventario_hospitalizacion_apa where codigo_hospitalizacion=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    } public Producto listarID_rayosx(String id){
        Producto p=new Producto();
        String sql="select * from inventario_rayosx where codigo_rayosx=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }public Producto listarID_cirugia(String id){
        Producto p=new Producto();
        String sql="select * from inventario_cirugia where codigo_cirugia=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }public Producto listarID_ambulancia(String id){
        Producto p=new Producto();
        String sql="select * from inventario_ambulancia where codigo_ambulancia=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
    public Producto listarID_endoscopia(String id){
        Producto p=new Producto();
        String sql="select * from inventario_endoscopia where codigo_endoscopia=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
        public Producto listarID_ultrasonido(String id){
        Producto p=new Producto();
        String sql="select * from inventario_ultrasonido where codigo_ultrasonido=?";
        try {
            con=acceso.ConnectDB();
            ps=con.prepareStatement(sql);
            ps.setString(1, id);
            rs=ps.executeQuery();
            while (rs.next()) {
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setEstado(rs.getString(4));
                p.setStock(rs.getInt(5));
            }
        } catch (Exception e) {
        }
        return p;
    }
    //*************MANTENIMIENTO CRUD**************
    public List listarProducto() {
        String sql = "select * from inventario_laboratorio";
        List<Producto> listaprod = new ArrayList<>();
        try {
            con = acceso.ConnectDB();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setId(rs.getString(1));
                p.setNom(rs.getString(2));
                p.setPre(rs.getFloat(3));
                p.setStock(rs.getInt(4));
                p.setEstado(rs.getString(5));
                listaprod.add(p);
            }
        } catch (Exception e) {
        }
        return listaprod;
    }

    public int agregar(Producto p) {
        String sql = "insert into inventario_laboratorio(Nombres,Precio,cantidad,Estado)values(?,?,?,?)";
        try {
            con = acceso.ConnectDB();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNom());
            ps.setDouble(2, p.getPre());
            ps.setInt(3, p.getStock());
            ps.setString(4, p.getEstado());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

//    public int actualizarStock(int cant, int id) {
//        String sql = "update inventario_laboratorio set Stock=? where IdProducto=?";
//        try {
//            con = acceso.ConnectDB();
//            ps = con.prepareStatement(sql);          
//            ps.setInt(1, cant);           
//            ps.setInt(2, id);
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//        return r;
//    }
    public int actualizar(Producto p) {
        String sql = "update inventario_laboratorio set Nombres=?,Precio=?,cantidad=?,Estado=? where IdProducto=?";
        try {
            con = acceso.ConnectDB();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNom());
            ps.setDouble(2, p.getPre());
            ps.setInt(3, p.getStock());
            ps.setString(4, p.getEstado());
            ps.setString(5, p.getId());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    public int delete(int id) {
        String sql = "delete from inventario_laboratorio where IdProducto=?";
        try {
            con = acceso.ConnectDB();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
}
