/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

/**
 *
 * @author Rojeru San CL
 */
public class Sentencias {

    public static String LISTAR = "SELECT * FROM usuarios WHERE idusuario!=1 ORDER BY idusuario";

    public static String REGISTRAR = "INSERT INTO usuarios(usuario, password, tipousuario) "
            + "VALUES(?,?,?)";

    public static String ACTUALIZAR = "UPDATE usuarios SET "
            + "usuario=?, "
            + "password=?, "
            + "tipousuario=? "
            + "WHERE idusuario=?";

    public static String ELIMINAR = "DELETE FROM usuarios WHERE idusuario = ?";

    private int id;
    private String usuario;
    private String password;
    private String tipo;  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
