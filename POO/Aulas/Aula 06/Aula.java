public class Aula {
    public static void main(String[] args){
        ControleRemoto c = new ControleRemoto();
        c.bind();
        c.increaseVolume();
        c.callmute();
        c.openMenu();
    }
    public static void print(String text){
        System.out.println(text);
    }
}