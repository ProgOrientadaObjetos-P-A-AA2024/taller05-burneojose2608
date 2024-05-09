/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;
import paquete1.Automotor;

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

        System.out.print("Ingrese el número veces que quiere igresar: ");
        int veces = scanner.nextInt();
        scanner.nextLine();

        String cadenaFinal = "";

        for (int i = 1; i <= veces; i++) {
            System.out.println("Ingrese la cédula del dueño:");
            int cedula = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese la marca del vehículo:");
            String marca = scanner.nextLine();

            System.out.println("Ingrese el año de fabricación:");
            int año = scanner.nextInt();

            System.out.println("Ingrese el valor del vehículo:");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            Automotor automotor = new Automotor(cedula, marca, año, valor);
            automotor.establecervalorMatricula();

            cadenaFinal = String.format(" La cedula del "
                    + "dueño es: %d \n La marca del vehiculo es :%s \n El año de "
                    + "fabricacion es : %.d\n El valor del vehiculo es %.2f\n El valor"
                    + "de la matricula es %.2f\n", automotor.obtenercedula(),
                     automotor.obtenerMarca(), automotor.obtenerAño(),
                    automotor.obtenervalorVehiculo(), automotor.obtenervalorMatricula());
        }

        System.out.printf("%s\n", cadenaFinal);
    }

}
