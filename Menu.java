
/**
 * Programa que permite ahorrar dinero
 * 
 * Nota:Disculpe porfe la verdad tube problemas con mi computadora
 * y algunas cosas no logre resolver como hacerlas. Al mismo tiempo
 * tueve algunos problemas personasles, una disculpa.
 * 
 * @author (Jose Alfredo) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Menu{
    
    /**
     * =====
     * Menu
     * =====
     * 1-Depositar Dinero
     * 2-Consultar Dinero
     * 3-Saldo Actual
     * 4-Retirar Dinero
     */
    public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        Cajero cajero = new Cajero();
        Dinero dinero = new Dinero();
        ArrayList ahorro = new ArrayList();
        int opcion=0;
        // initialise instance variables
        
        
        do{
            System.out.println("===================================");
            System.out.println("( 1 ) Depositar Dinero");
            System.out.println("( 2 ) Consultar Dinero");
            System.out.println("( 3 ) Saldo Actual");
            System.out.println("( 4 ) Retirar Dinero");
            System.out.println("( 5 ) Salir");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: {
                            System.out.println("( 1 ) Monedas /n ( 2 ) Billete");
                            opcion = leer.nextInt();
                            
                            depositar(opcion, dinero, ahorro);
                        }
                        break;
                case 2: consulta(cajero);
                        break;
                case 3: saldoActual(ahorro);
                        break;
                case 4:break;
                case 5:break;
            }
            
        }while(opcion!=5);
        
    }

    /**
     * An example of a method - replace this comment with your own
     */
    public static void depositar(int opcion, Dinero dinero, ArrayList ahorro){
        //Declarar variables
        Scanner leer = new Scanner(System.in);
        
        if(opcion==1){
            int monedas[] = {1,2,5,10};
            
            System.out.println("Que moneda desea agregar?");
            System.out.println("Solo se aceptan monedas de $1, $2, $5, $10");
            int moneda = leer.nextInt();
            for(int i=0;i<monedas.length;i++){
                if(moneda == monedas[i]){
                    dinero.setMoneda(moneda);
                    ahorro.add(dinero.getMoneda());
                    //cajero.setCajero(moneda);
                }
            }
            
        }
        
        if(opcion==2){
            int billetes[] = {20,50,100,200,500,1000};
            
            System.out.println("Que billete desea agregar?");
            System.out.println("Solo se aceptan billetes de $20, $50, $100, $200, $500, $1,000");
            int billete = leer.nextInt();
            for(int i=0;i<billetes.length;i++){
                if(billete == billetes[i]){
                    dinero.setBillete(billete);
                    ahorro.add(dinero.getBillete());
                    //cajero.setCajero(billete);
                }
            }
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public static void consulta(Cajero cajero){
        ArrayList consulta = new ArrayList();
        
        //consulta.add(cajero.getCajero());
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     */
    public static void saldoActual(ArrayList ahorro){
        int size = cajero.getCajero().size();
        for(int i=0; i<size;i++){
            
            
            
            System.out.println();
        }
    }
}
