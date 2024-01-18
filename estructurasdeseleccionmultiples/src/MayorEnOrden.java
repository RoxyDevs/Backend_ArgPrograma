/*
Se ingresan 5 números. La computadora muestra cuál fue el mayor y en qué
orden apareció.
Ejemplo: Se ingresa 4 8 6 7 5, la computadora muestra “8 en la 2º posición”.

@Author RoxDev
*/
import java.util.Scanner;

public class MayorEnOrden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mayor = Integer.MIN_VALUE;
        int posicion = -1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = sc.nextInt();
            if (numero > mayor) {
                mayor = numero;
                posicion = i;
            }
        }
        System.out.println(mayor + " en la " + posicion + "º posición");
    }
}
