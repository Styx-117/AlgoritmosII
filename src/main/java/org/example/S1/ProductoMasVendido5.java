package org.example.S1;

import java.util.Scanner;

public class ProductoMasVendido5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        // Pedir cantidad de productos
        do {
            System.out.print("Ingrese el número de productos: ");
            N = sc.nextInt();
        } while (N <= 0);

        String[] productos = new String[N];
        int[] ventas = new int[N];

        // Leer productos y ventas
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            productos[i] = sc.next();

            do {
                System.out.print("Ingrese la cantidad de ventas: ");
                ventas[i] = sc.nextInt();
            } while (ventas[i] < 0);
        }

        // Buscar el producto con mayor cantidad de ventas
        int posicionMayor = 0;

        for (int i = 1; i < N; i++) {
            if (ventas[i] > ventas[posicionMayor]) {
                posicionMayor = i;
            }
        }

        // Mostrar resultado
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Producto más vendido: " + productos[posicionMayor]);
        System.out.println("Cantidad de ventas: " + ventas[posicionMayor]);

        sc.close();
    }
}
