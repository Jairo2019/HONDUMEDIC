/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_productos_servicios;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author JOAHAN-PC
 */
public class ColorearFilas extends DefaultTableCellRenderer{
    private int columna_patron ;
    public ColorearFilas(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
    @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);//color de fondo
        table.setForeground(Color.black);//color de texto
        //Si la celda corresponde a una fila con estado FALSE, se cambia el color de fondo a rojo
        if( table.getValueAt(row,columna_patron).equals(0) )
        {
            setBackground(Color.decode("#CC0000"));
            table.setForeground(Color.white);
        }else{
            if ( table.getValueAt(row,columna_patron).equals(5)
                    || table.getValueAt(row,columna_patron).equals(4)
                    || table.getValueAt(row,columna_patron).equals(3)
                    || table.getValueAt(row,columna_patron).equals(2)||
                    table.getValueAt(row,columna_patron).equals(1)) {
                setBackground(Color.decode("#0C8C8F"));
                table.setForeground(Color.white);
            }
        }       
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
 }
}
