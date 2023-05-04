package Exercicios.Lista_1;

public class GatoTeste {
    
    public static void main(String[] args) {
        Gato[] gatos = new Gato[3];
        for (int i = 0; i < gatos.length; i++) {
            gatos[i] = new Gato();
        }
        int i = 0;
        gatos[i].vivo = true;
        gatos[i].cor = "Preto";
        gatos[i].nome = "Felix";
        gatos[i].idade = 13;
        i++;
        gatos[i].vivo = false;
        gatos[i].cor = "Laranja";
        gatos[i].nome = "Garfield";
        gatos[i].idade = 6;
        i++;
        gatos[i].vivo = true;
        gatos[i].cor = "Branco";
        gatos[i].nome = "Filó";
        gatos[i].idade = 10;
        for (int j = 0; j < gatos.length; j++) {
            System.out.println(gatos[j].nome + " - Idade: " + gatos[j].idade + 
                "; Cor:" + gatos[j].cor + "; Vivo? " + gatos[j].vivo);
        }
        return;
    }

}
