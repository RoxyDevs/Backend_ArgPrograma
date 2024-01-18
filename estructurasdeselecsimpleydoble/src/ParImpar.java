/* Dado un número entero, la computadora indica si es par o impar.
*
* @Author RoxDev */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        int num = input.nextInt();
        if (num % 2== 0) {
            System.out.println(num + " es par. ");
        } else {
            System.out.println(num + " es impar.");
        }
    }
}