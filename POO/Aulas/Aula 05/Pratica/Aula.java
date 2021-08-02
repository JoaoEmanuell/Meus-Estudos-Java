public class Aula {
    public static void main(String[] args){
        ContaBancaria c1 = new ContaBancaria(0001, "CC", "Jubileu", 50.0);
        c1.deposit(100.0);
        print(c1.getBalance().toString());

        ContaBancaria c2 = new ContaBancaria(0002, "CP", "creuza", 150.0);
        c2.deposit(500.0);
        print(c2.withdraw(100.0));
        print(c2.getBalance().toString());

        c1.withdraw(150.0);
        c1.closeAccount();
        print(c1.status());
        print(c2.status());
    }
    public static void print(String text){
        System.out.println(text);
    }
}