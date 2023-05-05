package Exercicios.Lista_4.UFC;

public abstract class Lutador {
    private String nome;
    private int idade;
    private double peso;

    public Lutador(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
    public double getPeso() {
        return peso;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s/%d/%.1f", nome, idade, peso);
    }

    public abstract void possiveisLutas(Lutador[] lutadores); 
    public abstract void categoriaLutador();
    public abstract Lutador sorteioLuta(Lutador[] lutadores);
}
