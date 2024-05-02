package Aulas.a_introducao;

public class Caneta {

    String cor;
    double ponta;
    double carga;
    boolean tampado;

    void escrever(){
        if (carga < 0.5 || carga < 0) {
            System.out.println("Falta Tinta!");
            return;
        }

        if (tampado){

            System.out.println("Caneta Tampada!");
            return;
        }

        System.out.println("Escrevendo...");
        carga -= 0.5;
    }

    void destampar(){
        tampado = false;
    }

    void tampar(){
        tampado = true;
    }
}
