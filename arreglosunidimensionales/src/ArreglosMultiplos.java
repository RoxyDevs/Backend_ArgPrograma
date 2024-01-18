/*
Se pide por teclado un número T y otro M. Se debe crear un arreglo de T
posiciones cargado con los múltiplos de M

@Author RoxDev
*/
import java.util.Scanner;

public class ArregloMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número T: ");
        int T = sc.nextInt();
        System.out.print("Ingrese el número M: ");
        int M = sc.nextInt();
        int[] arreglo = new int[T];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (i + 1) * M;
        }
        System.out.println("Arreglo de múltiplos de " + M + ":");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
