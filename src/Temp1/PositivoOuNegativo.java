package Temp1;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Diga seu numero");
        int resposta = leitura.nextInt();
        if (resposta < 0)
            System.out.println("Seu número é negativo");
         else
            System.out.println("Seu número é positivo");


    }
}
