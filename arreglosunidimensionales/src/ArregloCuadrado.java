/*
Se tiene un arreglo de enteros. La computadora muestra sus valores al
cuadrado.

@Author RoxDev
*/
import java.util.Arrays;

public class ArregloCuadrado {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] * arreglo[i];
        }
        System.out.println("Arreglo al cuadrado: " + Arrays.toString(arreglo));
    }
}
