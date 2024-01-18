/*
Se ingresan 5 números pertenecientes al arreglo A y otros 5 números
pertenecientes al arreglo B. La computadora muestra la unión de A y B.
Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra 1 2 3 4 5 4 7 1 3 6.

@Author RoxDev
*/
import java.util.Scanner;

public class UnionArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5]; // Declarar e inicializar el arreglo A de 5 enteros
        int[] B = new int[5]; // Declarar e inicializar el arreglo B de 5 enteros
        int[] C = new int[A.length + B.length]; // Declarar e inicializar el arreglo C de 10 enteros

        // Pedir al usuario que ingrese los números del arreglo A
        System.out.println("Ingrese los números del arreglo A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }

        // Pedir al usuario que ingrese los números del arreglo B
        System.out.println("Ingrese los números del arreglo B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("B[" + i + "] = ");
            B[i] = sc.nextInt();
        }

        // Copiar los elementos del arreglo A al arreglo C
        System.arraycopy(A, 0, C, 0, A.length);
        // Copiar los elementos del arreglo B al arreglo C
        System.arraycopy(B, 0, C, A.length, B.length);

        // Mostrar el arreglo C
        System.out.println("La unión de A y B es:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
