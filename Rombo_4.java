package rombo_4;

import java.util.Scanner;

/**
 *
 * @author Marinez De la Cruz Carlos
 */
public class Rombo_4 {
// 4) Realizar un programa que calcule el perímetro y area de las siguientes figuras geométricas:
    public static void main(String[] args) {
        System.out.println("Programa que calcula el perimetro y area del rombo");
//AREA
        System.out.println("AREA");
//VARIABLES
        float a, d, D, ARO, PRO;
        Scanner teclado = new Scanner(System.in);
        System.out.print("ingrese la diagonal menor: ");
        d = teclado.nextFloat();
        System.out.print("ingrese la diagonal mayor: ");
        D = teclado.nextFloat();
//PROCESO
        ARO = (D * d) / 2;

        System.out.println("EL AREA DEL ROMBO ES:" + ARO);
//PERIMETRO se suma o se multiplican los lados
        System.out.println("PERIMETRO");
        System.out.print("ingrese el lado: ");
        a = teclado.nextFloat();

        PRO = 4 * a;
        System.out.println("EL PERIMETRO DEL ROMBO ES:" + PRO);
    }

}
