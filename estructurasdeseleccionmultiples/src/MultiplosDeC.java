/*
Dados los números naturales A, B y C, la computadora muestra los múltiplos
de C ubicados entre A y B (sin incluir los extremos).
Ejemplo: Se ingresa 10, 30 y 6, la computadora muestra 12 18 24.

 @Author RoxDev
* */

import java.util.Scanner;

public class MultiplosDeC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        System.out.print("Ingrese el valor de A: ");
        A = sc.nextInt();
        System.out.print("Ingrese el valor de B: ");
        B = sc.nextInt();
        System.out.print("Ingrese el valor de C: ");
        C = sc.nextInt();
        for (int i = A + 1; i < B; i++) {
            if (i % C == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
