public class MeuPrimeiroProgama {

    public static void main(String[] args) {
        /*
        2 tipos de erros
        Erro de compilação:
            Erro de compilação é quando escrevemos algo errado no código.
                Exemplo:
                    doube x = 15.7; // Doube não existe, por isso que irá dar um erro
        Erro de execução:
            Erro de execução é um erro que não estava previsto no código, o seu código pode estar escrito
            corretamente mas pode ter ocorrido um erro lógico, por causa disso o seu progama irá parar de ser
            executado.
                Exemplo:
                    int x = 10;
                    int y = 0;
                    System.out.println(x / y); // nenhum número pode ser dividido por 0, por isso o progama
                    irá dar erro.
         */
        int x = 10;
        int y = 0;
        System.out.println(x / y);
    }
}