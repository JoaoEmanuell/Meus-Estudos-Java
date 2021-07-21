package co.joaoemanuel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        int[] numbers = new int[]{10, 0, 6, 9, 7, 8, 9, 2};
        Arrays.sort(numbers);
        System.out.println(numbers);// <- hashcode (Identificador do objeto)
        System.out.println(Arrays.toString(numbers));
    }
    public static void print(String text) {
        System.out.println(text);
    }

    public static void printi(int[] num) {
        System.out.println(num);
    }



}