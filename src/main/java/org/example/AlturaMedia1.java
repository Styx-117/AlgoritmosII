package org.example;
import java.util.Scanner;

public class AlturaMedia1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        // Validar que N sea positivo
        do {
            System.out.print("Ingrese la cantidad de personas: ");
            N = sc.nextInt();
        } while (N <= 0);


        double[] alturas = new double[N];
        double suma = 0;

        // Leer alturas
        for (int i = 0; i < N; i++) {
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
            suma += alturas[i];
        }

        // Calcular media
        double media = suma / N;

        int superiores = 0;
        int inferiores = 0;

        // Contar alturas
        for (int i = 0; i < N; i++) {
            if (alturas[i] > media) {
                superiores++;
            } else if (alturas[i] < media) {
                inferiores++;
            }
        }

        // Mostrar resultados
        System.out.printf("Altura media: %.2f m%n", media);
        System.out.println("Personas con altura superior a la media: " + superiores);
        System.out.println("Personas con altura inferior a la media: " + inferiores);

        sc.close();
    }
}