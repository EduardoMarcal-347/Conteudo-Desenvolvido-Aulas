package exercicio01;

public class Gerente extends Funcionario{

    public Gerente() {
    }

    public Gerente(String nome, String matricula, Double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    @Override
    public Double calculaSalario() {
        return getSalarioBase()*2;
    }
}
