package Temp2.ep2;

public class Aluno {
    private String nome;

    private double somaDasNotas;
    private int totalDasNotas;
    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    void avalia(double nota) {
        somaDasNotas += nota;
        totalDasNotas++;
    }

    double pegaMedia() {
        return somaDasNotas / totalDasNotas;
    }
}
