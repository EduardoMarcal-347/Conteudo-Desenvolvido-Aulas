package exercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CartaoWeb> cartoes = new ArrayList<>();
        Aniversario aniversario = new Aniversario("Eduardo");
        DiaDosNamorados diaNamorados = new DiaDosNamorados("fulana");
        Natal natal = new Natal("Tatiane");
        cartoes.add(aniversario);
        cartoes.add(diaNamorados);
        cartoes.add(natal);
        Iterator<CartaoWeb> iteratorCartoes = cartoes.iterator();
        showCartoes(iteratorCartoes);
    }

    public static void showCartoes(Iterator<CartaoWeb> iterator){
        //polimorfismo acontece na linha 22, onde cada Classe implementa o metodo showMessage() de uma forma diferente
        iterator.next().showMessage();
        if (iterator.hasNext()){
            showCartoes(iterator);
        }
    }

}