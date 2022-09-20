package suma.pkg5;
/**
 * @author Martínez De la Cruz Carlos
 */
import java.util.Scanner;
// 3) Realizar un programa que permita calcular la suma de 5 números
public class Suma5 {

    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;

        System.out.println("Ingresa el primero número");
        Scanner num1 = new Scanner(System.in);
        numero1 = num1.nextInt();

        System.out.println("Ingresa el segundo número");
        Scanner num2 = new Scanner(System.in);
        numero2 = num2.nextInt();

        System.out.println("Ingresa el tercer número");
        Scanner num3 = new Scanner(System.in);
        numero3 = num3.nextInt();

        System.out.println("Ingresa el cuarto número");
        Scanner num4 = new Scanner(System.in);
        numero4 = num4.nextInt();

        System.out.println("Ingresa el quinto número");
        Scanner num5 = new Scanner(System.in);
        numero5 = num5.nextInt();
        int suma = numero1 + numero2 + numero3 + numero4 + numero5;
        System.out.println("La suma de los cinco números es: " + suma);

    }

}
