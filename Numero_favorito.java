
package numero_favorito;

import java.util.Scanner;

/**
 *
 * @author Martínes De la Cruz Carlos
 */
public class Numero_favorito {

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
       System.out.println("INGRESA TU NUMERO FAVORITO");
       
       String numero=sc.nextLine();
       
       System.out.println("Tu numero favorito es: "+ numero);
       
    }
    
}
