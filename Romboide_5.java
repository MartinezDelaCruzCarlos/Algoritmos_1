package romboide_5;

import java.util.Scanner;

/**
 *
 * @author USER Martinez De la Cruz Carlos
 */
public class Romboide_5 {
    // 4) Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas:
    public static void main(String[] args) {
        System.out.println("Programa que calcula el perimetro y area del romboide");
//AREA
        System.out.println("AREA");
//VARIABLES
        float b, h, ABO, PBO;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la base: ");
        b = teclado.nextFloat();
        System.out.print("ingrese la altura: ");
        h = teclado.nextFloat();
//PROCESO
        ABO = b * h;
        System.out.println("EL AREA DEL ROMBOIDE ES:" + ABO);
//PERIMETRO
        System.out.println("PERIMETRO");
        System.out.print("ingrese la base: ");
        b = teclado.nextFloat();
        System.out.print("ingrese la altura: ");
        h = teclado.nextFloat();
//PROCESO
        PBO = (2 * b) + (2 * h);
        System.out.println("EL PERIMETRO DEL ROMBOIDE ES:" + PBO);
    }

}
