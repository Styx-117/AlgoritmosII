package S2;
import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int alumnos = dato.nextInt();

        double[] calificaciones = new double[alumnos];

        int opcion;
        do {
            System.out.print("""
                    --- Gestion de Calificaciones ---
                    1- Agregar calificaciones
                    2- Actualizar calificacion
                    3- Eliminar calificacion
                    4- Mostrar calificaciones
                    5- Calcular estadisticas (Promedio, minimo y maximo)
                    6- Salir
                    
                    Elija su opcion: """);
            opcion = dato.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < alumnos; i++) {
                        do {
                            System.out.println("Ingrese la calificacion para el alumno " + (i + 1) + ": ");
                            calificaciones[i] = dato.nextDouble();
                        } while (calificaciones[i] <= 0 || calificaciones[i] >20 );
                    }
                    System.out.println("Calificaciones guardadas!");
                    break;
                case 2:
                    System.out.print("Seleccione el numero del alumno: ");
                    int alumno = dato.nextInt() - 1;

                    System.out.println("Nota a reemplazar: " + calificaciones[alumno]);

                    do {
                        System.out.println("Nueva nota: ");
                        calificaciones[alumno] = dato.nextDouble();
                    } while (calificaciones[alumno] <= 0 || calificaciones[alumno] >20);
                    break;
                case 3:
                    System.out.print("Seleccione el numero del alumno a eliminar la nota: ");
                    int eliminar;
                    do {
                        eliminar = dato.nextInt() - 1;
                    }while (eliminar > calificaciones.length);

                    calificaciones[eliminar] = 0;
                    System.out.println("Nota eliminada!");
                    break;

                case 4:
                    for (int i = 0; i < alumnos; i++) {
                        System.out.println("Nota del alumnno " + (i + 1) + ": " + calificaciones[i]);
                    }
                    System.out.println("Fin de las notas.");
                    break;

                case 5:
                    System.out.println("--- Estadisticas ---");

                    //Promedio
                    double promedio = 0;
                    for (int i = 0; i < alumnos; i++) {
                        promedio = promedio + calificaciones[i];
                    }
                    System.out.println("Promedio general del aula: " + (promedio / calificaciones.length));

                    //Calificacion Maxima
                    double maxima = calificaciones[0];
                    for (int i = 0; i < alumnos; i++) {
                        if (calificaciones[i] > maxima) {
                            maxima = calificaciones[i];
                        }
                    }
                    System.out.println("Calificacion Maxima: " + maxima);

                    //Calificacion minima
                    double minima = calificaciones[0];
                    for (int i = 0; i < alumnos; i++) {
                        if (calificaciones[i] < minima) {
                            minima = calificaciones[i];
                        }
                    }
                    System.out.println("Calificacion Minima: " + minima);
                    System.out.println("--- Fin de las estadisticas. ---");
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }
        } while (opcion != 6);
    }
}
