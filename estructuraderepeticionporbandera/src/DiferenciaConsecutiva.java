/*
Se ingresan números hasta que la diferencia entre dos números consecutivos
se repita. La computadora muestra la cantidad de números ingresados.

 @Author RoxDev
 */

import java.util.Scanner;

public class DiferenciaConsecutiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, anterior = 0, diferenciaAnterior = 0, diferenciaActual = 0, cantidad = 0;
        boolean repiteDiferencia = false;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
            if (cantidad > 0) {
                diferenciaActual = numero - anterior;
                if (diferenciaActual == diferenciaAnterior) {
                    repiteDiferencia = true;
                }
                diferenciaAnterior = diferenciaActual;
            }
            anterior = numero;
            cantidad++;
        } while (numero != 0 && !repiteDiferencia);
        System.out.println("Se ingresaron " + (cantidad - 1) + " números");
    }
}
