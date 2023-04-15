package exercicio05;


public class Main {
    public static void main(String[] args) {
        Retangulo a = new Retangulo(2.0,3.0);
        Retangulo b = new Retangulo(3.0,3.0);
        eMaior(a,b);
    }

    public static void eMaior(Object a, Object b) {
        Retangulo retanguloA = (Retangulo) a;
        Retangulo retanguloB = (Retangulo) b;
        if(retanguloA.calcularArea() > retanguloB.calcularArea()) System.out.println(retanguloA.toString());
        else if(retanguloA.calcularArea() < retanguloB.calcularArea()) System.out.println(retanguloB.toString());
        else System.out.println("A area dos retangulos são iguais");
    }
}