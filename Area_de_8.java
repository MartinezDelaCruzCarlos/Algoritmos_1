package area_de_8;

import java.util.Scanner;
/**
 *
 * @author Martínez De la Cruz Carlos Fernado
 */
public class Area_de_8 {
    //9) Calcular la suma de las áreas de 8 círculos cuyos radios son 18.9, 16.7, 71.9, 4.6, 6.7, 5.6. 4.7y 10.
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
                
        System.out.println("PROGRAMA QUE TE DA EL AREA DE 8 CIRCULOS Y LUEGO LOS SUMA");
        System.out.println("Area 1");
        double r, A;
        System.out.println("Ingrese el radio");
       Scanner num0 = new Scanner(System.in);
        r = num0.nextDouble();
          A=Math.PI*Math.pow(r,2);
        
        System.out.println("Area 2");
        double r1, A1;
        System.out.println("Ingrese el radio");
       Scanner num1 = new Scanner(System.in);
        r1 = num1.nextDouble();
          A1=Math.PI*Math.pow(r1,2);
          
        System.out.println("Area 3");
        double r2, A2;
        System.out.println("Ingrese el radio");
       Scanner num2 = new Scanner(System.in);
        r2 = num2.nextDouble();
          A2=Math.PI*Math.pow(r2,2);
          
          System.out.println("Area 4");
        double r3, A3;
        System.out.println("Ingrese el radio");
       Scanner num3 = new Scanner(System.in);
        r3 = num3.nextDouble();
          A3=Math.PI*Math.pow(r3,2);
        
        System.out.println("Area 5");
        double r4, A4;
        System.out.println("Ingrese el radio");
       Scanner num4 = new Scanner(System.in);
        r4 = num4.nextDouble();
          A4=Math.PI*Math.pow(r4,2);              
        
        System.out.println("Area 6");
        double r5, A5;
        System.out.println("Ingrese el radio");
       Scanner num5 = new Scanner(System.in);
        r5 = num5.nextDouble();
          A5=Math.PI*Math.pow(r5,2);
          
          System.out.println("Area 7");
        double r6, A6;
        System.out.println("Ingrese el radio");
       Scanner num6 = new Scanner(System.in);
        r6 = num6.nextDouble();
          A6=Math.PI*Math.pow(r6,2);          
        
        System.out.println("Area 8");
        double r7, A7;
        System.out.println("Ingrese el radio");
       Scanner num7 = new Scanner(System.in);
        r7 = num7.nextDouble();
          A7=Math.PI*Math.pow(r7,2);
          
        double Suma;
        Suma=A+A1+A2+A3+A4+A5+A6+A7;      
        System.out.println("El area y suma de los 8 circulo es: "+ Suma);
    }
    
}
