package Exercicios.Lista_3;

public class Teste{
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        Data dataAbertura1 = new Data();
        dataAbertura1.setDia(04);
        dataAbertura1.setMes(05);
        dataAbertura1.setAno(2023);
        conta1.setDataAbertura(dataAbertura1);

        conta1.depositar(500);
        conta1.sacar(500);
        conta1.depositar(1000);
        conta1.sacar(1200);
        conta1.depositar(400);
        conta1.sacar(1000);
        System.out.println(conta1.getDataAberturaFormatada());
        System.out.println(conta1.getSaldoFormatado());
        
        
    }
}
