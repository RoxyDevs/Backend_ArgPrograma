/*



@Author RoxDev*/

public class MatrizTraspuesta {
    public static void main(String[]args){
        int[][] matriz = { {1,2,3} , {4,5,6} , {7,8,9} };

        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
    }
}
