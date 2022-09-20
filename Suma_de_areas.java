package suma_de_areas;

import java.util.Scanner;
/**
 *
 * @author Martínez De la Cruz Carlos
 */
public class Suma_de_areas {
    // 9) Calcular la suma de las áreas de 3 círculos cuyos radios son 8.9, 6.7 y 7.9
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);              
        System.out.println("PROGRAMA QUE TE DA EL AREA DE 3 CIRCULOS Y LUEGO LOS SUMA");
        System.out.println("Area 1");
        double r, A;
        System.out.println("Ingrese el radio");
       Scanner num = new Scanner(System.in);
        r = num.nextDouble();
          A=Math.PI*Math.pow(r,2);
                
        System.out.println("Area 2");
        double r1, A1;
        System.out.println("Ingrese el radio");
       Scanner lol = new Scanner(System.in);
        r1 = lol.nextDouble();
          A1=Math.PI*Math.pow(r1,2);
               
        System.out.println("Area 3");
        double r2, A2;
        System.out.println("Ingrese el radio");
       Scanner lal = new Scanner(System.in);
        r2 = lal.nextDouble();
          A2=Math.PI*Math.pow(r2,2);
        double Suma;
        Suma=A+A1+A2;      
        System.out.println("El area y suma de los 3 circulo es: "+ Suma);
    }
}
