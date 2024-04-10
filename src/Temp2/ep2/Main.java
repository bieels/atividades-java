package Temp2.ep2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
//  ContaBancaria conta1 = new ContaBancaria();
//  conta1.titular = "Gabriel";
//  conta1.setNumeroConta(435);
//  conta1.setSaldo(2000);
//
//      System.out.println(conta1.getNumeroConta());
//        System.out.println(conta1.getSaldo());
//
//
//        IdadePessoa idade1 = new IdadePessoa();
//        idade1.setNome("Gabriel");
//        idade1.setIdade(23);
//        System.out.println(idade1.verificaIdade());

//      Produto produto1 = new Produto();
//      produto1.setNome("Papaya");
//      produto1.setPreco(100.0);
//      produto1.aplicarDesconto(10);


//      System.out.println(produto1.getNome());
//      System.out.println(produto1.getPreco());

      Aluno aluno1 = new Aluno();
      aluno1.setNome("Joao");
      double nota = 0;
        while (true) {
            System.out.println("Qual nota?");
            nota = leitura.nextDouble();
            if (nota == -1) {
                break;
            }
            aluno1.avalia(nota);
        }

        System.out.println(aluno1.pegaMedia());

        Livro livro1 = new Livro();
        livro1.setNome("A volta dos que nao foram");
        livro1.setAutor("Jubileu");

        livro1.exibeFichaTecnica();


    }
}
