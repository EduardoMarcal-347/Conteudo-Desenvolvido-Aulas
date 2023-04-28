package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class PilhaLimitada<T> {

    List<T> list = new ArrayList<T>();

    public void empilhar(T element) {
        list.add(element);
    }

    public T topo(){
        return list.get(list.size()-1);
    }

    public T desempilhar(){
        return list.remove(list.size()-1);
    }

    public Boolean estaVazia(){
        return list.isEmpty();
    }

    public int tamanho(){
        return list.size();
    }
}
