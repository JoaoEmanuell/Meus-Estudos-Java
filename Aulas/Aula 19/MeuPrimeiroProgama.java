import java.util.Scanner;
public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        String x = "Ola mundo, esse é o novo mundo";
        System.out.println(x.length()); // tamanho da str
        System.out.println(x + " concatenado"); // concatena a str com uma str literal que você escreveu ou uma var
        System.out.println(x.contains("novo")); // verifica se a str contem uma palavra especificada
        System.out.println(x.indexOf("mundo")); // verifica a partir de qual caractere uma palavra começa
        System.out.println(x.lastIndexOf("mundo")); // verifica onde é a ultima vez que a palavra aparece
        System.out.println(x.toUpperCase()); // faz todas as letras da str ficarem maisculas
        System.out.println(x.toLowerCase()); // faz todas as letras da str ficarem minusculas
        System.out.println(x.trim()); // remove os espaços no inicio e no fim da str
        System.out.println(x.substring(9)); // começa a escrever a frase a partir do caractere informado
        System.out.println(x.equals("Ola")); // verifica se o paramentro é igual a str
    }

    private static void print(String texto){
        System.out.println(texto);
    }
}