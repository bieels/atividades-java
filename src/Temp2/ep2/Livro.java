package Temp2.ep2;

public class Livro {
    private String nome;
    private String autor;

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(autor);
    }
}
