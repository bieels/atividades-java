package Temp2.ep3;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public ContaCorrente(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public void cobrarTarifaMensal() {
        double saldoAtual = getSaldo();
        double novoSaldo = saldoAtual - tarifaMensal;
        setSaldo(novoSaldo);
        System.out.println("Tarifa mensal de R$ " + tarifaMensal + " cobrada com sucesso.");
    }
}
