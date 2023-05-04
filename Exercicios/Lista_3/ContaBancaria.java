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
        String s = String.format("%d/%d/%d", dataAbertura.getDia(), dataAbertura.getMes(), dataAbertura.getAno());
        
    }
}
