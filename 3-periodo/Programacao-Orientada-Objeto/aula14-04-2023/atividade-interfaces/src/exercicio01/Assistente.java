package exercicio01;

public class Assistente extends Funcionario{

    public Assistente() {
    }

    public Assistente(String nome, String matricula, Double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public Double calculaSalario() {
        return getSalarioBase();
    }
}
