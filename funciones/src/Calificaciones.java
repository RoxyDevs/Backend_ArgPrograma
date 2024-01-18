/*

Se tiene una matriz llamada calificaciones de 5 x 3, que representa las 3
calificaciones de cada uno de los 5 alumnos de un curso.
int[][] calificaciones = { {2,7,9} , {5,5,6} , {10,6,5} , {8,2,9} , {1,1,3} };
Dada la matriz, se pide hallar:
◦ Promedio de cada alumno.
◦ Promedio de cada materia.
◦ Promedio general del curso (todos los alumnos).
◦ Cantidad de alumnos con al menos un aplazo (calificación menor que 4).

@Author RoxDev */

public class Calificaciones {
    public static void main(String[] args) {
        int[][] calificaciones = { {2,7,9} , {5,5,6} , {10,6,5} , {8,2,9} , {1,1,3} };
        int[] promedioAlumno = new int[5];
        int[] promedioMateria = new int[3];
        int promedioGeneral = 0;
        int alumnosConAplazo = 0;

        // Promedio de cada alumno
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += calificaciones[i][j];
            }
            promedioAlumno[i] = sum / 3;
        }

        // Promedio de cada materia
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += calificaciones[j][i];
            }
            promedioMateria[i] = sum / 5;
        }

        // Promedio general del curso
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                sum += calificaciones[i][j];
            }
        }
        promedioGeneral = sum / 15;

        // Cantidad de alumnos con al menos un aplazo
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (calificaciones[i][j] < 4) {
                    alumnosConAplazo++;
                    break;
                }
            }
        }

        // Imprimir resultados
        System.out.println("Promedio de cada alumno:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i+1) + ": " + promedioAlumno[i]);
        }
        System.out.println();

        System.out.println("Promedio de cada materia:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Materia " + (i+1) + ": " + promedioMateria[i]);
        }
        System.out.println();

        System.out.println("Promedio general del curso: " + promedioGeneral);
        System.out.println();

        System.out.println("Cantidad de alumnos con al menos un aplazo: " + alumnosConAplazo);
    }
}