package Exercicios.Lista_1;

public class TesteCasa {
    public static void main(String[] args) {
        Casa[] casas = new Casa[2];
        for (int i = 0; i < casas.length; i++) {
            casas[i] = new Casa();
        }
        
        casas[0].numero = 241;
        casas[1].numero = 435;
        casas[0].cor = "Azul";
        casas[1].cor = "Vermelha";

        for (int i = 0; i < casas.length; i++) {
            String s = String.format("A casa de número %d tem cor %s", casas[i].numero, casas[i].cor);
            System.out.println(s);
        }
    }
}