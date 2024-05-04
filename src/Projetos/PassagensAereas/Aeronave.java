package Projetos.PassagensAereas;

import java.util.ArrayList;

public class Aeronave {

    public int qtd_assentos;
    String modelo;
    ArrayList<Integer> AssentosDisponiveis = new ArrayList<>();

    public Aeronave(int qtd, String modelo) {

        this.qtd_assentos = qtd;
        this.modelo = modelo;

        // inicializa um arary AssentosDisponiveis com inteiros de 1 a qtd_assentos
        for (int i = 0; i < qtd_assentos; i++){
            AssentosDisponiveis.add(i+1);
        }
    }

    public ArrayList<Integer> getAssentosDisponiveis() {
        return AssentosDisponiveis;
    }
}
