package cuadrado_2;

import java.util.Scanner;

/**
 *
 * @author USER Martinez De la Cruz Carlos
 */
public class Cuadrado_2 {
// 4) Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas:
    public static void main(String[] args) {
        System.out.println("Programa que calcula el perimetro y area del cuadrado");
//AREA
        System.out.println("AREA");

        float a, AC, PC;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese el lado: ");
        a = teclado.nextFloat();
//PROCESO, es el lado al cuadrado
        AC = (float) Math.pow(a,2);
        System.out.println("EL AREA DEL CUADRADO ES:" + AC);
//PERIMETRO
        System.out.println("PERIMETRO");
        System.out.print("ingrese el Lado: ");
        a = teclado.nextFloat();
//PROCESO, es la suma de todos los lados o solo la multiplicación
        PC = 4 * a;
        System.out.println("EL PERIMETRO DEL CUADRADO ES:" + PC);
    }
}
