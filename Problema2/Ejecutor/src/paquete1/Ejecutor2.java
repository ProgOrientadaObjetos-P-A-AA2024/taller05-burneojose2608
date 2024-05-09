/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete1.Automotor;

/**
 *
 * @author USUARIO
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    String cadenaFinal = "";
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la cédula del dueño:");
            String cedula = scanner.nextLine();

            System.out.println("Ingrese la marca del vehículo:");
            String marca = scanner.nextLine();

            System.out.println("Ingrese el año de fabricación:");
            int año = scanner.nextInt();

            System.out.println("Ingrese el valor del vehículo:");
            double valor = scanner.nextDouble();

            scanner.nextLine(); // Consumir el salto de línea
            Automotor automotor2 = new Automotor( 1105169730, marca, año, valor);
            automotor2.establecervalorMatricula();
             cadenaFinal = String.format(" La cedula del "
                    + "dueño es: %d \n La marca del vehiculo es :%s \n El año de "
                    + "fabricacion es : %.d\n El valor del vehiculo es %.2f\n El valor"
                    + "de la matricula es %.2f\n", automotor2.obtenercedula(),
                     automotor2.obtenerMarca(), automotor2.obtenerAño(),
                    automotor2.obtenervalorVehiculo(), automotor2.obtenervalorMatricula());
            
            System.out.println("¿Desea ingresar otro automotor? (Sí/No)");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("No")) {
                continuar = false;
            }
        }
    System.out.printf("%s\n", cadenaFinal);
    }

}
