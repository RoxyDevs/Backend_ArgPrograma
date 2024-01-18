/*
Una cuenta bancaria tiene 30000 pesos de saldo. El usuario ingresará valores
que corresponden a extracciones vía cajero automático.
Por cada extracción se debe mostrar como quedó el saldo luego de la operación.
Una extracción que supere al saldo disponible se debe rechazar indicando
que no es posible la operación.
El programa finaliza cuando el saldo queda en cero.

@Author RoxDev
*/
import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 30000;
        int extraccion;
        while (saldo > 0) {
            System.out.print("Ingrese el monto a extraer: ");
            extraccion = sc.nextInt();
            if (extraccion > saldo) {
                System.out.println("No es posible realizar la operación. El saldo disponible es " + saldo);
            } else {
                saldo -= extraccion;
                System.out.println("La operación se realizó con éxito. El saldo actual es " + saldo);
            }
        }
        System.out.println("El saldo ha quedado en cero");
    }
}
