/* Se ingresan tres números. La computadora los muestra ordenados de menor a
* mayor.
*
* @Author RoxDev
* */
public class MayorAMenor {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int num3 = 8;
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(num1 + ", " + num2 + ", " + num3);
            } else {
                System.out.println(num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println(num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println(num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println(num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println(num3 + ", " + num2 + ", " + num1);
            }
        }
    }

}
