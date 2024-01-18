/*
4.2) Dados dos números naturales b y e, la computadora muestra el valor de b
e sin
utilizar operadores o funciones que calculen exponentes.
Ejemplo: Se ingresa 2 y 5, la computadora muestra 32.

@Author RoxDev
*/

// Importar la clase Scanner para leer la entrada del usuario
import java.util.Scanner;

// Definir la clase principal
public class CalcularExponente {

    // Definir el método principal
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que ingrese la base y el exponente
        System.out.println("Ingrese la base:");
        int b = sc.nextInt();
        System.out.println("Ingrese el exponente:");
        int e = sc.nextInt();

        // Llamar al método potencia para calcular el resultado
        int resultado = potencia(b, e);

        // Mostrar el resultado
        System.out.println(b + " elevado a " + e + " es " + resultado);
    }

    // Definir el método potencia que recibe la base y el exponente como parámetros
    public static int potencia(int b, int e) {
        // Inicializar el resultado con 1
        int resultado = 1;

        // Usar un bucle for para multiplicar la base por sí misma e veces
        for (int i = 0; i < e; i++) {
            resultado = resultado * b;
        }

        // Devolver el resultado
        return resultado;
    }
}

