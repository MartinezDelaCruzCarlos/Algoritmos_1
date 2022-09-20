package trapecio_6;

import java.util.Scanner;

/**
 *
 * @author USER Martinez De la Cruz CArlos
 */
public class Trapecio_6 {
// 4) Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas:
    public static void main(String[] args) {
        System.out.println("Programa que calcula el perimetro y area del trapecio");
//AREA
        System.out.println("AREA");
//VARIABLES
        float l, m, n, o, b, B, h, ATR, PTR;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la base menor: ");
        b = teclado.nextFloat();
        System.out.print("ingrese la base mayor: ");
        B = teclado.nextFloat();
        System.out.print("ingrese la altura: ");
        h = teclado.nextFloat();
//PROCESO
        ATR = (h * (B + b)) / 2;
        System.out.println("EL AREA DEL TRAPECIO ES:" + ATR);
//PERIMETRO
        System.out.println("PERIMETRO");
        System.out.print("ingrese el lado1: ");
        l = teclado.nextFloat();
        System.out.print("ingrese el lado2: ");
        m = teclado.nextFloat();
        System.out.print("ingrese el lado3: ");
        n = teclado.nextFloat();
        System.out.print("ingrese el lado4: ");
        o = teclado.nextFloat();
//PROCESO
        PTR = l + m + n + o;
        System.out.println("EL PERIMETRO DEL TRAPECIO ES:" + PTR);
    }

}
