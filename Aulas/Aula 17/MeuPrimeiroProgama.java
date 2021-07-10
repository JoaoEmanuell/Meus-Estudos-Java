public class MeuPrimeiroProgama {

    // caso eu declare uma variavel ela terá o escopo padrão, portanto só poderá ser acessada por outras
    // classes que estejam no mesmo pacote dela.

    //static int x; //Só por ser acessada por outras classes que estão no mesmo pacote que essa

    //public static int x; //Pode ser acessada por qualquer pacote desde que ele importe esse pacote

    //private static int x; //Só pode ser acessada por funções dessa classe, nenhum outro pode acessar ela

    public static void main(String[] args) {
        // Visibilidade de escopo
    }

    public static int sum(final int x, final int y){
        final int summ = x + y;
        return summ;
    }
}