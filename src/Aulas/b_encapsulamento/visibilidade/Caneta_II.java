package Aulas.b_encapsulamento.visibilidade;

public class Caneta_II {

    private String cor;
    private double ponta, carga;
    private boolean tampado;

    Caneta_II(){

    }

    Caneta_II(String cor, double ponta, double carga, boolean tampado){
        this.carga = carga;
        this.ponta = ponta;
        this.tampado = tampado;
        this.cor = cor;
    }

    public void escrever(){
        if (carga < 0.5 || carga == 0) {
            System.out.println("Falta Tinta!");
            return;
        }

        if (tampado){
            System.out.println("Caneta Tampada!");
            return;
        }

        System.out.println("Escrevendo...");
        setCarga(getCarga() - 0.5);
    }

    public void destampar(){
        tampado = false;
    }

    public void tampar(){
        tampado = true;
    }

    // Getters e Setters
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setPonta(double ponta) {
        this.ponta = ponta;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }
    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }

    public String getCor() {
        return cor;
    }
    public double getPonta() {
        return ponta;
    }
    public double getCarga() {
        return carga;
    }
    public boolean isTampado() {
        return tampado;
    }
}
