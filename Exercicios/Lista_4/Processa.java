package Exercicios.Lista_4;

// Não compila porque o método chamado não é estático e estamos chamando
//  como se fosse, no processo principal. Para corrigir, deve-se declarar
//  o método calcula como estático.

// Os exemplos 5 e 6 compilam, mas não acredito que sejam a melhor forma
//   de resolver o erro de compilação.

public class Processa {
    public static void main(String[] args) {
        System.out.println(calcula(2,3));
    }

    public static double calcula(double a, double b) {
        return (a+b) * (a*0.1) + (b*0.9);
    }
}