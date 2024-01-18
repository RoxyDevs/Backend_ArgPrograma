// Dados dos valores para cada cateto de un triángulo rectángulo, la computadora
//calcula y muestra el valor de la hipotenusa.
//Ejemplo: Ingresa 3 y 4, debe devolver 5.

//@Author RoxDev

import java.util.Scanner;

public class CatetoTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.print("Ingresa el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        System.out.println("La hipotenusa es " + hipotenusa + ".");
    }
}

