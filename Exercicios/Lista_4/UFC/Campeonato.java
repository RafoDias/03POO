package Exercicios.Lista_4.UFC;

import java.util.Locale;
import java.util.Scanner;

public class Campeonato {
    public static void main(String[] args) {
        Lutador[] lutadores = new Lutador[10];

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        for (int i = 0; i < lutadores.length; i++) {
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Peso: ");
            double peso = sc.nextDouble();
            if (peso <= 65.0f) { 
                lutadores[i] = new PesoPena(nome, idade, peso);
            } else if (peso <= 83.9f) {
                lutadores[i] = new PesoMedio(nome, idade, peso);
            } else if (peso <= 93.0f) {
                lutadores[i] = new MeioPesado(nome, idade, peso);
            } else if (peso <= 120.2f) {
                lutadores[i] = new PesoPesado(nome, idade, peso);
            }
            sc.nextLine();
        }

        int sorteio = (int) Math.random() % 10;
        System.out.println("Lutador sorteado: ");
        System.out.println(lutadores[sorteio]);

        System.out.println("Lista de possivels lutas: ");
        lutadores[sorteio].possiveisLutas(lutadores);

        System.out.println("O lutador sorteado irá lutar com: ");
        Lutador sorteado = lutadores[sorteio].sorteioLuta(lutadores);
        System.out.println(sorteado);
        
        sc.close();
    }
}
