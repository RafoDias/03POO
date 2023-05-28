package Exercicios.Lista_5;

public class ContaBancaria {
    private int numero;
    private double saldo = 0.0f;
    private double limite = 0.0f;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getSaldoFormatado() {
        String s = String.format("R$ %.2f", saldo);
        return s;
    }

    public void depositar(double deposito) {
        setSaldo(saldo + deposito);
        System.out.print("Depósito concluído. Saldo atual: ");
        System.out.println(getSaldoFormatado());
    }

    public void sacar(double saque) {
        if (saldo - saque < limite) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        setSaldo(saldo - saque);
        System.out.print("Saque concluído. Saldo atual: ");
        System.out.println(getSaldoFormatado());
        return;
    }
}
