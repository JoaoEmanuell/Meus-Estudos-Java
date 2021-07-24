package co.joaoemanuel;

import java.util.ArrayList;
import java.util.List;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        User userA = new User("João", "Emanuel");
        print(userA.getFullname(false));

    }
    public static void print(String text) {
        System.out.println(text);
    }

    public static void printi(int[] num) {
        System.out.println(num);
    }

}