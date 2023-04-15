package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        Assistente assistente = new Assistente("assistente","1a",1350.0);
        Gerente gerente = new Gerente("gerente", "1b", 5000.0);
        Vendedor vendedor = new Vendedor("vendedor", "1c",3000.0,4000.0);
        listaFuncionarios.add(assistente);
        listaFuncionarios.add(gerente);
        listaFuncionarios.add(vendedor);
        System.out.printf("Folha salarial: R$ %.2f", folhaSalarial(listaFuncionarios));
    }

    public static double folhaSalarial(List<Funcionario> listaFuncionarios){
        Double valorFolha = 0.0;
        for (Funcionario funcionario : listaFuncionarios){
            valorFolha += funcionario.calculaSalario();
        }
        return valorFolha;
    }

}