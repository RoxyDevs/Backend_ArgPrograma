/*
Desarrollar un programa que pida un carácter al usuario y que por cada carga
pregunte si se desea seguir ingresando. De la forma “¿Desea ingresar otro
carácter? [S/N]”. La carga de datos finaliza cuando se detecta una n o N. La
computadora debe mostrar la cantidad de letras vocales ingresadas. (Debe admitir
mayúsculas y minúsculas).

@Author RoxDev
 */

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char letra;
        int cantidadVocales = 0;
        boolean seguirIngresando = true;
        while (seguirIngresando) {
            System.out.print("Ingrese una letra: ");
            letra = sc.next().charAt(0);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cantidadVocales++;
            }
            System.out.print("¿Desea ingresar otra letra? [S/N]: ");
            letra = sc.next().charAt(0);
            if (letra == 'n' || letra == 'N') {
                seguirIngresando = false;
            }
        }
        System.out.println("Se ingresaron " + cantidadVocales + " letras vocales");
    }
}
