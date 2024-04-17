package Temp3.ep3;

public class Circulo implements Forma{
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public String toString() {
        return "Círculo: Área = " + calcularArea();
    }
}
