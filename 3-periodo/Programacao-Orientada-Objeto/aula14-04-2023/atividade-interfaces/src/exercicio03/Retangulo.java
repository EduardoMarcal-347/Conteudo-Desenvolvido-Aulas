package exercicio03;

public class Retangulo implements FormaGeometrica {

    private Double base, altura;

    public Retangulo() {
    }

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularPerimetro() {
        return (base*2)+(altura*2);
    }

    @Override
    public Double calcularArea() {
        return base*altura;
    }
}
