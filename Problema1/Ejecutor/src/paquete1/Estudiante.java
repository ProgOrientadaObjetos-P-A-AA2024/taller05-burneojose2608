/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author USUARIO
 */
public class Estudiante {

    private String nombre;
    private double calificacion1;
    private double calificacion2;
    private double calificacion3;
    private double promedio;

    public Estudiante(String x, double c, double d) {
         nombre = x;
        calificacion1 = c;
        calificacion2 = d;
        calificacion3 = (calificacion1 + calificacion2) / 2;
    }
    public Estudiante(String x, double c, double b, double d) {
         nombre = x;
        calificacion1 = c;
        calificacion2 = b;
        calificacion3 = d;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerCalificacion1(double x) {
        calificacion1 = x;
    }

    public void establecerCalififcacion2(double x) {
        calificacion2 = x;
    }

    public void establecerCalificacion3(double x) {
        calificacion3 = x;
    }

    public void establecerPromedio() {
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerCalificacion1() {
        return calificacion1;
    }

    public double obtenerCalificacion2() {
        return calificacion2;
    }

    public double obtenerCalificacion3() {
        return calificacion3;
    }

    public double obtenerPromedio() {
        return promedio;
    }
   
    @Override
  public String toString() {
        String cadena = String.format("El nombre del estudiante es %s\n "
                + "La primera calificacion es %.2f\n La segunda calificacion es"
                + "%.2f\n  La tercera calificacion es %.2f\n El promedio es %.2f\n "
                + "",obtenerNombre(),obtenerCalificacion1()
                              ,obtenerCalificacion2(),
                              obtenerCalificacion3(),
                              obtenerPromedio());
        return cadena;
  }
}
