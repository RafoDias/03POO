package Exercicios.Lista_5;

public class GerenciadorImpostoRenda {
    double total = 0.0f;
    
    public double getTotal() {
        return total;
    }

    public void adiciona(Tributavel t){
        setTotal(total + t.calculaTributos());
    }

    public void adiciona(Tributavel[] t) {
        for (int i = 0; i < t.length; i++) {
            setTotal(total + t[i].calculaTributos());
        }
    }

    private void setTotal(double total) {
        this.total = total;
    }

    public void zerarTotal() {
        setTotal(0.00f);
    }
}
