package Temp2;

import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
  Scanner leitura = new Scanner(System.in);

  Pessoa pessoa1 = new Pessoa();
  pessoa1.frase = "Olá mundo!";

  Calculadora calculo1 = new Calculadora();

  pessoa1.fala();
  System.out.println(calculo1.soma(5));

  Musica musica1 = new Musica();
  musica1.nomeDaMusica = "Lady - Hear me Tonight";
  musica1.artista = "Modjo";
  musica1.anoDeLancamento = 2001;
  double nota = 0;
  while (true) {
   System.out.println("Qual nota vc dá pra essa música?");
   nota = leitura.nextDouble();
   if (nota == -1) {
    break;
   }
   musica1.avalia(nota);
  }
  musica1.exibeFichaTecnica();
  System.out.println(musica1.pegaMedia());


  Carro carro1 = new Carro();
  carro1.marca = "Peujeot";
  carro1.modelo = "206";
  carro1.cor = "rosa";
  carro1.anoDeLancado = 1752;

  carro1.exibeFichaTecnicaCarro();
  carro1.calculaAno();



 }

}
