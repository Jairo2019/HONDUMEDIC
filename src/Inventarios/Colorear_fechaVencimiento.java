package Inventarios;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import login.Login;
import org.jdesktop.swingx.calendar.DaySelectionModel;
import paneles.Conexion;

public class Colorear_fechaVencimiento extends DefaultTableCellRenderer {
    static Conexion cc = new Conexion();
    static Connection cn = cc.ConnectDB();
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy, MM, dd");
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Date sistemaFech = new Date();
        Date dato = null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy, MM, dd");
        String fecha=(formato.format(sistemaFech));
        String fecha2 =  table.getValueAt(row, 6).toString();
        try {

                dato = formatofecha.parse(fecha2);

            } catch (ParseException ex) {
                ex.printStackTrace();
            }
    
            LocalDate inicio = LocalDate.parse(fecha); // 
            LocalDate fin = LocalDate.parse(dato.toString());
            long diffTime = DAYS.between(inicio, fin);
            if (diffTime<=365 && diffTime>180 ) {
                this.setBackground(Color.GREEN);
            }else if (diffTime<=180 && diffTime>90 ) {
                this.setBackground(Color.YELLOW);
            }else if (diffTime<=90 && diffTime>=0 ) {
                this.setBackground(Color.RED);
            }else {
                this.setBackground(Color.white);
            }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

}
