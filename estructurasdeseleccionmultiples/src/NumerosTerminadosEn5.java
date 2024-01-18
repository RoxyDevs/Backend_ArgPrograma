/*
* Para imprimir los primeros N números terminados en 5, podemos utilizar un bucle for para generar
* los números y una estructura condicional if para verificar si cada número termina en 5.
* Si es así, se muestra el número.
*
* @Author RoxDev
 */
import java.util.Scanner;

public class NumerosTerminadosEn5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un número entero: ");
        N = sc.nextInt();
        while (N < 1) {
            System.out.print("El número ingresado no es válido. Ingrese un número entero mayor o igual a 1: ");
            N = sc.nextInt();
        }
        System.out.print("Los primeros " + N + " números terminados en 5 son: ");
        int contador = 0;
        for (int i = 5; contador < N; i += 10) {
            System.out.print(i + " ");
            contador++;
        }
    }
}
