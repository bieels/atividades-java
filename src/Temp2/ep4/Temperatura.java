package Temp2.ep4;

public class Temperatura implements ConversorTemperatura {
    private double celsius;
    private double fahrenheit;

    private double resultado;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double CelsiusParaFahrenheit() {
        this.fahrenheit = (this.celsius * 9 / 5) + 32;
        return this.fahrenheit;
    }

    @Override
    public double FahrenheitParaCelsius() {
        this.celsius = (this.fahrenheit - 32) * 5 / 9;
        return this.celsius;
    }
}
