public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.print("Modelo: " + this.modelo);
        System.out.print("Uma caneta " + this.cor);
        System.out.print("Ponta: " + this.ponta);
        System.out.print("Carga: " + this.carga);
        System.out.print(" está tampada: " + this.tampada);
    }

    void rabiscar() {
        if(this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
