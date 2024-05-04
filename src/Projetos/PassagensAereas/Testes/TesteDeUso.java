package Projetos.PassagensAereas.Testes;

import Projetos.PassagensAereas.Aeronave;
import Projetos.PassagensAereas.Passageiro;
import Projetos.PassagensAereas.Reserva;

public abstract class TesteDeUso {
    static public void iniciar(){

        Aeronave voo1 = new Aeronave(10, "modelo1");
        Reserva reserva_voo1 = new Reserva(voo1, "001x1a");

        Passageiro p1 = new Passageiro("Nome 1", 1);
        Passageiro p2 = new Passageiro("Nome 2", 2);
        Passageiro p3 = new Passageiro("Nome 3", 3);

        reserva_voo1.fazerReserva(p1, new Integer[]{1,2,3});
        reserva_voo1.fazerReserva(p1, new Integer[]{4,5,6});
        reserva_voo1.fazerReserva(p1, new Integer[]{7,8,9,10});

        reserva_voo1.status();
        p1.imprimir_passagem();

        System.out.println(p1.pontosDeFidelidade);
    }
}
