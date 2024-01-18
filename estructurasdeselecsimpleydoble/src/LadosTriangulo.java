/* Los tres lados a, b y c de un triángulo deben satisfacer la desigualdad
triangular: cada uno de los lados no puede ser más largo que la suma de los otros
dos. Escriba un programa que reciba como entrada los tres lados de un triángulo, e
indique: si acaso el triángulo es inválido; y, si no lo es, qué tipo de triángulo es
(equilátero, isósceles o escaleno).
*
* @Author RoxDev
 */

public class LadosTriangulo {
    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("El triángulo es equilátero.");
            } else if (a == b || b == c || a == c) {
                System.out.println("El triángulo es isósceles.");
            } else {
                System.out.println("El triángulo es escaleno.");
            }
        } else {
            System.out.println("Los lados no satisfacen la desigualdad triangular.");
        }
    }
}
