import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = leitura.nextInt();

        if (numero % 2 == 0)
            System.out.println("Seu número é par");
        else
            System.out.println("Seu número é impar");
    }
}
