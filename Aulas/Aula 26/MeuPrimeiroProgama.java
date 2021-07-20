package co.joaoemanuel;

import java.util.ArrayList;
import java.util.List;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            User actual = new User("Nome " + i, "Sobrenome " + i);
            users.add(actual);
        }
        print(users.get(5).getFullName());
    }

    public static void print(String text) {
        System.out.println(text);
    }
}