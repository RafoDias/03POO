package Exercicios.Lista_3;

public class ContaBancaria {
    private double saldo = 0.0;
    private Data dataAbertura;

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDataAberturaFormatada() {
        String s = String.format("%d/%d/%d", dataAbertura.getDia(), 
            dataAbertura.getMes(), dataAbertura.getAno());
        return s;
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
        if (saque > saldo) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        setSaldo(saldo - saque);
        System.out.print("Saque concluído. Saldo atual: ");
        System.out.println(getSaldoFormatado());
        return;
    }
}
