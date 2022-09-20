package multi_de_5y5;

/**
 * @author Martínez De la Cruz Carlos
 */
import java.util.Scanner;

public class Multi_de_5y5 {
    //7) Realizar un programa que permita ingresar 10 números por teclado, el programa debe calcular la multiplicación entre la suma de los primeros 5 números y la suma de los 5 últimos números.
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int numero6;
        int numero7;
        int numero8;
        int numero9;
        int numero10;

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

        System.out.println("Ingresa el sexto número");
        Scanner num6 = new Scanner(System.in);
        numero6 = num6.nextInt();

        System.out.println("Ingresa el septimo número");
        Scanner num7 = new Scanner(System.in);
        numero7 = num7.nextInt();

        System.out.println("Ingresa el octavo número");
        Scanner num8 = new Scanner(System.in);
        numero8 = num8.nextInt();

        System.out.println("Ingresa el noveno número");
        Scanner num9 = new Scanner(System.in);
        numero9 = num9.nextInt();

        System.out.println("Ingresa el decimo número");
        Scanner num10 = new Scanner(System.in);
        numero10 = num10.nextInt();
int multi = (numero1 + numero2 + numero3 + numero4 + numero5) * (numero6 + numero7 + numero8 + numero9 + numero10);
        System.out.println("La suma y multiplicación de los diez números es: " + multi);

    }
}
