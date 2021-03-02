/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JTextFieldPersonalizado;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 *
 * @author DELL-PC
 */
public class Deshacer extends AbstractAction{
    
     private UndoManager manager;
     
     public Deshacer(UndoManager manager){
        this.manager = manager;
     }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            manager.undo();
        }catch (CannotUndoException e){
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
}
