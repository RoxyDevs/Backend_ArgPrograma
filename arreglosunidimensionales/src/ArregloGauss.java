/*
Crear un arreglo de 200 posiciones cargado con los números de 1 a 200. La
computadora debe mostrar el resultado de la suma de todos los números, sin
necesidad de hacer 200 sumas. (Recordar cómo lo resolvió Gauss).

@Author RoxDev
*/
import java.util.Arrays;

public class ArregloGauss {
    public static void main(String[] args) {
        // Declarar e inicializar un arreglo de 200 enteros
        int[] arreglo = new int[200];
        // Recorrer el arreglo con un bucle for
        for (int i = 0; i < arreglo.length; i++) {
            // Asignar el valor i + 1 a cada posición del arreglo
            arreglo[i] = i + 1;
        }
        // Mostrar el arreglo
        System.out.println("Arreglo: " + Arrays.toString(arreglo));
        // Aplicar la fórmula de Gauss para calcular la suma
        int suma = 200 * (200 + 1) / 2;
        // Mostrar el resultado
        System.out.println("La suma de los números del 1 al 200 es " + suma);
    }
}
