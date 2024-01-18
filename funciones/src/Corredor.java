/* Un corredor desea registrar sus tiempos parciales por cada vuelta en segundos. Para
        ello se ingresarán cada una de las ocho vueltas que duró la carrera. La computadora debe
        mostrar los tiempos de cada vuelta en una línea, agregando un carácter M o P antes de cada
        número que indica si mejoró o empeoró su tiempo con respecto a la vuelta anterior

@Author RoxDev */

import java.util.Scanner;

public class Corredor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tiempos = new int[8];
        char[] mejoras = new char[8];
        System.out.println("Ingrese los tiempos de las 8 vueltas en segundos:");
        tiempos[0] = sc.nextInt();
        for (int i = 1; i < 8; i++) {
            tiempos[i] = sc.nextInt();
            if (tiempos[i] < tiempos[i - 1]) {
                mejoras[i] = 'M';
            } else {
                mejoras[i] = 'P';
            }
        }
        System.out.print("Tiempos de cada vuelta: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(mejoras[i] + tiempos[i] + " ");
        }
    }
}

