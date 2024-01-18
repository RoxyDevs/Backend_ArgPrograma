/*
 En un colegio existe la posibilidad de elegir, en la materia "lengua extranjera",
entre las siguientes opciones: [I]nglés, [F]rancés, [P]ortugués y [A]lemán. Se ingresa,
para cada alumno, la lengua elegida. La computadora muestra el porcentaje de
alumnos que eligió cada lengua, en forma de número y en forma gráfica (histograma),
utilizando líneas hechas con asteriscos

 @Author RoxDev
*/
import java.util.Scanner;

public class PorcentajeLenguas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadAlumnos = 0, cantidadIngles = 0, cantidadFrances = 0, cantidadPortugues = 0, cantidadAleman = 0;
        char seguirIngresando = 'S';
        while (seguirIngresando == 'S' || seguirIngresando == 's') {
            System.out.print("Ingrese la lengua extranjera elegida ([I]nglés, [F]rancés, [P]ortugués o [A]lemán): ");
            char lengua = sc.next().charAt(0);
            switch (lengua) {
                case 'I':
                case 'i':
                    cantidadIngles++;
                    break;
                case 'F':
                case 'f':
                    cantidadFrances++;
                    break;
                case 'P':
                case 'p':
                    cantidadPortugues++;
                    break;
                case 'A':
                case 'a':
                    cantidadAleman++;
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
                    continue;
            }
            cantidadAlumnos++;
            System.out.print("¿Desea ingresar la lengua extranjera elegida por otro alumno? [S/N]: ");
            seguirIngresando = sc.next().charAt(0);
        }
        System.out.println("Porcentaje de alumnos que eligieron cada lengua extranjera:");
        System.out.println("Inglés: " + (cantidadIngles * 100.0 / cantidadAlumnos) + "%");
        System.out.println("Francés: " + (cantidadFrances * 100.0 / cantidadAlumnos) + "%");
        System.out.println("Portugués: " + (cantidadPortugues * 100.0 / cantidadAlumnos) + "%");
        System.out.println("Alemán: " + (cantidadAleman * 100.0 / cantidadAlumnos) + "%");
        System.out.println("Histograma:");
        int maximo = Math.max(Math.max(cantidadIngles, cantidadFrances), Math.max(cantidadPortugues, cantidadAleman));
        for (int i = maximo; i > 0; i--) {
            System.out.print(i + "\t");
            if (cantidadIngles >= i) {
                System.out.print("*\t");
            } else {
                System.out.print("\t");
            }
            if (cantidadFrances >= i) {
                System.out.print("*\t");
            } else {
                System.out.print("\t");
            }
            if (cantidadPortugues >= i) {
                System.out.print("*\t");
            } else {
                System.out.print("\t");
            }
            if (cantidadAleman >= i) {
                System.out.print("*\t");
            } else {
                System.out.print("\t");
            }
            System.out.println();
        }
        System.out.println("\tInglés\tFrancés\tPortugués\tAlemán");
    }
}

