
package area.circulo;

import java.util.Scanner;

/**
 * @author Martínez De la Cruz Carlos
 */
public class AreaCirculo {

 // 8) Calcular el área de un circulo sabiendo que pi = 3,14159265 A= pi x r2, sabiendo que r=5. 
    public static void main(String[] args) {
      Scanner entrada= new Scanner (System.in);
                
        System.out.println("PROGRAMA QUE TE DA EL AREA DE UN CIRCULO");
        
        double r, A;
        System.out.println("Ingrese el radio");
       Scanner num = new Scanner(System.in);
        r = num.nextDouble();
          A=Math.PI*Math.pow(r,2);
        
        System.out.println("El area del circulo es: "+ A);                                                                                       
        
      
        
    }
    
}
