// Dado el valor del radio de una circunferencia, la computadora muestra el valor
// de su superficie y su perímetro.
// Ejemplo: Ingresa 5, debe devolver Sup: 78.5398163397 y Per: 31.4159265359.

// @Author RoxDev


import java.util.Scanner;

public class ValorRadio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor del radio: ");
        double radio = scanner.nextDouble();
        double superficie = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;
        System.out.println("Sup: " + superficie + " y Per: " + perimetro + ".");
    }
}