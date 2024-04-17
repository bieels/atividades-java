package Temp3.ep2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var leite = new Produto("Leite", 5.80, 22);
        var nescau = new Produto("Nescau", 4.99, 10);
        var agua = new Produto("agua", 2, 50);
        var banana = new ProdutoPerecivel("Banana", 10.99,50, "10/06");

        ArrayList<Produto> listaprodutos = new ArrayList<>();
        listaprodutos.add(leite);
        listaprodutos.add(nescau);
        listaprodutos.add(agua);
        listaprodutos.add(banana);
        System.out.println(listaprodutos);

    }
}
