package exercicio2;

public class Main {
    public static void main(String[] args) {

        Conjunto<String> frutas = new Conjunto<String>();
        frutas.adicionarT("Melancia");
        frutas.adicionarT("Laranja");
        frutas.adicionarT("Morango");
        frutas.removerT("Laranja");
        System.out.println(frutas.contem("Laranja"));
        System.out.println(frutas.contem("Morango"));

    }
}