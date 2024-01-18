/*
Se ingresan 5 números pertenecientes al arreglo A y otros 5 números
pertenecientes al arreglo B. La computadora muestra la diferencia de A y B.
Ejemplo: Se ingresa 1 2 3 4 5 y 4 7 1 3 6 la computadora muestra 2 5

@Author RoxDev
*/

import java.util.HashSet;
import java.util.Scanner;

public class DiferenciaArreglos {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Crear dos objetos HashSet para los conjuntos A y B
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();

        // Pedir al usuario que ingrese 5 números para el conjunto A
        System.out.println("Ingrese 5 números para el conjunto A:");
        for (int i = 0; i < 5; i++) {
            // Leer el número y agregarlo al conjunto A
            int num = sc.nextInt();
            A.add(num);
        }

        // Pedir al usuario que ingrese 5 números para el conjunto B
        System.out.println("Ingrese 5 números para el conjunto B:");
        for (int i = 0; i < 5; i++) {
            // Leer el número y agregarlo al conjunto B
            int num = sc.nextInt();
            B.add(num);
        }

        // Calcular la diferencia de A y B
        // Crear una copia de A para no modificar el original
        HashSet<Integer> diferencia = new HashSet<>(A);
        // Eliminar de la copia los elementos que también están en B
        diferencia.removeAll(B);

        // Mostrar la diferencia de A y B
        System.out.println("La diferencia de A y B es: " + diferencia);
    }
}
