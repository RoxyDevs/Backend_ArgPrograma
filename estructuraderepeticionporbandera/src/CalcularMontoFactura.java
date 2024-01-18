/*
* Desarrollar un programa que pida una cantidad de artículos comprados y el
precio unitario de ese artículo. Por cada carga debe preguntar si se desea seguir
ingresando de la forma “¿Desea ingresar otro artículo? [S/N]”. La carga de datos
finaliza cuando se detecta una n o N. La computadora debe mostrar el monto de la
factura
*
* @Author RoxDev
*/

import java.util.Scanner;

public class CalcularMontoFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, precioUnitario, montoTotal = 0;
        char seguirIngresando = 'S';
        while (seguirIngresando == 'S' || seguirIngresando == 's') {
            System.out.print("Ingrese la cantidad de artículos comprados: ");
            cantidad = sc.nextInt();
            System.out.print("Ingrese el precio unitario del artículo: ");
            precioUnitario = sc.nextInt();
            montoTotal += cantidad * precioUnitario;
            System.out.print("¿Desea ingresar otro artículo? [S/N]: ");
            seguirIngresando = sc.next().charAt(0);
        }
        System.out.println("El monto total de la factura es $" + montoTotal);
    }
}

