package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> listaFormas = new ArrayList<>();
        listaFormas.add(new Retangulo(3.0,4.0));
        listaFormas.add(new Circulo(5.0));
        for (FormaGeometrica forma : listaFormas){
            System.out.printf("Area: %.2f \n", forma.calcularArea());
            System.out.printf("Perimetro: %.2f \n", forma.calcularPerimetro());
        }
    }
}