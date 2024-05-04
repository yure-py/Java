package Projetos.PassagensAereas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reserva {

    // Atributos
    ArrayList<Passageiro> passageirosDoVoo = new ArrayList<>();
    ArrayList<Integer> assentos_Disponiveis;
    String id_voo;

    // Construtor
    public Reserva(Aeronave aeronave, String id){
        assentos_Disponiveis = aeronave.getAssentosDisponiveis();
        id_voo = id;
    }

    // Métodos
    public void fazerReserva(Passageiro passageiro, Integer[] assentos){

        if (!assentos_Disponiveis.containsAll(List.of(assentos))){
            System.out.println("NEM TODOS OS ASSENTOS ESTÃO DISPONÍVEIS!");
            return;
        }

        passageiro.assentos_reservados.computeIfAbsent(id_voo, k -> new ArrayList<>());

        int searchedIndex = passageirosDoVoo.indexOf(passageiro);
        if (searchedIndex == -1){

            // O passageiro recebe o número de seu assento ou numeros
            passageiro.adicionarNumerosReservados(assentos, id_voo);
            passageirosDoVoo.add(passageiro);

            // Os assentos escolhidos são removidos da lista de assentos disponiveis
            assentos_Disponiveis.removeAll(Arrays.asList(assentos));

        }
        else
            passageirosDoVoo.get(searchedIndex).adicionarNumerosReservados(assentos, id_voo);
    }

    public void cancelarReservas(Passageiro e){

        if ( passageirosDoVoo.contains(e) ){
            assentos_Disponiveis.addAll(e.assentos_reservados.get(id_voo));
            e.assentos_reservados.remove(id_voo);
            passageirosDoVoo.remove(e);
        }
        else
            System.out.println("Passageiro não encontrado");
    }

    public void status(){

        System.out.println("-------------------------------");
        System.out.println("Assentos vagos restantes: ");
        System.out.println("\t " + assentos_Disponiveis);
        System.out.println("Passageiros");
        System.out.println("\t " + passageirosDoVoo);
        System.out.println("-------------------------------");

    }

    public ArrayList<Passageiro> getPassageirosDoVoo() {
        return passageirosDoVoo;
    }

    public ArrayList<Integer> getAssentos_Disponiveis() {
        return assentos_Disponiveis;
    }

}
