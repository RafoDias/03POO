package Exercicios.Lista_4.UFC;

import java.util.ArrayList;

public class PesoPena extends Lutador {
    int id = 4;

    PesoPena(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    public void possiveisLutas(Lutador[] lutadores) {
        for(int i = 0; i < lutadores.length; i++) {
            if (!(lutadores[i] instanceof PesoPena)) { continue; }
            if (lutadores[i].equals(this)) { continue; }
            System.out.println(lutadores[i].toString());
        }
    }

    public void categoriaLutador() {
        System.out.println("Peso Pena");
    }

    public Lutador sorteioLuta(Lutador[] lutadores) {
        ArrayList<Lutador> mesmaCategoria = new ArrayList<Lutador>();
        for(int i = 0; i < lutadores.length; i++) {
            if (!(lutadores[i] instanceof PesoPena)) { continue; }
            if (lutadores[i].equals(this)) { continue; }
            mesmaCategoria.add(lutadores[i]);
        }

        int index = ((int) Math.random()) % mesmaCategoria.size();
        
        return mesmaCategoria.get(index);
    }
}
