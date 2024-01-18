/*
Se tiene un arreglo de enteros. La computadora muestra sus inversos de atrás
para adelante

@Author RoxDev
*/
import java.util.Arrays;

public class ArregloInverso {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        for (int i = 0; i < arreglo.length / 2; i++) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - i - 1];
            arreglo[arreglo.length - i - 1] = temp;
        }
        System.out.println("Arreglo inverso: " + Arrays.toString(arreglo));
    }
}
