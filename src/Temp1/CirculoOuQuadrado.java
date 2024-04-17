package Temp1;

import java.util.Scanner;

public class CirculoOuQuadrado {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao1 = 1;
        int opcao2 = 2;
        double pi = Math.PI;
        System.out.println("Digite 1 para calcular o quadrado, ou 2 para calcular o circulo.");
        int resposta = leitura.nextInt();


        if (resposta == opcao1) {
            System.out.println("Digite o valor para fazer o calculo do quadrado.");
            int numeroCalculo = leitura.nextInt();
            int respostaCalculo = (int) Math.pow(numeroCalculo, 2);
            System.out.println("Sua resposta é " + respostaCalculo);
        } else if (resposta == opcao2) {
            System.out.println("Digite o valor para fazer o calculo do Circulo.");
            int raio = leitura.nextInt();
            double respostaCalculo = pi * (Math.pow(raio, 2));
            System.out.println("Sua resposta é " + respostaCalculo);
        } else {
            System.out.println("Digite uma opção válida!");
        }
    }
}
