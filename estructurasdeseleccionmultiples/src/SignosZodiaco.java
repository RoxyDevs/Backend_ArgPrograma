/*
Escriba un programa que, dado el dato del cumpleaños del usuario (día y mes),
la computadora diga cuál es su signo del zodiaco.
Ejemplo: Se ingresa 24 y 2, la computadora muestra “PISCIS”.

@Author RoxDev
 */
import java.util.Scanner;

public class SignosZodiaco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;

        System.out.print("Ingrese su día de nacimiento: ");
        day = input.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        month = input.nextInt();

        String signo = "";
        switch (month) {
            case 1:
                if (day >= 20) {
                    signo = "Acuario";
                } else {
                    signo = "Capricornio";
                }
                break;
            case 2:
                if (day >= 19) {
                    signo = "Piscis";
                } else {
                    signo = "Acuario";
                }
                break;
            case 3:
                if (day >= 21) {
                    signo = "Aries";
                } else {
                    signo = "Piscis";
                }
                break;
            case 4:
                if (day >= 20) {
                    signo = "Tauro";
                } else {
                    signo = "Aries";
                }
                break;
            case 5:
                if (day >= 21) {
                    signo = "Géminis";
                } else {
                    signo = "Tauro";
                }
                break;
            case 6:
                if (day >= 21) {
                    signo = "Cáncer";
                } else {
                    signo = "Géminis";
                }
                break;
            case 7:
                if (day >= 23) {
                    signo = "Leo";
                } else {
                    signo = "Cáncer";
                }
                break;
            case 8:
                if (day >= 23) {
                    signo = "Virgo";
                } else {
                    signo = "Leo";
                }
                break;
            case 9:
                if (day >= 23) {
                    signo = "Libra";
                } else {
                    signo = "Virgo";
                }
                break;
            case 10:
                if (day >= 23) {
                    signo = "Escorpio";
                } else {
                    signo = "Libra";
                }
                break;
            case 11:
                if (day >= 22) {
                    signo = "Sagitario";
                } else {
                    signo = "Escorpio";
                }
                break;
            case 12:
                if (day >= 22) {
                    signo = "Capricornio";
                } else {
                    signo = "Sagitario";
                }
                break;
            default:
                System.out.println("Error: El mes ingresado está fuera de rango.");
                break;
        }

        System.out.println("Tu signo del zodiaco es " + signo + ".");

        input.close();
    }
}

