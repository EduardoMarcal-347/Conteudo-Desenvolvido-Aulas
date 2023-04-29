package exercicio03;

public class Main {
    public static void main(String[] args) {
        Fila<Integer> filaNumeros = new Fila<Integer>();

        filaNumeros.enfileirarT(1);
        filaNumeros.enfileirarT(2);
        filaNumeros.enfileirarT(3);
        filaNumeros.enfileirarT(4);

        System.out.println(filaNumeros.tamanho());
        System.out.println(filaNumeros.desenfilerar());
        System.out.println(filaNumeros.desenfilerar());
        System.out.println(filaNumeros.desenfilerar());
        System.out.println(filaNumeros.desenfilerar());



    }
}