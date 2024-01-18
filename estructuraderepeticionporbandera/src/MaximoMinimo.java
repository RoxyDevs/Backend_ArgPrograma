/*
Estructura de repetición controlada por bandera

Se ingresan números hasta que se introduce un cero. La computadora muestra
el máximo y el mínimo.

@Author RoxDev
*/
import java.util.Scanner;

public class MaximoMinimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maximo = Integer.MIN_VALUE, minimo = Integer.MAX_VALUE;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
            if (numero != 0) {
                if (numero > maximo) {
                    maximo = numero;
                }
                if (numero < minimo) {
                    minimo = numero;
                }
            }
        } while (numero != 0);
        System.out.println("El máximo es " + maximo + " y el mínimo es " + minimo);
    }
}

