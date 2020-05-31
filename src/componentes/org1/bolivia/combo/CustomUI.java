package componentes.org1.bolivia.combo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class CustomUI extends BasicComboBoxUI{
    
    private ImageIcon espacio =  new ImageIcon(getClass().getResource("/componentes/org1/bolivia/res/espacio.png"));
    private Color red = new Color(58, 159, 171);
    
    public static ComboBoxUI createUI(JComponent c) {
        return new CustomUI();
    }
    
    @Override 
    protected JButton createArrowButton() {        
        BasicArrowButton basicArrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, //Direccion de la flecha
                Color.WHITE, //Color de fondo
                new Color(130,7,7),//sombra
                new Color(130,7,7),//darkShadow
                Color.WHITE //highlight
                );         
        //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
        basicArrowButton.setBorder(BorderFactory.createLineBorder(red,2));
        basicArrowButton.setContentAreaFilled(false);        
        return basicArrowButton;
    }        

    //Se puede usar un JButton para usar un icono personalizado en lugar del arrow
    /*     
    @Override 
    protected JButton createArrowButton() {                 
        JButton button = new JButton();        
        //se quita el efecto 3d del boton, sombra y darkShadow no se aplican 
        button.setText("");
        button.setBorder(BorderFactory.createLineBorder(red,2));
        button.setContentAreaFilled(false);
        button.setIcon( new ImageIcon(getClass().getResource("/org/bolivia/res/estrella.png")) );
        return button;
    }      
    */
    
    @Override
    public void paintCurrentValueBackground(Graphics g,
                               Rectangle bounds,
                               boolean hasFocus)
    {
        g.setColor( red );            
        g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
    }
      
    //Pinta los items
    @Override
    protected ListCellRenderer createRenderer()
    {
        return new DefaultListCellRenderer() {      
            
        @Override
        public Component getListCellRendererComponent(JList list,Object value,int index,
          boolean isSelected,boolean cellHasFocus) {
      
        super.getListCellRendererComponent(list,value,index,isSelected,cellHasFocus);
        list.setSelectionBackground(red);
        if (isSelected)
        {
            setBackground( red );
            setForeground(Color.WHITE);
        }
        else
        {
            setBackground( Color.WHITE );            
            setForeground( new Color(70,70,70));
        }
        if (index!=-1) {          
          setIcon( espacio );          
        }
        return this;
      }
    };
    }
}
