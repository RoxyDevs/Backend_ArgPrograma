/*
Un corredor desea registrar sus tiempos parciales por cada vuelta en
segundos. Para ello se ingresarán cada una de las ocho vueltas que duró la carrera.
La computadora debe mostrar los tiempos de cada vuelta en una línea, agregando un
carácter M o P antes de cada número que indica si mejoró o empeoró su tiempo con
respecto a la vuelta anterior.

@Author RoxDev
*/
import java.util.Scanner; //Importamos la clase Scanner para leer datos por teclado

public class TiemposCorredor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creamos un objeto Scanner para leer datos por teclado
        int[] tiempos = new int[8]; //Creamos un arreglo de 8 enteros para almacenar los tiempos de cada vuelta
        int anterior = 0; //Creamos una variable para guardar el tiempo de la vuelta anterior

        //Recorremos el arreglo con un bucle for
        for (int i = 0; i < tiempos.length; i++) {
            System.out.println("Ingrese el tiempo de la vuelta " + (i + 1) + " en segundos:"); //Pedimos al usuario que ingrese el tiempo de la vuelta actual
            tiempos[i] = sc.nextInt(); //Guardamos el tiempo en el arreglo
        }

        //Recorremos el arreglo con otro bucle for
        for (int i = 0; i < tiempos.length; i++) {
            //Si es la primera vuelta, solo mostramos el tiempo
            if (i == 0) {
                System.out.println("Tiempo de la vuelta 1: " + tiempos[i] + " segundos");
            } else {
                //Si no es la primera vuelta, comparamos el tiempo con el de la vuelta anterior
                //Si el tiempo es menor que el anterior, mostramos un M de mejoró
                if (tiempos[i] < anterior) {
                    System.out.println("Tiempo de la vuelta " + (i + 1) + ": M" + tiempos[i] + " segundos");
                    //Si el tiempo es mayor que el anterior, mostramos un P de peor
                } else if (tiempos[i] > anterior) {
                    System.out.println("Tiempo de la vuelta " + (i + 1) + ": P" + tiempos[i] + " segundos");
                    //Si el tiempo es igual al anterior, no mostramos nada
                } else {
                    System.out.println("Tiempo de la vuelta " + (i + 1) + ": " + tiempos[i] + " segundos");
                }
            }
            //Actualizamos el valor de la variable anterior con el tiempo de la vuelta actual
            anterior = tiempos[i];
        }

        sc.close(); //Cerramos el objeto Scanner
    }
}