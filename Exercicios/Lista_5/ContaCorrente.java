package Exercicios.Lista_5;

public class ContaCorrente extends ContaBancaria implements Tributavel {
    public double calculaTributos() {
        double tsaldo = this.getSaldo() * 0.01;
        return tsaldo;
    }
}