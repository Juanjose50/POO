package Talleres.Taller01.Ejercicio5;
public class termometro {
    private double temperature;

    public termometro(double initialTemperature) {
        if (isValidTemperature(initialTemperature)) {
            this.temperature = initialTemperature;
        } else {
            this.temperature = 0.0; 
        }
    }

    private boolean isValidTemperature(double temp) {
        return temp >= -50.0 && temp <= 100.0;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public boolean setTemperature(double newTemperature) {
        if (isValidTemperature(newTemperature)) {
            this.temperature = newTemperature;
            return true;
        }
        return false;
    }
}