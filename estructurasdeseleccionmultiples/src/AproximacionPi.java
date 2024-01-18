/*
* Dada la cantidad de términos a considerar entre los paréntesis, la computadora
muestra el valor de la correspondiente aproximación de Pi descubierta por Leibniz: 4 ·
(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ... + 1/n).
Ejemplo: Se ingresa 5, la computadora muestra 3.33968
*
* @Author RoxDev
* */

import java.util.Scanner;

public class AproximacionPi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double pi = 0;
        System.out.print("Ingrese la cantidad de términos a considerar: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        pi *= 4;
        System.out.printf("La aproximación de Pi con %d términos es %.5f", n, pi);
    }
}

