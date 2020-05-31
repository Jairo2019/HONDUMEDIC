
package modelo;
import java.sql.*;
public class Database {
    private String uss;
    private String pass;
    private String driver;
    private String url;
    public Database() {
        this.uss = "root";
        this.pass = "";
        this.driver = "com.mysql.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/mibase";
    }
    public String getUss() { return uss;  }
    public String getPass() {  return pass; }
    public String getDriver() { return driver; }
    public String getUrl() { return url; }
    public String loguear(String uss, String pass){
       Connection con;
       PreparedStatement pst;
       ResultSet rs;
       String nivel ="";
       String sql ="select nivel from usuarios where usuario='"+
               uss+"' and contra='"+pass+"'";
        try {
            Class.forName(this.getDriver());
            con=DriverManager.getConnection(this.getUrl(), 
                    this.getUss(),this.getPass());
            pst= con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
               // nivel = rs.getInt("id"); 
                nivel = rs.getString(1);
            }
            con.close();
                 
        } catch (Exception e) {
            e.printStackTrace();            
        }
        return nivel; 
    } 
}
