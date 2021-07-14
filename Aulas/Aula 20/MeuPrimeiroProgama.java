import java.util.Scanner;
public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        String pass = "123456";
        print("Digite a sua senha: ");

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        System.out.println(pass.equals(password));

    }

    private static void print(String texto){
        System.out.println(texto);
    }
}