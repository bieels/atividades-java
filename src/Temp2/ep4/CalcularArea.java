package Temp2.ep4;

public class CalcularArea implements CalculoGeometrico {
    private double comprimento;
    private double altura;
    private double area;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void calcularArea() {
        this.area = this.comprimento * this.altura;
        System.out.println("A área do retângulo é: " + this.area);
    }
}
