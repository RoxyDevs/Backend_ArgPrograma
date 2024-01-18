/*
El usuario ingresa un número entero mayor que 1. Si el número ingresado es
incorrecto, volver a pedírselo. La computadora indica si el número ingresado es primo
o no.

@Author RoxDev
*/
import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean esPrimo = true;
        do {
            System.out.print("Ingrese un número entero mayor que 1: ");
            numero = sc.nextInt();
        } while (numero <= 1);
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }
    }
}