/*
* Se ingresa un número natural. La computadora muestra el factorial del número.
* Ejemplo: Se ingresa 5, la computadora muestra 120.
*
* @Author RoxDev
*/
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número natural: ");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.print("El número ingresado no es válido. Ingrese un número natural: ");
            n = sc.nextInt();
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + n + " es " + factorial);
    }
}

