package org.example.S1;
import java.util.Scanner;

public class Calificaciones2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        // Pedir N y validar que sea positivo
        do {
            System.out.print("Ingrese el número de alumnos: ");
            N = sc.nextInt();
        } while (N <= 0);

        double[][] calificaciones = new double[N][3];
        double[] promedios = new double[N];

        double sumaGeneral = 0;

        // Leer las 3 calificaciones de cada alumno
        for (int i = 0; i < N; i++) {
            double sumaAlumno = 0;

            System.out.println("\nAlumno " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la calificación del examen "
                        + (j + 1) + ": ");

                calificaciones[i][j] = sc.nextDouble();
                sumaAlumno += calificaciones[i][j];
            }

            // Promedio del alumno
            promedios[i] = sumaAlumno / 3;

            // Acumular para el promedio general
            sumaGeneral += sumaAlumno;
        }

        // Calcular promedio general del grupo
        double promedioGeneral = sumaGeneral / (N * 3);

        // Buscar el alumno con mayor promedio
        int alumnoMayor = 0;

        for (int i = 1; i < N; i++) {
            if (promedios[i] > promedios[alumnoMayor]) {
                alumnoMayor = i;
            }
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");

        for (int i = 0; i < N; i++) {
            System.out.printf(
                    "Promedio del alumno %d: %.2f%n",
                    i + 1,
                    promedios[i]
            );
        }

        System.out.printf(
                "Promedio general del grupo: %.2f%n",
                promedioGeneral
        );

        System.out.printf(
                "El alumno con mayor promedio es el alumno %d, con %.2f%n",
                alumnoMayor + 1,
                promedios[alumnoMayor]
        );

        sc.close();
    }
}
