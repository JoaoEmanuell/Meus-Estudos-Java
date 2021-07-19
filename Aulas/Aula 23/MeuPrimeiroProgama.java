package co.joaoemanuel;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {

        User usera = new User();
        usera.setFirstName("João");
        usera.setLastName("Mendonça");
        usera.setAge(15);
        print(usera.getFirstName());
        print(usera.getLastName());
        System.out.println(usera.getAge() + " anos");
        print(usera.getFullName());

    }

    public static void print(String text) {
        System.out.println(text);
    }
}