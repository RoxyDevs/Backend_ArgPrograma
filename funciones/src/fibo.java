/*
8.3) Escribir la función fibo, que devuelve el n-ésimo término de la sucesión de Fibonacci,
donde n es un entero que se recibe como parámetro.

@Author RoxDev */

public class fibo {
    public static int fibo(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
    }
}