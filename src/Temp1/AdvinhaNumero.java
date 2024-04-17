package Temp1;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        while (true) {
            System.out.println("Qual sua resposta?");
            int meta = new Random().nextInt(100);
            int resposta = leitura.nextInt();
            if (resposta == meta) {
                System.out.println("Vc acertou!");
                break;
            }

        }

    }


}
