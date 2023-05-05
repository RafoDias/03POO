package Exercicios.Lista_4;

public class Corretora {
    public static void main(String[] args) {
        Imovel[] imoveis = new Imovel[5];
        for (int i = 0; i < 5; i++) {
            imoveis[i] = new Imovel();
            String s = String.format("Rua General Canabarro, %d", (i+1)*5);
            imoveis[i].setEndereco(s);
            imoveis[i].setPreco((i+1)*100000);
        }    

        double soma = 0;
        for(int i = 0; i < imoveis.length; i++) {
            soma = soma + imoveis[i].getPreco();
        }
        System.out.println(soma);
    }
}
