package Temp2;

import java.io.StringReader;
import java.util.Calendar;

public class Carro {
    String marca;
    String modelo;
    String cor;
    int anoDeLancado;

    void exibeFichaTecnicaCarro() {
        System.out.println("Nome da marca: " + marca);
        System.out.println("Nome do modelo: " + modelo);
        System.out.println("Ano de lançamento: " + anoDeLancado);
    }

    void calculaAno() {
        Calendar calendario = Calendar.getInstance();
        int anoAtual = calendario.get(Calendar.YEAR);
        System.out.println( "Esse carro tem: " + (anoAtual - anoDeLancado) + "anos");
    }

}
