import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        Random generate = new Random();

        //while (true) -> loop infinito
        //while (i < 10) -> loop com saida
        /*
        while (i != 6){
            int number = generate.nextInt(60);
            System.out.print(number + " ");
            i++;
        }
        */
        for(int i = 0; i != 6; i++){
            int number = generate.nextInt(59);
            System.out.print(number + 1 + " ");
        }
    }
}
