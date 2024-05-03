package Projetos.PassagensAereas.Testes;

import Projetos.PassagensAereas.Aeronave;
import Projetos.PassagensAereas.Passageiro;
import Projetos.PassagensAereas.Reserva;

public class TesteDeUso {

    static public void iniciar(){

        Aeronave voo = new Aeronave(10, "modelo1");

        Reserva reserva = new Reserva(voo);

        Passageiro p1 = new Passageiro("passageiro 1", 1);
        Passageiro p2 = new Passageiro("Passageiro 2", 2);
        Passageiro p3 = new Passageiro("Passageiro 3", 3);

        reserva.fazerReserva(p1, new Integer[]{8,9});
        reserva.fazerReserva(p2, new Integer[]{1,2,3});
        reserva.fazerReserva(p3, new Integer[]{10});

        System.out.println(reserva.getAssentos_Disponiveis());
        reserva.fazerReserva(p3, new Integer[]{1,2});

        p1.imprimir_passagem();
        p2.imprimir_passagem();
        p3.imprimir_passagem();

        System.out.println(reserva.passageirosDoVoo.toString());

    }
}
