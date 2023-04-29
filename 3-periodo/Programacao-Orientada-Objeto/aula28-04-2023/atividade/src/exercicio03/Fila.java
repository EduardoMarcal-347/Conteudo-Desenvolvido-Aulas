package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Fila <T> {

    private List<T> fila = new ArrayList<T>();

    public Fila() {
    }

    public List<T> getFila() {
        return fila;
    }

    public void setFila(List<T> fila) {
        this.fila = fila;
    }

    public void enfileirarT (T element) {
        fila.add(element);
    }

    public T desenfilerar () {
        return fila.remove(0);
    }

    public int tamanho () {
        return fila.size();
    }


}
