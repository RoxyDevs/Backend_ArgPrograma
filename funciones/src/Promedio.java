/*
Escribir la función obtenerPromedio, que devuelve el promedio resultante de un
arreglo de números enteros recibido como parámetro.

@Author RoxDev */
public class Promedio {
    public static double obtenerPromedio(int[] numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return (double) suma / numeros.length;
    }
}