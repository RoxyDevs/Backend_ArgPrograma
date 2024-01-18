/*
* Se tiene una matriz llamada calificaciones de 5 x 3, que representa las 3
calificaciones de cada uno de los 5 alumnos de un curso.
int[][] calificaciones = { {2,7,9} , {5,5,6} , {10,6,5} , {8,2,9} , {1,1,3} };
Dada la matriz, se pide hallar:
◦ Promedio de cada alumno.
◦ Promedio de cada materia.
◦ Promedio general del curso (todos los alumnos).
◦ Cantidad de alumnos con al menos un aplazo (calificación menor que 4).

* @Author RoxDev
*/

public class EjercicioCalificaciones {
        public static void main(String[] args) {
        int[][] calificaciones = {{2, 7, 9}, {5, 5, 6}, {10, 6, 5}, {8, 2, 9}, {1, 1, 3}};
        System.out.println("Promedio de cada alumno:");
        promedioAlumno(calificaciones);
        System.out.println("Promedio de cada materia:");
        promedioMateria(calificaciones);
        System.out.println("Promedio general del curso (todos los alumnos):");
        promedioGeneral(calificaciones);
        System.out.println("Cantidad de alumnos con al menos un aplazo (calificación menor que 4):");
        cantidadAplazos(calificaciones);
    }

    public static void promedioAlumno(int[][] calificaciones) {
        for (int i = 0; i < calificaciones.length; i++) {
            double promedio = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                promedio += calificaciones[i][j];
            }
            promedio /= calificaciones[i].length;
            System.out.printf("Alumno %d: %.2f\n", i + 1, promedio);
        }
    }

    public static void promedioMateria(int[][] calificaciones) {
        for (int i = 0; i < calificaciones[0].length; i++) {
            double promedio = 0;
            for (int j = 0; j < calificaciones.length; j++) {
                promedio += calificaciones[j][i];
            }
            promedio /= calificaciones.length;
            System.out.printf("Materia %d: %.2f\n", i + 1, promedio);
        }
    }

    public static void promedioGeneral(int[][] calificaciones) {
        double promedio = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                promedio += calificaciones[i][j];
            }
        }
        promedio /= (calificaciones.length * calificaciones[0].length);
        System.out.printf("Promedio general: %.2f\n", promedio);
    }

    public static void cantidadAplazos(int[][] calificaciones) {
        int cantidad = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            for (int j = 0; j < calificaciones[i].length; j++) {
                if (calificaciones[i][j] < 4) {
                    cantidad++;
                    break;
                }
            }
        }
        System.out.printf("Cantidad de alumnos con al menos un aplazo: %d\n", cantidad);
    }
}
