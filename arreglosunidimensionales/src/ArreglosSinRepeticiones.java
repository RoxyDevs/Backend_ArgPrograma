/*
Se ingresan 10 números. La computadora los muestra eliminando las
repeticiones

@Author RoxDev
*/
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArregloSinRepeticiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arreglo = new int[10];
        Set<Integer> conjunto = new HashSet<>();
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("Ingrese un número: ");
            int numero = sc.nextInt();
            if (conjunto.add(numero)) {
                arreglo[i] = numero;
            }
        }
        System.out.println("Arreglo sin repeticiones: " + Arrays.toString(Arrays.stream(arreglo).filter(n -> n != 0).toArray()));
    }
}
