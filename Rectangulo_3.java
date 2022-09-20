package rectangulo_3;

import java.util.Scanner;

/**
 *
 * @author Martinez De la Cruz Carlos
 */
public class Rectangulo_3 {
// 4) Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas:
    public static void main(String[] args) {
        System.out.println("Programa que calcula el perimetro y area del rectangulo");
//AREA
        System.out.println("AREA");
//VARIABLES
        float b, h, AREC, PREC;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la base: ");
        b = teclado.nextFloat();
        System.out.print("ingrese la altura: ");
        h = teclado.nextFloat();
//PROCESO
        AREC = b * h;
        System.out.println("EL AREA DEL RECTANGULO ES:" + AREC);
//PERIMETRO
        System.out.println("PERIMETRO");
        System.out.print("ingrese la base: ");
        b = teclado.nextFloat();
        System.out.print("ingrese la altura: ");
        h = teclado.nextFloat();
//PROCESO
        PREC = (2 * b) + (2 * h);
        System.out.println("EL PERIMETRO DEL RECTANGULO ES:" + PREC);
    }

}
