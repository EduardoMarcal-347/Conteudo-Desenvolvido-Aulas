package exercicio04;

import java.util.HashMap;
import java.util.Map;

public class Mapa <K,V> {

    private Map<K, V> mapa = new HashMap<>();

    public Mapa() {
    }

    public Map<K, V> getMapa() {
        return mapa;
    }

    public void setMapa(Map<K, V> mapa) {
        this.mapa = mapa;
    }

    public void adicionar (K key, V value) {
        mapa.put(key, value);
    }

    public void remover (K key) {
        mapa.remove(key);
    }

    public V obter (K key) {
        return mapa.get(key);
    }

}
