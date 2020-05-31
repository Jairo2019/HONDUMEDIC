<%@page import="modelo.Persona"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Operaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VistaPersona</title>
        <!-- Este script es el encargado de pasar de la tabla los datos al formulario-->
        <script type="text/javascript">
            function cargar(id,nombres,apellidos,edad,direccion){
                document.frmPersona.txtId.value=id;
                document.frmPersona.txtNombres.value=nombres;
                document.frmPersona.txtApellidos.value=apellidos;
                document.frmPersona.txtEdad.value=edad;
                document.frmPersona.txtDireccion.value=direccion;
            }
        </script>
    </head>
    <body>
        <%
        //validando que haya sesion activa sino ule
        HttpSession sesion = request.getSession();
        String us="";
        String nivel="";
        //aqui podemos validar el menu, otras opciones en base al nivel del usuario
        //en este ejemplo yo valido que sea un usuario valido
        //si tiene un nivel es porque viene de la bd
        if(sesion.getAttribute("nivel")!=null){
            us=sesion.getAttribute("usuario").toString();
            nivel=sesion.getAttribute("nivel").toString();
            //la bienvenida y el enlace para cerrar sesion
            out.print("<p align='right'>Bienvenido " + us + "("+nivel+")");
            out.print("<a href='login2.jsp?cerrar=true'>Cerrar Sesion</a></p><hr>");
        }else{
            //si no hay nivel, de regre al login
            out.print("<script>location.replace('login2.jsp');</script>");
        }       
        %>
        <h1>Vista Persona</h1>
        <hr>
         <center> 
        <h5>Formulario para CRUD</h5>
          <form action="../servAcces" method="POST" name="frmPersona">
            <table>
                <tr>
                    <td>id</td><td><input type="text" name="txtId" required></td>                        
                </tr>
                <tr>
                    <td>nombres</td><td><input type="text" name="txtNombres" required></td>                        
                </tr>
                 <tr>
                    <td>apellidos</td><td><input type="text" name="txtApellidos" required></td>                        
                </tr>
                 <tr>
                    <td>edad</td><td><input type="text" name="txtEdad" required></td>                        
                </tr>
                 <tr>
                    <td>direccion</td><td><input type="text" name="txtDireccion" required></td>                        
                </tr>
                </table> 
            <hr size="2px" width="400px">
                <input type="submit" name="btnInsertar" value="Insertar">
                <input type="submit" name="btnModificar" value="Modificar">
                <input type="submit" name="btnEliminar" value="Eliminar">
                 <input type="submit" name="btnReporte" value="Ver Reporte">
                
            <hr size="2px" width="400px">        
        </form>
        <!--aqui ubicamos el contenido de la tabla -->
        <% 
        //para ver los datos lo hacemos de forma directa y no usamos el servlet
        //primero el objeto Operaciones para llamar al metodo consultar
        Operaciones op = new Operaciones();  //debe haber un import del paquete modelo
        List<Persona> datos = new ArrayList(); //importar paquete modelo y la clase persona y java.util.*
        datos = op.consultar("persona");
                
        //ahora vamos a embeber codigo html y jsp
        %>
        <table>
            <tr>
                <th>ID</th><th>NOMBRES</th><th>APELLIDOS</th><th>EDAD</th><th>DIRECCION</th>
            </tr>
        <%
        for(Persona p: datos){
            //dentro de este bucle imprimimos una fila y por cada fila (tr) 
            //creamos el dato dentro de cada celda (td)
            %>
            <tr>
                <td><%= p.getId() %></td> 
                <td><%= p.getNombres() %></td>
                <td><%= p.getApellidos()%></td>
                <td><%= p.getEdad() %></td>
                <td><%= p.getDireccion() %></td>
                
                <td><a href="javascript:cargar('<%=p.getId()%>',
                       '<%=p.getNombres()%>','<%=p.getApellidos()%>',
                       '<%=p.getEdad()%>','<%=p.getDireccion()%>')">
                        Cargar </a><% %></td>
                        <!--esta fila es para llamar al javascript que carga al form -->
            </tr>
        <%
        }   //esta llave es la del for
        %>

        </table>
       </center>

    </body>
</html>
