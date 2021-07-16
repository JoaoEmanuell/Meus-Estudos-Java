package co.joaoemanuel;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        /*
        Guitar fender = new Guitar();
        fender.strings = 6;
        fender.name = "Fender";

        Guitar ibanez = new Guitar();
        ibanez.strings = 6;
        ibanez.name = "Ibanez";
         */

        SmartPhone j1 = new SmartPhone();

        j1.name = "Samsung Galax J1";
        j1.brand = "SAMSUNG";
        j1.price = 400.00;
        j1.year = 2012;

        SmartPhone j2 = new SmartPhone();

        j2.name = "Samsung Galaxy J2";
        j2.brand = "SAMSUNG";
        j2.price = 1459.99;
        j2.year = 2015;

        print(j2.name);
    }

    public static void print(String text) {
        System.out.println(text);
    }
}