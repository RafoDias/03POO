package Exercicios.Lista_5;

public class TesteGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.tributaveis[0] = new ContaCorrente();
        c1.tributaveis[1] = new ContaCorrente();
        c1.tributaveis[2] = new SeguroDeVida();

        GerenciadorImpostoRenda gerenciador = new GerenciadorImpostoRenda();

        System.out.println(c1.tributaveis.length);

        gerenciador.adiciona(c1.tributaveis);
        System.out.println(gerenciador.getTotal());
    }
}
