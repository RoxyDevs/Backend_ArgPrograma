/*
    Escriba un programa que, dado el dato del cumpleaños del usuario (día y mes), la
    computadora diga cuál es su signo del zodiaco. Ejemplo: Se ingresa 24 y 2, la
    computadora muestra “PISCIS”.

    @Author RoxDev */

import java.util.Scanner;

public class SignoZodiaco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el día de tu cumpleaños: ");
        int dia = sc.nextInt();
        System.out.print("Ingresa el mes de tu cumpleaños: ");
        int mes = sc.nextInt();
        String signo = obtenerSignoZodiaco(dia, mes);
        System.out.println("Tu signo del zodiaco es " + signo);
    }

    public static String obtenerSignoZodiaco(int dia, int mes) {
        String signo = "";
        if (mes == 1) {
            if (dia < 20) {
                signo = "Capricornio";
            } else {
                signo = "Acuario";
            }
        } else if (mes == 2) {
            if (dia < 19) {
                signo = "Acuario";
            } else {
                signo = "Piscis";
            }
        } else if (mes == 3) {
            if (dia < 21) {
                signo = "Piscis";
            } else {
                signo = "Aries";
            }
        } else if (mes == 4) {
            if (dia < 20) {
                signo = "Aries";
            } else {
                signo = "Tauro";
            }
        } else if (mes == 5) {
            if (dia < 21) {
                signo = "Tauro";
            } else {
                signo = "Géminis";
            }
        } else if (mes == 6) {
            if (dia < 21) {
                signo = "Géminis";
            } else {
                signo = "Cáncer";
            }
        } else if (mes == 7) {
            if (dia < 23) {
                signo = "Cáncer";
            } else {
                signo = "Leo";
            }
        } else if (mes == 8) {
            if (dia < 23) {
                signo = "Leo";
            } else {
                signo = "Virgo";
            }
        } else if (mes == 9) {
            if (dia < 23) {
                signo = "Virgo";
            } else {
                signo = "Libra";
            }
        } else if (mes == 10) {
            if (dia < 23) {
                signo = "Libra";
            } else {
                signo = "Escorpio";
            }
        } else if (mes == 11) {
            if (dia < 22) {
                signo = "Escorpio";
            } else {
                signo = "Sagitario";
            }
        } else if (mes == 12) {
            if (dia < 22) {
                signo = "Sagitario";
            } else {
                signo = "Capricornio";
            }
        }
        return signo;
    }
}

