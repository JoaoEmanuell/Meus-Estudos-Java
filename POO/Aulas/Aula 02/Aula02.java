public class Aula02 {
    public static void main(String[] args){
        /*
        Caneta c1 = new Caneta("bic", "azul", 0.75);
        c1.status();
        c1.destampar();
        c1.tampar();
        c1.rabiscar();

        Caneta c2 = new Caneta("Fab-castel", "rosa", 1.25);
        c2.status();
         */
        /*
        Mascara m1 = new Mascara("Corda", "Algodão", "Generica", 30.0);

        m1.abrirMascara();
        m1.colocarMascara();
        m1.esticarElastico(35.0);
        m1.fecharMascara();
        m1.tirarMascara();
        m1.status();

         */

        Natacao n1 = new Natacao("Centro", "Oculos, touca", 1);

        n1.entrarnaPiscina();
        n1.meMolhar();
        n1.nadar();
        n1.sairdaPiscina();
        n1.meSecar();
        n1.status();
    }
    public static void print(String text){
        System.out.println(text);
    }
}