/* Funciones:
             Definir la función obtenerResto, que devuelve (sin usar el operador %) el resto del
   cociente entre dos números enteros recibidos como parámetros.

   @Author RoxDev */

public class obtenerResto {
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 3;
        System.out.printf("El resto de la división entre %d y %d es %d\n", dividendo, divisor, obtenerResto(dividendo, divisor));
    }

    public static int obtenerResto(int dividendo, int divisor) {
        int cociente = dividendo / divisor;
        int producto = cociente * divisor;
        return dividendo - producto;
    }
}

