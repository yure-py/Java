package Projetos.PassagensAereas.Testes;

import Projetos.PassagensAereas.Aeronave;
import Projetos.PassagensAereas.Passageiro;
import Projetos.PassagensAereas.Reserva;

public class TesteDeUso {

    static public void iniciar(){

        Aeronave voo = new Aeronave(10, "modelo1");

        Reserva reserva = new Reserva(voo);

        System.out.println(reserva.getAssentos_Disponiveis());

        Passageiro p1 = new Passageiro("passageiro 1", 1);
        Passageiro p2 = new Passageiro("Passageiro 2", 2);
        Passageiro p3 = new Passageiro("Passageiro 2", 1);

        reserva.fazerReserva(p1, new Integer[]{1,2});
        reserva.fazerReserva(p2, new Integer[]{4,5});

        System.out.println(p1.equals(p3));
    }
}
