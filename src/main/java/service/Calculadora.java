package service;

public class Calculadora {
    public static void usarCalculadora() {
        Operaciones x = new Operaciones();
        double a = 10;
        double b = 2;

        System.out.println("Suma: " + x.suma(a, b));
        System.out.println("Resta: " + x.resta(a, b));
        System.out.println("Multiplicación: " + x.multiplicacion(a, b));
        System.out.println("División: " + x.division(a, b));
    }
}