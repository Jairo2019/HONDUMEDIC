package componentes.org1.bolivia.combo;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
/**
 * @web http://www.jc-mouse.net/
 * @author Mouse
 */
public class SComboBox extends JComboBox{
 
    /** Constructor */
    public SComboBox()
    {
        Dimension dimension = new Dimension(200,32);
        setPreferredSize(dimension);
        setSize(dimension);      
        setForeground(Color.WHITE);        
        setBorder(BorderFactory.createLineBorder(new Color(71, 71, 71), 2));
        setUI(CustomUI.createUI(this));                
        setVisible(true);
    }

}