package exercicio03;

public class Circulo implements FormaGeometrica {

    private Double raio;
    private final Double pi = 3.14159265358979323846;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularPerimetro() {
        return 2*pi*raio;
    }

    @Override
    public Double calcularArea() {
        return pi*Math.pow(raio,2);
    }

}
