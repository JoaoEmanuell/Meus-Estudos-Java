public class Aula {
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria(1,"poupança", "Emanuel", 150.0);
        c1.closeAccount();
        print(c1.withdraw(170.0));
        c1.openAccount();
        print(c1.status());
    }
    public static void print(String text){
        System.out.println(text);
    }
}