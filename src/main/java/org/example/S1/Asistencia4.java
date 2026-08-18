package org.example.S1;
import java.util.Scanner;

public class Asistencia4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        // Pedir cantidad de empleados
        do {
            System.out.print("Ingrese el número de empleados: ");
            N = sc.nextInt();
        } while (N <= 0);

        // Arreglo: N empleados y 7 días
        int[][] asistencia = new int[N][7];

        // Leer asistencia
        for (int i = 0; i < N; i++) {
            System.out.println("\nEmpleado " + (i + 1));

            for (int j = 0; j < 7; j++) {
                do {
                    System.out.print("Día " + (j + 1) + " (1=Asistió, 0=Faltó): ");
                    asistencia[i][j] = sc.nextInt();
                } while (asistencia[i][j] != 0 && asistencia[i][j] != 1);
            }
        }

        // Contar empleados que asistieron todos los días
        int presentesTodos = 0;

        for (int i = 0; i < N; i++) {
            boolean todosLosDias = true;

            for (int j = 0; j < 7; j++) {
                if (asistencia[i][j] == 0) {
                    todosLosDias = false;
                    break;
                }
            }

            if (todosLosDias) {
                presentesTodos++;
            }
        }

        // Mostrar resultado
        System.out.println("\n--- RESULTADO ---");
        System.out.println(
                "Empleados que asistieron todos los días: " + presentesTodos
        );

        sc.close();
    }
}