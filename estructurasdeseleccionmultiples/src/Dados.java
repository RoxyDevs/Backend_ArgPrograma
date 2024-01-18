/*
*Escribir un programa que pida por teclado el resultado (dato entero) obtenido al
*lanzar un dado de seis caras. Mostrar por pantalla el número en letras de la cara
*opuesta al resultado obtenido. Disposición de las caras: 1-6 ; 2-5 ; 3-4.
*
* @Author RoxDev
*  */

import java.util.Scanner;

public class Dados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result;

        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
        result = input.nextInt();

        switch (result) {
            case 1:
                System.out.println("La cara opuesta es el \"seis\".");
                break;
            case 2:
                System.out.println("La cara opuesta es el \"cinco\".");
                break;
            case 3:
                System.out.println("La cara opuesta es el \"cuatro\".");
                break;
            case 4:
                System.out.println("La cara opuesta es el \"tres\".");
                break;
            case 5:
                System.out.println("La cara opuesta es el \"dos\".");
                break;
            case 6:
                System.out.println("La cara opuesta es el \"uno\".");
                break;
            default:
                System.out.println("Número incorrecto.");
                break;
        }

        input.close();
    }
}
