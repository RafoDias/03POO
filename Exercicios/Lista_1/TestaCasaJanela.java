package Exercicios.Lista_1;

public class TestaCasaJanela {
    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.cor = "Marrom";
        janela.material = "Madeira";

        Casa casa = new Casa();
        casa.numero = 153;
        casa.cor = "Amarela";
        casa.janela = janela;

        String output = String.format("A casa de número %d tem cor %s e uma janela de %s de cor %s", 
            casa.numero, casa.cor, casa.janela.material, casa.janela.cor);
        System.out.println(output);
        System.out.println(casa.janela);

    }
}