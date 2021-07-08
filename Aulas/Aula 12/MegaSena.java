import java.util.Scanner;// Importa Scanner, pacote util para interação via terminal

public class MegaSena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Var que recebe o objeto de interação com o pacote Scanner

        System.out.println("Digite o seu nome"); // Escreve na tela a mensagem

        String name = scanner.nextLine(); // Espera que o user digite algo na proxima linha

        System.out.println("Olá " + name); // Escreve na tela o conteudo de name

    }
}
