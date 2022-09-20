package promedio_de_5;
/**
 * @author Martínez De la Cruz Carlos
 */
import java.util.Scanner;
public class Promedio_de_5 {
//5) Realizar un programa que calcule el promedio de 5 notas ingresadas por teclado.
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        System.out.println("PROGRAMA QUE TE DA EL PROMEDIO DE 5 NUMEROS");

        System.out.println("Ingresa el promedio número 1");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();

        System.out.println("Ingresa el promedio número 2");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();

        System.out.println("Ingresa el promedio número 3");
        Scanner num3 = new Scanner(System.in);
        numero3 = num3.nextInt();

        System.out.println("Ingresa el promedio número 4");
        Scanner num4 = new Scanner(System.in);
        numero4 = num4.nextInt();

        System.out.println("Ingresa el promedio número 5");
        Scanner num5 = new Scanner(System.in);
        numero5 = num5.nextInt();
        int suma = (numero1 + numero2 + numero3 + numero4 + numero5)/5;
        System.out.println("El promedio de los cinco estudiantes es: " + suma);
    }
}
