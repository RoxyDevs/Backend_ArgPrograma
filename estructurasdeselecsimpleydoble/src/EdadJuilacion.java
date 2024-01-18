// Dada la edad de una persona y su género (“F” para mujeres, “M” para
// hombres), la computadora indica si está en edad de jubilarse.

// @Author RoxDev

public class EdadJuilacion {
    public static void main(String[] args) {
        int age = 65;
        char gender = 'M';
        if (gender == 'M' && age >= 65) {
            System.out.println("Está en edad de jubilarse.");
        } else if (gender == 'F' && age >= 60) {
            System.out.println("Está en edad de jubilarse.");
        } else {
            System.out.println("No está en edad de jubilarse.");
        }
    }
}
