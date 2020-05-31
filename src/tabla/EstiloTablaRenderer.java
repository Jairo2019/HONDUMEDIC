/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Rojeru San CL
 */
public class EstiloTablaRenderer extends DefaultTableCellRenderer {

    private Component componenete;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        componenete = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.       
        this.setHorizontalAlignment(0);
        this.setBorder(null);
        this.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(58, 159, 171)));
        
        if (row % 2 == 0) {
            componenete.setForeground(new Color(58, 159, 171));
            componenete.setBackground(new Color(255, 255, 255));
        } else {
            componenete.setForeground(new Color(58, 159, 171));
            componenete.setBackground(new Color(255, 255, 255));
        }
        if (isSelected) {
            componenete.setForeground(Color.white);
            componenete.setBackground(new Color(32, 178, 170));
            componenete.setFont(new Font("Tahoma", Font.BOLD, 14));
        }

        return componenete;

    }

}
