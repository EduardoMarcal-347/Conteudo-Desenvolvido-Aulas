package exercicio05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ConjuntoOrdenado <T extends Comparable<T>> {

    List<T> conjunto = new ArrayList<T>();

    public ConjuntoOrdenado() {
    }

    public List<T> getConjunto() {
        return conjunto;
    }

    public void setConjunto(List<T> conjunto) {
        this.conjunto = conjunto;
    }

    public void adicionar (T element) {
        conjunto.add(element);
        Collections.sort(conjunto);
    }

    public void remover (T element) {
        conjunto.remove(element);
    }

    public T obter (int index) {
        return conjunto.get(index);
    }


}
