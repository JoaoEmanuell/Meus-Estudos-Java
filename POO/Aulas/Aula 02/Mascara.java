public class Mascara {
    // Propiedades

    private String elastico, material, marca;
    private Double tamanho;
    private Boolean aberta, colocado;

    public Mascara(String elastico, String material, String marca, Double tamanho){
        this.elastico = elastico.toUpperCase();
        this.material = material.toUpperCase();
        this.marca = marca.toUpperCase();
        this.tamanho = tamanho;
    }

    // Métodos

    /*
        abrirMascara(), fecharMascara(), esticarElastico(), colocarMascara(), tirarMascara().
     */

    public void abrirMascara(){
        print("Máscara aberta");
        this.aberta = false;
    }

    public void fecharMascara(){
        if (this.colocado){
            print("Impossivel fechar a máscara, pois ela está no seu rosto, retire ela primeiro!");
            this.aberta = true;
        } else {
            print("Máscara fechada");
            this.aberta = false;
        }
    }

    public void esticarElastico(Double tam){
        print("Elastico esticado com sucesso");
        this.tamanho = tam;
    }

    public void colocarMascara(){
        print("Máscara colocada");
        this.colocado = true;
        this.aberta = true;
    }

    public void tirarMascara(){
        print("Máscara retirada");
        this.colocado = false;
    }

    // STATUS elastico, material, marca; tamanho aberta, colocado;

    public void status(){
        System.out.println("Elastico: " + this.elastico);
        System.out.println("Material: " + this.material);
        System.out.println("Marca: " + this.marca);
        System.out.println("Tamanho: " + this.tamanho);
        System.out.println("Aberta: " + this.aberta);
        System.out.println("Colocado: " + this.colocado);
    }

    public static void print(String x){
        System.out.println(x);
    }
}
