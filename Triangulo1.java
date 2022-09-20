package triangulo.pkg1;

import java.util.Scanner;

/**
 *
 * @author Martinez de la Cruz Carlos
 */
public class Triangulo1 {
// 4) Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas:
    public static void main(String[] args) {

        System.out.println("Programa que calcula el perimetro y area del triangulo");
        Scanner objeto = new Scanner(System.in);
//AREA
        System.out.println("AREA");
//VARIABLES
        Double b, h, l, m, n, A, P;
        System.out.print("ingrese la Base: ");
        b = objeto.nextDouble();
        System.out.print("ingrese la Altura: ");
        h = objeto.nextDouble();
//PROCESO
        A = (b * h) / 2;

        System.out.println("EL AREA DEL TRIANGULO ES:" + A);
//PERIMETRO
        System.out.println("PERIMETRO");
        System.out.print("ingrese el Lado1: ");
        l = objeto.nextDouble();
        System.out.print("ingrese el Lado2: ");
        m = objeto.nextDouble();
        System.out.print("ingrese el Lado3: ");
        n = objeto.nextDouble();
//PROCESO
        P = l + m + n;
        System.out.println("EL PERIMETRO DEL TRIANGULO ES:" + P);
    }

}
