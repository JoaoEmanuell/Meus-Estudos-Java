import java.util.Scanner;
public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        // converter tipos primitivos
        // (casting)

        Scanner scanner = new Scanner(System.in);

        double dd = 26.72;
        short ss = 26;

        float te = (float) dd / ss;
        System.out.println(te);
        System.out.println(dd / ss);
    }

    private static void print(String texto){
        System.out.println(texto);
    }
}