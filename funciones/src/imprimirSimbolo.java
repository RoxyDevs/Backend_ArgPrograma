/*
  Escribir la función imprimirSimbolo, que imprime por consola n veces un carácter en
la misma línea. Tanto n como el carácter se reciben como parámetro.

@Author RoxDev */
public class imprimirSimbolo {
    public static void main (int n, char c) {
        for (int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
}