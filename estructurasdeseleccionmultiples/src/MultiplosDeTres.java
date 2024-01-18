/*
* Dado un número natural N, la computadora muestra los primeros N múltiplos
de 3 excepto aquellos que sean a la vez múltiplos de 5.
Ejemplo: Se ingresa 10, la computadora muestra 3 6 9 12 18 21 24 27 33 36.
*
* @Author RoxDev
*/

import java.util.Scanner;

public class MultiplosDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un número natural: ");
        N = sc.nextInt();
        while (N < 1) {
            System.out.print("El número ingresado no es válido. Ingrese un número natural mayor o igual a 1: ");
            N = sc.nextInt();
        }
        System.out.print("Los primeros " + N + " múltiplos de 3 excepto aquellos que sean a la vez múltiplos de 5 son: ");
        int contador = 0;
        for (int i = 1; contador < N; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
                contador++;
            }
        }
    }
}
