package Inventarios;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Colorear_CantMinima_Almacen extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

        
        int cant_minima =  Integer.parseInt(table.getValueAt(row, 7).toString());
        int cantidad =  Integer.parseInt(table.getValueAt(row, 5).toString());
        
        if (cantidad<=cant_minima) {
            this.setBackground(Color.RED);
        } else {
            this.setBackground(Color.white);
        }

        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

}
