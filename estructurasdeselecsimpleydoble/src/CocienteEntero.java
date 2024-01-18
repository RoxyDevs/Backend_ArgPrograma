/*  Se ingresan dos números enteros. La computadora muestra su cociente entero.
*   Si hubiere resto, mostrarlo en otra línea.
*
*  @Author RoxDev
 */
import java.util.Scanner;
public class CocienteEntero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Ingrese el primer número: ");
        int num1 =input.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = input.nextInt();
        int cociente = num1/ num2;
        int resto = num1 % num2;
        System.out.println("El cociente es: " + cociente);
        System.out.println("El resto es: " + resto);
    }
}
