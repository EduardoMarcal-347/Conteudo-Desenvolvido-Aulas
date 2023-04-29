package exercicio05;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ConjuntoOrdenado<String> alunos = new ConjuntoOrdenado<>();

        alunos.adicionar("aluno1");
        alunos.adicionar("aluno3");
        alunos.adicionar("aluno5");
        alunos.adicionar("aluno2");
        alunos.adicionar("aluno4");

        for (String aluno : alunos.getConjunto()) {
            System.out.println(aluno);
        }

        alunos.remover("aluno5");

        for (String aluno : alunos.getConjunto()) {
            System.out.println(aluno);
        }

    }
}