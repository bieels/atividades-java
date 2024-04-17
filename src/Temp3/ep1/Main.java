package Temp3.ep1;

import Temp3.ep1.Pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var pessoa1 = new Pessoa();
        pessoa1.setNome("Davi");
        pessoa1.setIdade(19);

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Gabriel");
        pessoa2.setIdade(25);

        var pessoa3 = new Pessoa();
        pessoa3.setNome("Laura");
        pessoa3.setIdade(30);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);
        System.out.println(listaPessoas);
        System.out.println(listaPessoas.get(0));
    }
}
