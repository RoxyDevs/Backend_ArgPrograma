/*
El usuario ingresa 12 valores, de a uno por vez, pertenecientes a sus sueldos
mensuales durante un año. La computadora muestra su sueldo anual. Si durante la
carga de los sueldos mensuales se detecta un valor negativo, esto indica que aún no
se ha cobrado el mes en curso, por lo tanto, deben dejar de ingresarse datos y la
computadora debe mostrar la sumatoria de sueldos que se llevan cobrados.

@Author RoxDev
*/
import java.util.Scanner;

public class CalcularSueldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sueldoMensual, sueldoAnual = 0, mesActual = 1;
        boolean cobroCompleto = true;
        while (mesActual <= 12 && cobroCompleto) {
            System.out.print("Ingrese el sueldo del mes " + mesActual + ": ");
            sueldoMensual = sc.nextInt();
            if (sueldoMensual < 0) {
                cobroCompleto = false;
            } else {
                sueldoAnual += sueldoMensual;
                mesActual++;
            }
        }
        if (cobroCompleto) {
            System.out.println("El sueldo anual es $" + sueldoAnual);
        } else {
            System.out.println("La sumatoria de sueldos que se llevan cobrados es $" + sueldoAnual);
        }
    }
}
