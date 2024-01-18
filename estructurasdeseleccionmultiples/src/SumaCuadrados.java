/*
El usuario ingresa un valor N. Escriba un programa que calcule la suma de los
cuadrados de los N primeros números naturales.
Ejemplo: Se ingresa 6, la computadora muestra 91.

@Author RoxDev
*/
import java.util.Scanner;

public class SumaCuadrados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese un número entero: ");
        N = sc.nextInt();
        while (N < 1) {
            System.out.print("El número ingresado no es válido. Ingrese un número entero mayor o igual a 1: ");
            N = sc.nextInt();
        }
        int suma = 0;
        for (int i = 1; i <= N; i++) {
            suma += i * i;
        }
        System.out.println("La suma de los cuadrados de los primeros " + N + " números naturales es " + suma);
    }
}
