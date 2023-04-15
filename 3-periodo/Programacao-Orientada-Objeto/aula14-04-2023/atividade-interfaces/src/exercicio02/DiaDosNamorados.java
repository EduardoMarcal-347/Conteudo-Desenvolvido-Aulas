package exercicio02;

public class DiaDosNamorados extends CartaoWeb{

    public DiaDosNamorados() {
    }

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos namorados "+ getDestinatario());
    }
}
