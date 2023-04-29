package exercicio04;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Mapa<Integer, String> mapa = new Mapa<>();

        mapa.adicionar(1,"Maria");
        mapa.adicionar(2,"Eduardo");
        mapa.adicionar(3,"Jorge");
        mapa.adicionar(4,"Felipe");

        System.out.println(mapa.obter(1));
        mapa.remover(1);

        //não deve retornar nada
        mapa.obter(1);

    }
}