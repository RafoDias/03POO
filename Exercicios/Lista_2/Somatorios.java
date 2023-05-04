package Exercicios.Lista_2;

public class Somatorios {
    
    public static int SomatorioPrimos(int maxNum)
    {
        int soma = 0;
        for (int i = 1; i < maxNum; i++) {
            boolean isPrime = true;
            for (int j = 1 + 1; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) soma += i;
        }
        return soma;
    }

    public static int SomatorioImpares(int maxNum)
    {
        int soma = 0;
        for (int i = 1; i <= maxNum; i++) {
            if (i % 2 == 1) {
                soma += i;
            }
        }
        return soma;
    }

    public static int SomatorioExcetoIntervalo(int maxNum, int inicioIntervalo, int fimIntervalo)
    {
        int soma = 0;
        for (int i = 1; i <= maxNum; i++) {
            if (i > inicioIntervalo && i < fimIntervalo) i = fimIntervalo;
            soma += i;
        }
        return soma;
    }
}
