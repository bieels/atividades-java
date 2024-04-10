package Temp2.ep4;

public class ConversorMoeda implements ConversaoFinanceira {
    double dolar;
    private double real;

    @Override
    public void Converter() {
        double taxaCambio = 5;
        this.real = this.dolar * taxaCambio;
        System.out.println(this.dolar + " dólares equivalem a " + this.real + " reais.");
    }
}
