/* Escribir un programa que simule una calculadora básica que realice
operaciones de suma, resta, multiplicación y división. Se deben recibir como entrada
dos números reales y un operador, que puede ser +, -, * ó /. La salida del programa
debe ser el resultado de la operación.
*
 @Author RoxDev*/

import java.util.Scanner;

    public class Calculadora {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double num1, num2, result;
            char operator;

            System.out.print("Ingrese el primer número: ");
            num1 = input.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            num2 = input.nextDouble();

            System.out.print("Ingrese el operador (+, -, *, /): ");
            operator = input.next().charAt(0);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println(num1 + " + " + num2 + " = " + result);
                    break;

                case '-':
                    result = num1 - num2;
                    System.out.println(num1 + " - " + num2 + " = " + result);
                    break;

                case '*':
                    result = num1 * num2;
                    System.out.println(num1 + " * " + num2 + " = " + result);
                    break;

                case '/':
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        result = num1 / num2;
                        System.out.println(num1 + " / " + num2 + " = " + result);
                    }
                    break;

                default:
                    System.out.println("Operador inválido.");
                    break;
            }

            input.close();
        }
    }