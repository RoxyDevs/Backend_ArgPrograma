/* Dado un número entero de hasta 4 dígitos,
la computadora indica si es
capicúa.
*
* @Author RoxDev
 */
public class Capicua {
    public static void main(String[] args) {
        int num = 12321;
        int originalNum = num;
        int reversedNum = 0;
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " es capicúa.");
        } else {
            System.out.println(originalNum + " no es capicúa.");
        }
    }
}
