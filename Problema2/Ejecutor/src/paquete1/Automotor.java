/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author USUARIO
 */
public class Automotor {

    private int cedula;
    private String marcaVehiculo;
    private int año;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(int x, String c, int d, double m) {
        cedula = x;
        marcaVehiculo = c;
        año = d;
        valorVehiculo = m;
    }
 public Automotor( String m, int v, double z) {
        cedula = 1105169730;
        marcaVehiculo = m;
        año = v;
        valorVehiculo = z;
    }
    public void establecercedula(int x) {
        cedula = x;

    }

    public void establecerMarca(String x) {
        marcaVehiculo = x;

    }

    public void establecerAño(int x) {
        año = x;

    }

    public void establecervalorVehiculo(double x) {
        valorVehiculo = x;

    }

    public void establecervalorMatricula() {
        valorMatricula = año * 0.002;
    }

    public int obtenercedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marcaVehiculo;
    }

    public double obtenerAño() {
        return año;
    }

    public double obtenervalorVehiculo() {
        return valorVehiculo;
    }

    public double obtenervalorMatricula() {
         valorMatricula = año * 0.002;
        return valorMatricula;
        
    }

}
