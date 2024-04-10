package Temp2.ep4;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda moeda = new ConversorMoeda();
        moeda.dolar = 5;

        moeda.Converter();

        CalcularArea area = new CalcularArea();
        area.setComprimento(50);
        area.setAltura(10);
        area.calcularArea();

        TabuadaMultiplicacao numero1 = new TabuadaMultiplicacao();
        numero1.setNumero(5);
        numero1.mostrarTabuada();


        Temperatura temp = new Temperatura();
        temp.setCelsius(40);
        double fahrenheit = temp.CelsiusParaFahrenheit();
        System.out.println(fahrenheit + " graus Fahrenheit.");

        temp.setFahrenheit(80);
        double celsius = temp.FahrenheitParaCelsius();
        System.out.println(celsius + " graus Celsius.");

        ProdutoFisico produto1 = new ProdutoFisico();
        produto1.setPreco(50);
        produto1.setAcrescimo(10);
        produto1.calcularPrecoFinal();

        Livro livro1 = new Livro();
        livro1.setPreco(100);
        livro1.setDesconto(30);
        livro1.calcularPrecoFinal();
    }
}
