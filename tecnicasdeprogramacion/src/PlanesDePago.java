/* Una casa de artículos para el hogar ofrece a sus clientes los siguientes planes de pago:
*        ◦ Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
*        ◦ Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se incrementa en un 10%.
*        ◦ Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se incrementa en un 15%.
*        ◦ Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en las primeras
*        4 cuotas y el resto se reparte en partes iguales en las últimas 4 cuotas.
*        El precio publicado se incrementa en un 25%.
*/

// @Author RoxDev

import java.util.Scanner;

public class PlanesDePago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el precio publicado: ");
        double price = sc.nextDouble();

        System.out.println("Selecciona un plan de pago (1-4): ");
        int plan = sc.nextInt();

        double total = 0;
        switch (plan) {
            case 1:
                total = price * 0.9;
                break;
            case 2:
                total = price * 1.1;
                double half = total / 2;
                System.out.println("Deberás pagar " + half + " al contado y el resto en 2 cuotas iguales.");
                break;
            case 3:
                total = price * 1.15;
                double quarter = total / 4;
                System.out.println("Deberás pagar " + quarter + " al contado y el resto en 5 cuotas iguales.");
                break;
            case 4:
                total = price * 1.25;
                double firstHalf = total * 0.6 / 4;
                double secondHalf = total * 0.4 / 4;
                System.out.println("Deberás pagar " + firstHalf + " en las primeras 4 cuotas y " + secondHalf + " en las últimas 4 cuotas.");
                break;
            default:
                System.out.println("Plan de pago inválido.");
                return;
        }

        System.out.println("El precio total es de " + total + ".");
    }
}