/*
     Manejo de cadenas:

                       Tomar como ejemplo el siguiente texto: “Y cómo huir cuando no quedan islas para
  naufragar al país donde los sabios se retiran del agravio de buscar labios que sacan de quicio,
  mentiras que ganan juicios tan sumarios que envilecen el cristal de los acuarios de los peces
  de ciudad que mordieron el anzuelo, que bucean a ras del suelo, que no merecen nadar.”

     Desarrollar los siguientes programas (debe funcionar para cualquier cadena):

9.1) Mostrar la cantidad total de vocales y la cantidad total de consonantes.
9.2) Mostrar la cantidad total de palabras.
9.3) Mostrar la cadena con las preposiciones encerradas entre asteriscos.
9.4) Mostrar la longitud promedio de las palabras que contiene la cadena.
9.5) Mostrar la cadena invertida.
9.6) Mostrar la lista de todos los pares de palabras consecutivas en los cuales la primera palabra
     termina con la inicial de la segunda. Ejemplo: Correr rápido.
9.7) Se ingresa una cadena. La computadora muestra las subcadenas formadas por las posiciones pares
     e impares (contando desde cero) de la cadena ingresada. Ejemplo: Ingresa “Tfernígoo”,
     debe devolver “Tengo” “frío”.
9.8) Se ingresa una cadena. La computadora indica si es, o no, un palíndromo.
     Ejemplo: Ingresa “A ti no, bonita”, debe devolver true.
9.9) Se ingresa una cadena y un número que indica el desplazamiento. La computadora debe cifrar
     los caracteres de la cadena que representen letras minúsculas o mayúsculas utilizando el cifrado
     César (también conocido como cifrado por desplazamiento). Mostrar cómo quedó la cadena.
9.10) Se tiene la siguiente cadena: "Qg jmepyq tcp cqrc KCLQYHC, cqryq ayby tcx kyq acpay bc qcp BGMQ.".
      Se sabe que está cifrada por método César (con el algoritmo realizado en el ejercicio 9.9)
      pero no se conoce el desplazamiento. La computadora debe descifrar la cadena con los 26
      desplazamientos posibles y mostrar cada resultado, esperando encontrar algún resultado que tenga
      sentido. ¿Lograrás ver el mensaje oculto?

* @Author RoxDev */

import java.util.Scanner;

public class ManejoDeCadenas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String texto = sc.nextLine();

        // 9.1) Mostrar la cantidad total de vocales y la cantidad total de consonantes.
        int vocales = 0, consonantes = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        System.out.println("Cantidad total de vocales: " + vocales);
        System.out.println("Cantidad total de consonantes: " + consonantes);

        // 9.2) Mostrar la cantidad total de palabras.
        String[] palabras = texto.split("\\s+");
        System.out.println("Cantidad total de palabras: " + palabras.length);

        // 9.3) Mostrar la cadena con las preposiciones encerradas entre asteriscos.
        String[] preposiciones = {"a", "ante", "bajo", "cabe", "con", "contra", "de", "desde", "durante", "en", "entre", "hacia", "hasta", "mediante", "para", "por", "según", "sin", "so", "sobre", "tras"};
        for (String preposicion : preposiciones) {
            texto = texto.replaceAll("\\b" + preposicion + "\\b", "*" + preposicion + "*");
        }
        System.out.println("Texto con preposiciones encerradas entre asteriscos: " + texto);

        // 9.4) Mostrar la longitud promedio de las palabras que contiene la cadena.
        int longitudTotal = 0;
        for (String palabra : palabras) {
            longitudTotal += palabra.length();
        }
        double longitudPromedio = (double) longitudTotal / palabras.length;
        System.out.println("Longitud promedio de las palabras: " + longitudPromedio);

        // 9.5) Mostrar la cadena invertida.
        StringBuilder sb = new StringBuilder(texto);
        sb.reverse();
        System.out.println("Texto invertido: " + sb.toString());

        // 9.6) Mostrar la lista de todos los pares de palabras consecutivas en los cuales la primera palabra termina con la inicial de la segunda.
        System.out.println("Pares de palabras consecutivas en las que la primera palabra termina con la inicial de la segunda:");
        for (int i = 0; i < palabras.length - 1; i++) {
            String palabra1 = palabras[i];
            String palabra2 = palabras[i + 1];
            if (palabra1.charAt(palabra1.length() - 1) == palabra2.charAt(0)) {
                System.out.println(palabra1 + " " + palabra2);
            }
        }

        // 9.7) Mostrar las subcadenas formadas por las posiciones pares e impares (contando desde cero) de la cadena ingresada.
        String subcadenaPares = "", subcadenaImpares = "";
        for (int i = 0; i < texto.length(); i++) {
            if (i % 2 == 0) {
                subcadenaPares += texto.charAt(i);
            } else {
                subcadenaImpares += texto.charAt(i);
            }
        }
        System.out.println("Subcadenas formadas por las posiciones pares e impares:");
        System.out.println("Pares: " + subcadenaPares);
        System.out.println("Impares: " + subcadenaImpares);

        // 9.8)

        String cadenaSinEspacios = texto.replaceAll("\\s+", "").toLowerCase();
        String reverso = new StringBuilder(cadenaSinEspacios).reverse().toString();
        boolean esPalindromo = cadenaSinEspacios.equals(reverso);
        System.out.println("La cadena " + (esPalindromo ? "es" : "no es") + " un palíndromo.");

        // 9.9)

        System.out.print("Ingrese una cadena: ");
        String cadenaCifrada = "";
        String cadenaOriginal = sc.nextLine();
        System.out.print("Ingrese el desplazamiento: ");
        int desplazamiento = sc.nextInt();
        for (int i = 0; i < cadenaOriginal.length(); i++) {
            char c = cadenaOriginal.charAt(i);
            if (Character.isLetter(c)) {
                int codigo = (int) c + desplazamiento;
                if (Character.isUpperCase(c)) {
                    cadenaCifrada += (char) ((codigo - 65) % 26 + 65);
                } else {
                    cadenaCifrada += (char) ((codigo - 97) % 26 + 97);
                }
            } else {
                cadenaCifrada += c;
            }
        }
        System.out.println("La cadena cifrada es: " + cadenaCifrada);

        // 9.10)
        String cadenaDescifrada = "";
        for (int i = 0; i < 26; i++) {
            cadenaDescifrada = "";
            for (int j = 0; j < cadenaCifrada.length(); j++) {
                char c = cadenaCifrada.charAt(j);
                if (Character.isLetter(c)) {
                    int codigo = (int) c - i;
                    if (Character.isUpperCase(c)) {
                        cadenaDescifrada += (char) ((codigo - 65 + 26) % 26 + 65);
                    } else {
                        cadenaDescifrada += (char) ((codigo - 97 + 26) % 26 + 97);
                    }
                } else {
                    cadenaDescifrada += c;
                }
            }
            System.out.println("Desplazamiento " + i + ": " + cadenaDescifrada);
        }
    }
}