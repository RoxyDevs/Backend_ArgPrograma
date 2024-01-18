// Dado un tiempo en segundos, la computadora lo muestra expresado en días,
// horas, minutos y segundos.
// Ejemplo: Ingresa 1000000, debe devolver 11d, 13h, 46m y 40s.

import java.util.Scanner;

// @Author RoxDev
public class SegundosADias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el tiempo en segundos: ");
        int inputSeconds = sc.nextInt();

        int days = inputSeconds / 86400;
        int hours = (inputSeconds % 86400) / 3600;
        int minutes = ((inputSeconds % 86400) % 3600) / 60;
        int seconds = ((inputSeconds % 86400) % 3600) % 60;

        System.out.println("El tiempo ingresado es equivalente a " + days + "d, " + hours + "h, " + minutes + "m y " + seconds + "s.");
    }
}
