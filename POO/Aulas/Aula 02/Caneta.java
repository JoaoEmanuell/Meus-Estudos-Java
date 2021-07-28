import java.util.Locale;

public class Caneta {

    // Propiedades

    private String modelo;
    private String cor;
    private Double ponta;
    private Integer carga;
    private Boolean tampada;

    // Construtor

    public Caneta(String modelo, String cor, Double ponta){
        this.modelo = modelo.toUpperCase();
        this.cor = cor.toUpperCase();
        this.ponta = ponta;
        this.carga = 100;
        this.tampada = true;
    }

    // Metodos

    public String rabiscar(){
        if (this.tampada){
            System.out.println("Caneta tampada, não é possivel rabiscar");
            return "Erro";
        } else{
            System.out.println("Rabisco");
            return "Rabisco";
        }
    }

    public Boolean tampar(){
        System.out.println("Caneta tampada!");
        this.tampada = true;
        return true;
    }

    public Boolean destampar(){
        System.out.println("Caneta destampada!");
        this.tampada = false;
        return false;
    }

    // Status

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }
}
