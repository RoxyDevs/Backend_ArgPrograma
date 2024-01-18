/*En un colegio existe la posibilidad de elegir, en la materia "lengua extranjera", entre las
siguientes opciones: [I]nglés, [F]rancés, [P]ortugués y [A]lemán. Se ingresa, para cada
alumno, la lengua elegida. La computadora muestra el porcentaje de alumnos que eligió cada
lengua, en forma de número y en forma gráfica (histograma), utilizando líneas hechas con
asteriscos.

@Author RoxDev */
import java.util.Scanner;

public class LenguaExtranjera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ingles = 0;
        int frances = 0;
        int portugues = 0;
        int aleman = 0;
        int total = 0;
        while (true) {
            System.out.print("Ingresa la lengua extranjera elegida (I, F, P o A) o 'q' para salir: ");
            String eleccion = sc.nextLine();
            if (eleccion.equals("q")) {
                break;
            } else if (eleccion.equals("I")) {
                ingles++;
            } else if (eleccion.equals("F")) {
                frances++;
            } else if (eleccion.equals("P")) {
                portugues++;
            } else if (eleccion.equals("A")) {
                aleman++;
            }
            total++;
        }
        double porcentajeIngles = (double) ingles / total * 100;
        double porcentajeFrances = (double) frances / total * 100;
        double porcentajePortugues = (double) portugues / total * 100;
        double porcentajeAleman = (double) aleman / total * 100;
        System.out.println("Porcentaje de alumnos que eligieron cada lengua:");
        System.out.printf("Inglés: %.2f%%\n", porcentajeIngles);
        System.out.printf("Francés: %.2f%%\n", porcentajeFrances);
        System.out.printf("Portugués: %.2f%%\n", porcentajePortugues);
        System.out.printf("Alemán: %.2f%%\n", porcentajeAleman);
        System.out.println("Histograma:");
        int max = Math.max(Math.max(ingles, frances), Math.max(portugues, aleman));
        for (int i = max; i > 0; i--) {
            System.out.print(i + "|");
            if (ingles >= i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (frances >= i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (portugues >= i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            if (aleman >= i) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("-+----");
        System.out.println(" |IFPA");
    }
}

