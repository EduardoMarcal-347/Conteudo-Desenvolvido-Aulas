package exercicio02;

public class Natal extends CartaoWeb {

    public Natal() {
    }

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz natal "+ getDestinatario());
    }
}
