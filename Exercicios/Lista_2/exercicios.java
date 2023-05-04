package Exercicios.Lista_2;

public class exercicios {
    public static void main(String[] args) {
        int soma = Somatorios.SomatorioExcetoIntervalo(10, 3, 7);
        // int soma = Somatorios.SomatorioPrimos(10);
        System.out.println(soma);
        System.out.println("teste");
    }

}

/*  Ex1 - letra a apenas.
 *  Ex2 - As declarações para peso e tamanho estão incorretas.
 *  Ex5 - A variável testeSaldo é impressa fora do seu escopo de criação.
 * Isso faz o sistema não compilar, pois quando ele necessita dessa variável,
 * a definição dela sequer existe.
 */

 public class Conta { // Ignorar para fins de demonstração
    double saldo;

    public void calcula() {
        if (saldo < 1000) {
            double testeSaldo = saldo*0.1;
        }
        System.out.println(testeSaldo); // Erro do escopo
    }
 }

 /*  Ex6. O java não realiza conversão implícita de double para int.
  *  Ex7. O java não interpreta doubles como booleans
  */
  }