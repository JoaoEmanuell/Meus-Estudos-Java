package co.joaoemanuel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // Como adicionar elementos no array?

        names.add("Nome 1");
        names.add("Nome 2");
        names.add("Nome 3");
        names.add("Nome 4");

        // Como buscar um elemento especifico pelo indice get()
        for (byte i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        // Como buscar o indice a partir de um elemento
        System.out.println(names.indexOf("Nome 2"));

        // Verifica se a lista está vazia ou não
        System.out.println(names.isEmpty());

        // Verifica se a lista contém algum elemento
        System.out.println(names.contains("Nome 4"));

        // Retorna o tamanho da lista
        System.out.println(names.size());

        // Limpar de vez a lista (remover todos os elementos), names.clear não possui retorno pois é um void
        names.clear();
    }
    public static void print(String text) {
        System.out.println(text);
    }

    public static void printi(int[] num) {
        System.out.println(num);
    }

}