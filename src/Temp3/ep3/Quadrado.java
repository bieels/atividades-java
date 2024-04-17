package Temp3.ep3;

public class Quadrado implements Forma{
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea() {

        return lado * lado;
    }

    @Override
    public String toString() {
        return "Quadrado: Área = " + calcularArea();
    }
}
