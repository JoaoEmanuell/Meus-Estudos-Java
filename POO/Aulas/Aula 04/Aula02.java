public class Aula02 {
    public static void main(String[] args){
        Caneta c1 = new Caneta("bic cristal", "vermelho", 0.75);
        c1.uncapping();
        print(c1.status());
    }
    public static void print(String text){
        System.out.println(text);
    }
}