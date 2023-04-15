package exercicio01;

public class Vendedor extends Funcionario{

    private Double comissao;

    public Vendedor() {
    }

    public Vendedor(String nome, String matricula, Double salarioBase, Double comissao) {
        super(nome, matricula, salarioBase);
        this.comissao = comissao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    @Override
    public Double calculaSalario() {
        return getSalarioBase()+this.comissao;
    }

}
