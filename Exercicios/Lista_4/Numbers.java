package Exercicios.Lista_4;

public class Numbers {
    private int[] arrNumeros;

    public int[] getArrNumeros() {
        return arrNumeros;
    }
    public void setArrNumeros(int[] arrNumeros) {
        this.arrNumeros = arrNumeros;
    }

    public void inverterArray(){
        int i = 0;
        int j = arrNumeros.length - 1;
        for (i = 0; i < j;) {
            int tmp = arrNumeros[i];
            arrNumeros[i] = arrNumeros[j];
            arrNumeros[j] = tmp;
            i++;
            j--;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i : arrNumeros) {
            s = s + i;
            s = s + ", ";
        }
        return s;
    }
}
