package Temp2.ep4;

public class ProdutoFisico implements Calculavel {
    private double preco;
    private double acrescimo;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = preco + (preco * acrescimo / 100);
        System.out.println(precoFinal);
        return precoFinal;
    };
}
