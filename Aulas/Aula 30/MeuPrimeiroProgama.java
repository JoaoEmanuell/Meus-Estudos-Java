package co.joaoemanuel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        String[] names = new String[10];
        Arrays.fill(names, "Desconhecido");
        print(Arrays.toString(names));
    }
    public static void print(String text) {
        System.out.println(text);
    }

    public static void printi(int[] num) {
        System.out.println(num);
    }

}