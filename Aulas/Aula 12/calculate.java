import java.util.Scanner;

public class calculate {
    public static void main(String[] args){

        Scanner task = new Scanner(System.in);

       print("Operação, somar, subtrair, multiplicar, dividir ");

        String op = task.nextLine(); // operação

        print("Número 1"); // escreva

        String number = task.nextLine(); // pergunte

        float x = Float.parseFloat(number); // converta a str para float e adicione a float x

        print("Número 2"); // escreva

        number = task.nextLine(); // pergunte

        float y = Float.parseFloat(number); // converta a str para float e adicione a float y

        if (op.equals("somar")){ // se operação for igual a "somar" execute
            sum(x, y); //chame sum passando x e y
        } else if (op.equals("subtrair")){ // se operação for igual a "subtrair" execute
            minus(x, y); //chame minus passando x e y
        } else if (op.equals("multiplicar")){ // se operação for igual a "multiplicar" execute
            multiply(x, y); //chame multiply passando x e y
        } else if (op.equals("dividir")){ // se operação for igual a "dividir" execute
            division(x, y); //chame division passando x e y
        } else{
            print("Desculpe, operação invalida!");
        }
    }

    static float sum(float x, float y){
        System.out.println(x + y);
        float sum = x + y;
        return sum;
    }

    static float minus(float x, float y){
        System.out.println(x - y);
        float minus = x - y;
        return minus;
    }

    static float multiply(float x, float y){
        System.out.println(x * y);
        float multiply = x * y;
        return multiply;
    }
    static float division(float x, float y){
        System.out.println(x / y);
        float division = x / y;
        return division;
    }

    static void print(String text){
        System.out.println(text);
    }

}
