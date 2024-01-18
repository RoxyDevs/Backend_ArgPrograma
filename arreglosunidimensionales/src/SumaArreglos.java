/*
*Se ingresan 5 números pertenecientes al arreglo A y otros 5 números
pertenecientes al arreglo B. La computadora muestra un arreglo C, donde cada
posición es el resultado de la suma del número en la misma posición en el arreglo A
con el número en la misma posición en el arreglo B.
Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra 5 9 4 7 11.

@Author RoxDev
*/

import java.util.Scanner;

public class SumaArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5]; // Declarar e inicializar el arreglo A de 5 enteros
        int[] B = new int[5]; // Declarar e inicializar el arreglo B de 5 enteros
        int[] C = new int[5]; // Declarar e inicializar el arreglo C de 5 enteros

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

        // Calcular la suma de los números en las mismas posiciones de los arreglos A y B y guardarla en el arreglo C
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] + B[i];
        }

        // Mostrar el arreglo C
        System.out.println("El arreglo C es:");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }
    }
}
