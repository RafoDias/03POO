package Exercicios.Lista_4;

public class TesteNumbers {
    public static void main(String[] args) {
        Numbers numArray = new Numbers();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = i+1;
        }
        numArray.setArrNumeros(array);
        numArray.inverterArray();
        System.out.println(numArray.toString());
    }
}
