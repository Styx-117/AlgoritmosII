package org.example;

import java.util.Scanner;

public class VentasEmpleados3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        // Pedir cantidad de empleados
        do {
            System.out.print("Ingrese el número de empleados: ");
            N = sc.nextInt();
        } while (N <= 0);

        double[] ventas = new double[N];

        // Leer las ventas de cada empleado
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese las ventas del empleado " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
        }

        // Leer el objetivo
        System.out.print("Ingrese el objetivo de ventas: ");
        double objetivo = sc.nextDouble();

        // Contar empleados que superaron el objetivo
        int superaron = 0;

        for (int i = 0; i < N; i++) {
            if (ventas[i] > objetivo) {
                superaron++;
            }
        }

        // Mostrar resultado
        System.out.println("Número de empleados que superaron el objetivo: " + superaron);

        sc.close();
    }
}
