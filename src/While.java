import java.util.Scanner;

public class While {
    public static void main(String[] args) {
            Scanner leitura = new Scanner(System.in);
            double media = 0;
            double nota = 0;
            int totalNotas = 0;

            while (nota != -1) {
                System.out.println("Qual sua avaliação?");
                nota = leitura.nextDouble();

            }

            System.out.println("Média de  avaliações " + media/totalNotas);
        }

    }

