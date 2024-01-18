/* Rehacer los siguientes ejercicios de forma modularizada (utilizando funciones)

        Una casa de artículos para el hogar ofrece a sus clientes los siguientes planes de
        pago:
        ◦ Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
        ◦ Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se incrementa
        en un 10%.
        ◦ Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se incrementa
        en un 15%.
        ◦ Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en las
        primeras 4 cuotas y el resto se reparte en partes iguales en las últimas 4 cuotas. El precio
        publicado se incrementa en un 25%

        @Author RoxDev */

public class CasaArticulosHogar {
    public static double plan1(double precio) {
        return precio * 0.9;
    }

    public static double plan2(double precio) {
        return precio * 1.1 * 0.5;
    }

    public static double plan3(double precio) {
        return precio * 1.15 * 0.25;
    }

    public static double plan4(double precio) {
        double precioTotal = precio * 1.25;
        double precioPrimerasCuotas = precioTotal * 0.6;
        double precioUltimasCuotas = precioTotal * 0.4;
        return precioPrimerasCuotas / 4 + precioUltimasCuotas / 4;
    }
}