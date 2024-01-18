/* Dada la cantidad de alumnos de un curso y la cantidad de sillas disponibles, la
* computadora indica si alcanzan las sillas, en caso contrario, indica cuántas faltan para
* que todo el alumnado tenga asiento.
*
* @Author RoxDev
 */

public class LugaresAula {
    public static void main(String[] args) {
        int numStudents = 30;
        int numChairs = 25;
        if (numStudents <= numChairs) {
            System.out.println("Hay suficientes sillas para todos los estudiantes.");
        } else {
            int chairsNeeded = numStudents - numChairs;
            System.out.println("Faltan " + chairsNeeded + " sillas para que todos los estudiantes tengan asiento.");
        }
    }
}
