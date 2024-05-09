/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete1.Estudiante;

/**
 *
 * @author USUARIO
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("1.Ingrese estudiante con dos calificaciones");
            System.out.println("2.Ingrese estudiante con tres calificaciones");
            System.out.println("3.Salir");
            System.out.print("Ingrese una opción: \n ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    scanner.nextLine();
                    String nombre1 = scanner.nextLine();
                    System.out.print("Ingrese la calificación 1: ");
                    double calificacion1 = scanner.nextDouble();
                    System.out.print("Ingrese la calificación 2: ");
                    double calificacion2 = scanner.nextDouble();
                    Estudiante estudiante1 = new Estudiante(nombre1,
                            calificacion1, calificacion2);
                    estudiante1.establecerPromedio();
                    
                      System.out.printf("El nombre del estudiante es %s\n "
                + "La primera calificacion es %.2f\n La segunda calificacion es"
                + "%.2f\n  La tercera calificacion es %.2f\n El promedio es %.2f\n "
                + "",estudiante1.obtenerNombre(),estudiante1.obtenerCalificacion1()
                              ,estudiante1.obtenerCalificacion2(),
                              estudiante1.obtenerCalificacion3(),
                              estudiante1.obtenerPromedio());
                
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del estudiante: ");
                    scanner.nextLine();
                    String nombre2 = scanner.nextLine();
                    System.out.print("Ingrese la calificación 1: ");
                    double calificacion3 = scanner.nextDouble();
                    System.out.print("Ingrese la calificación 2: ");
                    double calificacion4 = scanner.nextDouble();
                    System.out.print("Ingrese la calificación 3: ");
                    double calificacion5 = scanner.nextDouble();
                    Estudiante estudiante2 = new Estudiante(nombre2,
                            calificacion3, calificacion4, calificacion5);
                    estudiante2.establecerPromedio();
                     
                    System.out.printf("El nombre del estudiante es %s\n "
                + "La primera calificacion es %.2f\n La segunda calificacion es"
                + "%.2f\n  La tercera calificacion es %.2f\n El promedio es %.2f\n "
                + "",estudiante2.obtenerNombre(),estudiante2.obtenerCalificacion1()
                              ,estudiante2.obtenerCalificacion2(),
                              estudiante2.obtenerCalificacion3(),
                              estudiante2.obtenerPromedio());

                    break;
                case 3:
                    System.out.println("Salir del programa");
                    break;
            }
        } while (opcion != 3);
      
    }

}
