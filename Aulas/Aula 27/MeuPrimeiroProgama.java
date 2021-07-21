package co.joaoemanuel;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        long n1 = 0L;
        long n2 = 1L;
        long n3 = 0L;

        for (int i = 1; i < 10; i++){
            printi(n1);
            printi(n2);
            n3 = n1 + n2;
            n1 = n3 + n2;
            n2 = n3 + n1;
            printi(n3);
        }
    }
    /*
    public static void print(String text) {
        System.out.println(text);
    }
    */

    private static void printi (long num){
        System.out.print(num + " ");
    }
}