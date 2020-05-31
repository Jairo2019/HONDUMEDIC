/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HONDUMEDIC;

import java.awt.Color;

/**
 *
 * @author LoreM
 */
public class HONDUMEDIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login.Load sp= new login.Load();
        sp.setVisible(true);
        login.Login l=new login.Login();
         sp.pgbar.setForeground(new Color(0, 111, 177));
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                sp.pgnum.setText(Integer.toString(i)+"%");
                sp.pgbar.setValue(i);
                if(i==100){
                    sp.setVisible(false);
                    l.setVisible(true);
                }
        }
        }
        catch(Exception e){
            
        }
    }
    
}
