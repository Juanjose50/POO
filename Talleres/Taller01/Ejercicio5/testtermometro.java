package Talleres.Taller01.Ejercicio5;
public class testtermometro {
    public static void main(String[] args) {
        termometro thermometer = new termometro(20.0);
        System.out.println("Temperatura inicial: " + thermometer.getTemperature() + " C");

        boolean success = thermometer.setTemperature(35.5);
        System.out.println("Asignar 35.5 C: " + (success ? "ACEPTADO" : "RECHAZADO") 
                           + " | Actual: " + thermometer.getTemperature() + " C");

        success = thermometer.setTemperature(120.0);
        System.out.println("Asignar 120.0 C: " + (success ? "ACEPTADO" : "RECHAZADO") 
                           + " | Actual: " + thermometer.getTemperature() + " C");

        success = thermometer.setTemperature(-60.0);
        System.out.println("Asignar -60.0 C: " + (success ? "ACEPTADO" : "RECHAZADO") 
                           + " | Actual: " + thermometer.getTemperature() + " C");
    }
}