/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Reportes;

/**
 *
 * @author wow
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */




import java.awt.Container;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import ServiciosYConexion.Conexion;



public class ReportView extends JFrame
{
    public ReportView(String fileName)
    {
        this(fileName, null);
    }
    public ReportView(String fileName, HashMap para)
    {
        super("Sistema Hospital Infantil (Reportes)");
        setLocationRelativeTo(null);
        Conexion d = new Conexion();
        Connection con = d.ConnectDB();
                
                
//        
//        Dbcon dba;
//        dba = new Dbcon();
//        java.sql.Connection con;
//        con = Dbcon.mycon();
//       

        try
        {
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);            
        } 
        catch (JRException jRException)
        {
            System.out.println(jRException);
        }
        setBounds(2, 2, 900, 700);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
