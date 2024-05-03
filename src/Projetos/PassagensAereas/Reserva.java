package Projetos.PassagensAereas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reserva {

    // Erros possiveis
      // 1 passageiro fazendo 2 reservas diferentes
      //

    // Atributos
    static private Aeronave aeronaveDesteVOO;
    static private List<Passageiro> passageirosDoVoo = new ArrayList<>();
    static private ArrayList<Integer> assentos_Disponiveis;

    // Construtor
    public Reserva(Aeronave aeronave){
        assentos_Disponiveis = aeronave.getAssentosDisponiveis();
    }


    public int pesquisarPassageiro(Passageiro elemento_pesquisado){

        // pesquisa sequencial temporario para testar
        for (int j = 0; j < passageirosDoVoo.size(); j++) {
            Passageiro i = passageirosDoVoo.get(j);
            if (elemento_pesquisado.equals(i)) {
                return j;
            } else return -1;
        }
    }

    public void fazerReserva(Passageiro e, Integer[] assentos){

        // O passageiro recebe o número de seu assento ou numeros
        e.adicionarAssentosReservados(assentos);
        passageirosDoVoo.add(e);

        // Os assentos escolhidos são removidos da lista de assentos disponiveis
        assentos_Disponiveis.removeAll(Arrays.asList(assentos));
    }

    public ArrayList<Integer> getAssentos_Disponiveis() {
        return assentos_Disponiveis;
    }
}
