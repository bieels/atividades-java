package Temp1;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Diga o número a ser calculado.");
        int numero = leitura.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i * numero);
        }
    }
}
