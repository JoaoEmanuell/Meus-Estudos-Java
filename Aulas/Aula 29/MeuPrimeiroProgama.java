package co.joaoemanuel;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        int[] numbersA = new int[]{1, 2, 3};
        int[] numbersB = new int[]{1, 5, 3};

        System.out.println(Arrays.equals(numbersA, numbersB));

       // System.out.println(comparateArray(numbersA, numbersB));
    }
    public static void print(String text) {
        System.out.println(text);
    }

    public static void printi(int[] num) {
        System.out.println(num);
    }
/* teste de comparação de arrays, falhou.
    private static boolean comparateArray(int[] arrayone, int[] arraytwo){
        short comp = 0;
        for (short i = 0; i < arrayone.length; i++){
            if (arrayone[i] == arraytwo[i]){
                return true;
            } else {
                comp++;
            }
        }
        if (comp != 0){
            return false;
        } else{
            return true;
        }
    }
*/

}