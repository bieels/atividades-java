package Temp3.ep3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList lista = new ArrayList();
//        lista.add("Carne");
//        lista.add("Batata");
//        lista.add("Queijo");
//        lista.add("Refrigerante");
//        lista.forEach(System.out::println);
//
//        var carne = new Produto("Carne", 20.99);
//        var batata = new Produto("Batata", 2.50);
//        var arroz = new Produto("Arroz", 5.99);
//        var feijao = new Produto("Feijão", 7.50);
//        var macarrao = new Produto("Macarrão", 3.99);
//
//        ArrayList<Produto> produtos = new ArrayList<>();
//        produtos.add(carne);
//        produtos.add(batata);
//        produtos.add(arroz);
//        produtos.add(feijao);
//        produtos.add(macarrao);
//
//        double somaPrecos = 0;
//        for (Produto produto : produtos) {
//            somaPrecos += produto.getPreco();
//        }
//
//        double precoMedio = somaPrecos / produtos.size();
//        System.out.printf("O preço médio dos produtos é: %.2f%n", precoMedio);

//        Forma quadrado = new Quadrado(5.0);
//        Forma circulo = new Circulo(3.0);
//
//        ArrayList<Forma> formas = new ArrayList<>();
//        formas.add(quadrado);
//        formas.add(circulo);
//
//
//        for (Forma forma : formas) {
//            System.out.println(forma);
//        }

        var conta1 = new ContaBancaria(10, 500.30);
        var conta2 = new ContaBancaria(20, 1000.50);
        var conta3 = new ContaBancaria(30, 300.75);
        var conta4 = new ContaBancaria(40, 2000.20);
        var conta5 = new ContaBancaria(50, 150.00);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);
        contas.add(conta5);

        ContaBancaria maiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = conta;
            }
        }

        System.out.println("A conta com o maior saldo é a conta " + maiorSaldo.getNumeroDaConta() + " com saldo de R$" + maiorSaldo.getSaldo());


    }
}




