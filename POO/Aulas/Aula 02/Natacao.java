public class Natacao {

    // PROPIEDADES

    private String local, equipamentos;
    private Integer duracao;
    private Boolean molhado, dentro;

    // CONSTRUTOR

    public Natacao(String local, String equipamentos, Integer duracao){
        this.local = local.toUpperCase();
        this.equipamentos = equipamentos.toUpperCase();
        this.duracao = duracao;
    }

    // MÉTODOS

    public void entrarnaPiscina(){
        print("Entrou");
        this.molhado = true;
        this.dentro = true;
    }

    public void sairdaPiscina(){
        print("Saiu");
        this.molhado = true;
        this.dentro = false;
    }
    public void nadar(){
        print("Nadando");
    }
    public void meSecar(){
        if (dentro){
            print("Desculpe, não é possivel se secar dentro da piscina, saia dela primeiro!");
        } else {
            print("Secando");
            this.molhado = false;
            this.dentro = false;
        }
    }

    public void meMolhar(){
        print("Molhando");
        this.molhado = true;
    }

    // STATUS

    // local equipamentos duracao molhado dentro

    public void status(){
        System.out.println("Local: " + this.local);
        System.out.println("Equipamentos: " + this.equipamentos);
        System.out.println("Duracao: " + this.duracao);
        System.out.println("Molhado: " + this.molhado);
        System.out.println("Dentro: " + this.dentro);
    }

    public static void print(String x){
        System.out.println(x);
    }
}
