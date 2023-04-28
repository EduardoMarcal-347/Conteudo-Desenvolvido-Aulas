package exercicio1;

public class Main {
    public static void main(String[] args) {
        PilhaLimitada<Integer> pilhaNumeros = new PilhaLimitada<Integer>();
        pilhaNumeros.empilhar(1);
        pilhaNumeros.empilhar(2);
        pilhaNumeros.empilhar(3);
        System.out.println(pilhaNumeros.desempilhar());
        System.out.println(pilhaNumeros.desempilhar());
        System.out.println(pilhaNumeros.desempilhar());
        System.out.println(pilhaNumeros.estaVazia());
    }
}