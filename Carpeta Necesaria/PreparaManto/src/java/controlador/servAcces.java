package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Database;
import modelo.Operaciones;
import modelo.Persona;

/**
 *
 * @author edmundo
 */
public class servAcces extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
 
            Operaciones op = new Operaciones();
            String respuesta="";
            RequestDispatcher rd=null;
            Persona p = new Persona();
         
            if(request.getParameter("btnInsertar")!=null){
                p.setId(Integer.parseInt(request.getParameter("txtId")));
                p.setNombres(request.getParameter("txtNombres"));
                p.setApellidos(request.getParameter("txtApellidos"));
                p.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
                p.setDireccion(request.getParameter("txtDireccion"));
                respuesta=op.Agregar(p,"persona");
               // request.setAttribute("respuesta", respuesta);
                 //IMPORTANTE, LUEGO DE PROCESAR LAS POSIBLES SOLICITUDES
                //NO OLVIDAR ESTO
               // rd=request.getRequestDispatcher("vistas/vistaPersona.jsp");
               // rd.forward(request, response);
                response.sendRedirect("vistas/vistaPersona.jsp");
            }else if(request.getParameter("btnEliminar")!=null){
                op.Eliminar(request.getParameter("txtId"), "persona");
                //request.setAttribute("respuesta", respuesta);
                 response.sendRedirect("vistas/vistaPersona.jsp");
            }else if(request.getParameter("btnModificar")!=null){
                 p.setId(Integer.parseInt(request.getParameter("txtId")));
                p.setNombres(request.getParameter("txtNombres"));
                p.setApellidos(request.getParameter("txtApellidos"));
                p.setEdad(Integer.parseInt(request.getParameter("txtEdad")));
                p.setDireccion(request.getParameter("txtDireccion"));
                op.Modificar(p, "persona");
               // request.setAttribute("respuesta", respuesta);
                 response.sendRedirect("vistas/vistaPersona.jsp");
            }else if(request.getParameter("btnReporte")!=null){
                response.sendRedirect("vistas/reportePersona.jsp");
            }
            
     
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
