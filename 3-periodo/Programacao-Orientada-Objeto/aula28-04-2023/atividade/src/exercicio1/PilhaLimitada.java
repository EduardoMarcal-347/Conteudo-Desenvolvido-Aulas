package exercicio1;

import java.util.ArrayList;
import java.util.List;

public class PilhaLimitada<T> {

    private List<T> list = new ArrayList<T>();

    public PilhaLimitada() {
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

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
