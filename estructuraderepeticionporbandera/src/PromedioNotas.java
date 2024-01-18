/*
Se ingresan notas numéricas de 0 a 10. El proceso de carga finaliza cuando se
detecta un número fuera de rango (negativo o mayor que 10). La computadora
muestra el promedio de las notas.

@Author RoxDev
*/
import java.util.Scanner;

public class PromedioNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, cantidad = 0;
        double suma = 0, promedio;
        System.out.println("Ingrese notas numéricas de 0 a 10 (ingrese un número fuera de rango para terminar)");
        do {
            System.out.print("Nota: ");
            nota = sc.nextInt();
            if (nota >= 0 && nota <= 10) {
                suma += nota;
                cantidad++;
            }
        } while (nota >= 0 && nota <= 10);
        if (cantidad > 0) {
            promedio = suma / cantidad;
            System.out.printf("El promedio de las notas ingresadas es %.2f", promedio);
        } else {
            System.out.println("No se ingresaron notas válidas");
        }
    }
}