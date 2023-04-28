package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Conjunto <T> {

    List<T> list = new ArrayList<T>();

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
