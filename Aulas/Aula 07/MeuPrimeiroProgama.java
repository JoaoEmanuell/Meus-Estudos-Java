public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        System.out.println(sum(10, 5));// Argumentos
    }

    static float sum(float x, float y){
        // static void -> Declaração padrão
        // sum -> Nome da função, geralmente usamos verbos para definir o que a função faz
        // parenteses usamos para definir o que chegará naquela função
        // (tipo nomeDaVariavel)
        // {} -> bloco de código que será executado

        var sum = x + y;
        return sum;
    }
}