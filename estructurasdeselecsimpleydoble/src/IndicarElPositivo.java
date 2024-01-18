/* Dado un número, la computadora indica si es positivo.
*
* @Author RoxDev */

import java.sql.SQLOutput;
import java.util.Scanner;

public class IndicarElPositivo {
    public static void main(String[] args) {
        Scanner input = new
                Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.print(num + " es positivo.");
        } else if (num < 0) {
            System.out.println(num + " es negativo.");
        } else {
            System.out.println(num + " es cero.");
        }

    }
}