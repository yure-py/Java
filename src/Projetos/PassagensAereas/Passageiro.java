package Projetos.PassagensAereas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Passageiro {

    public int ID;
    String Nome;
    ArrayList<Integer> assentos_reservados = new ArrayList<>();

    public Passageiro(String Nome, int ID){
        this.ID = ID;
        this.Nome = Nome;
    }

    public void adicionarAssentosReservados(Integer[] e) {
        assentos_reservados.addAll(Arrays.asList(e));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passageiro that)) return false;
        return ID == that.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return Nome;
    }

    public void imprimir_passagem(){
        System.out.println("---------------------------");
        System.out.println("Passageiro: " + Nome);
        System.out.println("Assentos: " + assentos_reservados.toString());
        System.out.println("---------------------------");
    }
}
