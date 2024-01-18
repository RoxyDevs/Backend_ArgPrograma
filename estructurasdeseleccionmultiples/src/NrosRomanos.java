/*
El usuario ingresa un número y la computadora le muestra su correspondiente
representación en número romano. No se debe ingresar un valor distinto de 1, 5, 10,
50, 100, 500, 1000.
Ejemplo: Se ingresa 500, la computadora muestra ‘D’

@Author RoxDev
 */

import java.util.Scanner;

public class NrosRomanos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un número entre 1 y 3999: ");
        num = input.nextInt();

        if (num < 1 || num > 3999) {
            System.out.println("Error: El número ingresado está fuera de rango.");
        } else {
            String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            int[] decimalValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String romanNumeral = "";

            for (int i = 0; i < decimalValues.length; i++) {
                while (num >= decimalValues[i]) {
                    romanNumeral += romanNumerals[i];
                    num -= decimalValues[i];
                }
            }

            System.out.println("El número " + input.nextInt() + " en números romanos es " + romanNumeral + ".");
        }

        input.close();
    }
}

