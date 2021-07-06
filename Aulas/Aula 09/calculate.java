public class calculate {
    public static void main(String[] args){
        float x = Float.parseFloat(args[1]);
        float y = Float.parseFloat(args[2]);
        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            minus(x, y);
        }
        else if (args[0].equals("multiplicar")) {
            multiply(x, y);
        } else{
            division(x, y);
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
}
