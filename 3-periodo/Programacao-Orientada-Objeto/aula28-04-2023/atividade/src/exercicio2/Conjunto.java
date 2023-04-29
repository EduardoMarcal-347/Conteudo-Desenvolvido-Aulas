package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Conjunto <T> {

    private List<T> list = new ArrayList<T>();

    public Conjunto() {
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public void adicionarT (T element) {
        list.add(element);
    }

    public void removerT (T element) {
        list.remove(element);
    }

    public Boolean contem (T element) {
        return list.contains(element);
    }

}
