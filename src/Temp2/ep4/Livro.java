package Temp2.ep4;

public class Livro implements Calculavel {
    private double preco;
    private double desconto;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = preco - (preco * desconto / 100);
        System.out.println(precoFinal);
        return precoFinal;
    }
}
