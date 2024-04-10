import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número.");
        int numero = leitura.nextInt();
        int resposta =  calcularFatorial(numero);
        System.out.println("Sua resposta é " + resposta);

    }
 public static int calcularFatorial(int numero) {
        if (numero < 0) {
            System.out.println("Escolhe outro numero, caralho");
            return -1;
        } else if (numero == 0) {
            return 1;
        } else {
            return (numero * calcularFatorial(numero - 1));

        }
 }
}
