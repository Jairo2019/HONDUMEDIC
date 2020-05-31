<%-- 
    Document   : login
    Created on : 04-oct-2016, 10:04:51
    Author     : edmundo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body>
        <form action="../servAcces" method="POST">
            <table>
                <tr>
                    <td>
                        Usuario:
                    </td>
                    <td>
                        <input type="text" name="txtUsuario">
                    </td>
                </tr>
                 <tr>
                    <td>
                        Cotraseña:
                    </td>
                    <td>
                        <input type="text" name="txtContra">
                    </td>
                </tr>
                 <tr>
                    <td colspan="2">
                        <input type="submit" name="btnLoguear" value="Ingresar">
                    </td>
                   
                </tr>
            </table>
         </form>
        
      
        
        
        
        
          </body>
</html>
