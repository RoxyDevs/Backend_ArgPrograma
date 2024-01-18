/*
Se ingresan 5 números pertenecientes al arreglo A y otros 5 números
pertenecientes al arreglo B. La computadora muestra la intersección de A y B.
Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra 1 3 4.

@Author RoxDev
*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InterseccionArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[5]; // Declarar e inicializar el arreglo A de 5 enteros
        int[] B = new int[5]; // Declarar e inicializar el arreglo B de 5 enteros
        Set<Integer> C = new HashSet<>(); // Declarar e inicializar un conjunto C para almacenar la intersección

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

        // Convertir los arreglos A y B en conjuntos
        Set<Integer> setA = new HashSet<>(Arrays.asList(A));
        Set<Integer> setB = new HashSet<>(Arrays.asList(B));

        // Calcular la intersección de los conjuntos A y B y guardarla en el conjunto C
        C.addAll(setA);
        C.retainAll(setB);

        // Mostrar el conjunto C
        System.out.println("La intersección de A y B es:");
        System.out.println(C);
    }
}
