package Temp2.ep2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int verificaIdade() {
        if (idade < 18){
            System.out.println("Vc é menor de idade");
        } else {
            System.out.println("Vai trabalhar, porrinha");
        }
        return idade;
    }
}
