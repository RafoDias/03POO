package Exercicios.Lista_5;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.depositar(100);
        System.out.println(cc.calculaTributos());

        //polimorfismo
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
    }
}
