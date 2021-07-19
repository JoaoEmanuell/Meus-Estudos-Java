package co.joaoemanuel;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {

        User[] users = new User[10];
/*
        for(int i = 0; i < users.length; i++){
            User actual = new User();
            actual.setFirstName("Nome " + i);
            actual.setLastName("Sobrenome " + i);
            users[i] = actual;
        }
 */
        User atual = new User();
        atual.setLastName("Emanuel");
        atual.setFirstName("João");
        users[2] = atual;
        print(users[2].getFullName());
    }

    public static void print(String text) {
        System.out.println(text);
    }
}