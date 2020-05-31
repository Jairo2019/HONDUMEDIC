<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Database" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login2</title>
    </head>
    <body>
        <h4>Formulario de Logueo</h4>
        <hr>
        <form action="#" method="POST">
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
        
        <%
            Database db = new Database();
            String nivel="";
            if(request.getParameter("btnLoguear")!=null){
                nivel=db.loguear(request.getParameter("txtUsuario"), request.getParameter("txtContra"));
                if(nivel!=""){
                    HttpSession sesion = request.getSession();
                    sesion.setAttribute("nivel", nivel);
                    sesion.setAttribute("usuario",request.getParameter("txtUsuario"));
                    response.sendRedirect("vistaPersona.jsp");
                    
                }
            }
            
            if(request.getParameter("cerrar")!=null){
             session.invalidate();
             
            }



            %>
        
        
        
        
        
    </body>
</html>
