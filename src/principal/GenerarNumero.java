
package principal;


public class GenerarNumero {
    
    private int dato;
    private int cont=1;
    private String num="";

    public void generar(int dato) {
        this.dato = dato;

               int can=cont+this.dato;
               num = "000" + can; 
          
    }

    public String serie()
    {
        return this.num;
    }
    
    
    
    
}
