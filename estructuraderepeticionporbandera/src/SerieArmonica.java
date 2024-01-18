/*Dado un número real L perteneciente al intervalo [1,10], la computadora
informa la cantidad de términos de la serie armónica necesarios para satisfacer la
desigualdad: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n > L.
Ejemplo: Se ingresa 5, la computadora muestra 83.

@Author RoxDev
*/

import java.util.Scanner;

public class SerieArmonica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L;
        System.out.print("Ingrese un número real entre 1 y 10: ");
        L = sc.nextDouble();
        while (L < 1 || L > 10) {
            System.out.print("El número ingresado no está dentro del rango permitido. Ingrese un número real entre 1 y 10: ");
            L = sc.nextDouble();
        }
        double suma = 0;
        int n = 0;
        while (suma <= L) {
            n++;
            suma += 1.0 / n;
        }
        System.out.println("La cantidad de términos necesarios para satisfacer la desigualdad es " + n);
    }
}
