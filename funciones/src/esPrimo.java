/*
    Escribir la función booleana esPrimo, que devuelve true o false dependiendo si un
  número recibido como parámetro es primo.

@Author RoxDev */
public class esPrimo {
    public static boolean esPrimo(int n) {
        boolean esPrimo = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        return esPrimo;
    }
}