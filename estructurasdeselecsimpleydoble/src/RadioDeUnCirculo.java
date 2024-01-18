/* Dados el valor del radio de un círculo cuyo centro está ubicado en (0;0) y dadas las coordenadas (x;y)
* de un punto, la computadora informa si el punto pertenece o no al círculo.
*
* @Author RoxDev
 */

public class RadioDeUnCirculo {
    public static void main(String[] args) {
        double radius = 5.0;
        double x = 2.0;
        double y = 3.0;
        double distance = Math.sqrt(x * x + y * y);
        if (distance <= radius) {
            System.out.println("El punto (" + x + ", " + y + ") está dentro del círculo.");
        } else {
            System.out.println("El punto (" + x + ", " + y + ") está fuera del círculo.");
        }
    }
}