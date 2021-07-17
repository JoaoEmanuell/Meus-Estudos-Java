package co.joaoemanuel;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        User user = new User();
        user.firstName = ("João");
        user.lastName = ("Mendonça");
        String fullName = user.getFullName();
        print(fullName);
    }

    public static void print(String text) {
        System.out.println(text);
    }
}