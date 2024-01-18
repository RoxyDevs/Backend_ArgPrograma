/*
Arreglos multidimensionales
Dada la siguiente matriz int[][] matriz = { {1,2,3} , {4,5,6} , {7,8,9} };
realizar los siguientes enunciados (del 7.1 al 7.4):

Mostrar la matriz en forma de tabla.

@Author RoxDev */
public class EjercicioArreglosMultidimensionales {
    public static void main(String[] args) {
        int[][] matriz = { {1,2,3} , {4,5,6} , {7,8,9} };
        System.out.println("7.1) Mostrar la matriz en forma de tabla:");
        mostrarMatriz(matriz);
        System.out.println("7.2) Multiplicar todos los valores de la matriz por 2 y mostrar la matriz en forma de tabla:");
        multiplicarMatriz(matriz, 2);
        System.out.println("7.3) Mostrar la matriz transpuesta:");
        mostrarMatriz(transponerMatriz(matriz));
        System.out.println("7.4) Mostrar los valores de la diagonal principal:");
        mostrarDiagonal(matriz);
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void multiplicarMatriz(int[][] matriz, int multiplicador) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] *= multiplicador;
            }
        }
        mostrarMatriz(matriz);
    }

    public static int[][] transponerMatriz(int[][] matriz) {
        int[][] transpuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    public static void mostrarDiagonal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}
