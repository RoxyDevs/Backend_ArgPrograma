/*Dado un número N, la PC muestra los primeros N términos de la sucesión de
Fibonacci.
Ejemplo: Se ingresa 10, la computadora muestra 0, 1, 1, 2, 3, 5, 8, 13, 21, 34.
*
@Author RoxDev
*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un número entero: ");
        N = sc.nextInt();
        while (N < 1) {
            System.out.print("El número ingresado no es válido. Ingrese un número entero mayor o igual a 1: ");
            N = sc.nextInt();
        }
        int a = 0, b = 1, c;
        System.out.print("Los primeros " + N + " términos de la sucesión de Fibonacci son: ");
        for (int i = 1; i <= N; i++) {
            System.out.print(a + ", ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
