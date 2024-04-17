package Temp1;

import java.util.Scanner;

public class Inteiros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Diga um número");
        int resposta1 = leitura.nextInt();
        System.out.println("Diga outro número");
        int resposta2 = leitura.nextInt();
        if (resposta1 == resposta2)
            System.out.println("Seus números são iguais");
        else
            System.out.println("Seus números são diferentes");


    }
}
