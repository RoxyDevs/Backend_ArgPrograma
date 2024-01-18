/*
Escribir un programa que pida al usuario un número entre 1 y 12. La
computadora muestra por pantalla el mes al que pertenece tal número. Si se ingresa
un número fuera de rango, mostrar un error.
*
@Author RoxDev
 */
import java.util.Scanner;

public class NroMes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un número entre 1 y 12: ");
        num = input.nextInt();

        switch (num) {
            case 1:
                System.out.println("El número " + num + " corresponde al mes de \"Enero\".");
                break;
            case 2:
                System.out.println("El número " + num + " corresponde al mes de \"Febrero\".");
                break;
            case 3:
                System.out.println("El número " + num + " corresponde al mes de \"Marzo\".");
                break;
            case 4:
                System.out.println("El número " + num + " corresponde al mes de \"Abril\".");
                break;
            case 5:
                System.out.println("El número " + num + " corresponde al mes de \"Mayo\".");
                break;
            case 6:
                System.out.println("El número " + num + " corresponde al mes de \"Junio\".");
                break;
            case 7:
                System.out.println("El número " + num + " corresponde al mes de \"Julio\".");
                break;
            case 8:
                System.out.println("El número " + num + " corresponde al mes de \"Agosto\".");
                break;
            case 9:
                System.out.println("El número " + num + " corresponde al mes de \"Septiembre\".");
                break;
            case 10:
                System.out.println("El número " + num + " corresponde al mes de \"Octubre\".");
                break;
            case 11:
                System.out.println("El número " + num + " corresponde al mes de \"Noviembre\".");
                break;
            case 12:
                System.out.println("El número " + num + " corresponde al mes de \"Diciembre\".");
                break;
            default:
                System.out.println("Error: El número ingresado está fuera de rango.");
                break;
        }

        input.close();
    }
}

