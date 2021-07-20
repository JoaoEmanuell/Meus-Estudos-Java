package co.joaoemanuel;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {

        User[] users = new User[]{
                new User("João", "Mendonça", 15),
                new User("Apolo", "Emanuel", 19),
                new User("Bell", "Galvares", 15),
        };

        System.out.println(users[1].getAge());
    }

    public static void print(String text) {
        System.out.println(text);
    }
}