package co.joaoemanuel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nome 1");
        names.add("Nome 4");
        names.add("Nome 2");
        names.add("Nome 3");

        Collections.sort(names);

        for (String name: names){
            print(name);
        }
    }
    public static void print(String text) {
        System.out.println(text);
    }

    public static void printi(int[] num) {
        System.out.println(num);
    }

}