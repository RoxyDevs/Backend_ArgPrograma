/* Dados dos números enteros,
*la computadora indica si el mayor es divisible por el menor.
 *
 * @Author RoxDev */

public class MayorDivisible {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        if (num1 > num2) {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " es divisible por " + num2);
            } else {
                System.out.println(num1 + " no es divisible por " + num2);
            }
        } else if (num2 > num1) {
            if (num2 % num1 == 0) {
                System.out.println(num2 + " es divisible por " + num1);
            } else {
                System.out.println(num2 + " no es divisible por " + num1);
            }
        } else {
            System.out.println("Los números son iguales.");
        }
    }
}
