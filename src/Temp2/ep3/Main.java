package Temp2.ep3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        ContaCorrente contaCorrente = new ContaCorrente(10.0);
        contaCorrente.setNome("Fulano");
        contaCorrente.setNumeroConta(12345);
        contaCorrente.setSaldo(1000.0);

        while (true) {
            opcoes();
            int resposta = leitura.nextInt();
            switch (resposta) {
                case 1:
                    contaCorrente.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = leitura.nextDouble();
                    contaCorrente.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para sacar: ");
                    double valorSaque = leitura.nextDouble();
                    contaCorrente.sacar(valorSaque);
                    break;
                case 4:
                    contaCorrente.cobrarTarifaMensal();
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar o AluraBank. Volte sempre!");
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }
    }

    public static void opcoes() {
        System.out.printf("""
                    Segue as opções disponíveis:
                    1 - Ver saldo;
                    2 - Depositar Valor;
                    3 - Sacar Valor;
                    4 - Cobrar Tarifa Mensal;
                    5 - Sair;
                    
                    Digite uma opção:                    
                    """);
    }
}
