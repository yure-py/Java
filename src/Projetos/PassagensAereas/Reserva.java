package Projetos.PassagensAereas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reserva {

    // Atributos
    public Aeronave aeronaveDesteVOO;
    public ArrayList<Passageiro> passageirosDoVoo = new ArrayList<>();
    public ArrayList<Integer> assentos_Disponiveis;

    // Construtor
    public Reserva(Aeronave aeronave){
        assentos_Disponiveis = aeronave.getAssentosDisponiveis();
    }


    public int pesquisarPassageiro(Passageiro elemento_pesquisado){

        // pesquisa sequencial temporario para testar
        for (int j = 0; j < passageirosDoVoo.size(); j++) {
            Passageiro i = passageirosDoVoo.get(j);
            if ( elemento_pesquisado.equals(i) ) return j;
        }
        return -1;
    }

    public void fazerReserva(Passageiro e, Integer[] assentos){

        if (!assentos_Disponiveis.containsAll(List.of(assentos))){
            System.out.println("ASSENTOS NÃO DISPONÍVEIS!");
            return;
        }

        int searchedIndex = pesquisarPassageiro(e);
        if (searchedIndex == -1){

            // O passageiro recebe o número de seu assento ou numeros
            e.adicionarAssentosReservados(assentos);
            passageirosDoVoo.add(e);

            // Os assentos escolhidos são removidos da lista de assentos disponiveis
            assentos_Disponiveis.removeAll(Arrays.asList(assentos));

        }
        else passageirosDoVoo.get(searchedIndex).adicionarAssentosReservados(assentos);
    }

    public void cancelarReservas(Passageiro e){
        passageirosDoVoo.remove(e);

    }


        public ArrayList<Integer> getAssentos_Disponiveis() {
        return assentos_Disponiveis;
    }
}
