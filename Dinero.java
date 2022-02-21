/**
 * Write a description of class Cajero here.
 * 
 * @author (Jose Alfredo) 
 * @version (1.0)
 */
import java.util.*;
public class Cajero{
    // Agregar variables
    ArrayList cajero = new ArrayList();

    /**
     * Constructor for objects of class Cajero
     */
    public void setCajero(int ingreso){
        //Agregar dinero al cajero
        Dinero dinero = new Dinero();
        if(ingreso<10){
            dinero.setMoneda(ingreso);
            this.cajero.add(dinero); 
        }else if(ingreso>10){
                dinero.setBillete(ingreso);
                this.cajero.add(dinero);
        }
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public ArrayList getCajero(){
        // put your code here
        return this.cajero;        
    }
}
