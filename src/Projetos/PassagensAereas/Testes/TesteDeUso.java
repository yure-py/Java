package Projetos.PassagensAereas.Testes;

import Projetos.PassagensAereas.Aeronave;
import Projetos.PassagensAereas.Passageiro;
import Projetos.PassagensAereas.Reserva;

public abstract class TesteDeUso {
    static public void iniciar(){

        Aeronave voo1 = new Aeronave(10, "modelo1");
        Aeronave voo2 = new Aeronave(5, "modelo2");
        Aeronave voo3 = new Aeronave(20, "modelo3");

        Reserva reserva_voo1 = new Reserva(voo1, "001x1a");
        Reserva reserva_voo2 = new Reserva(voo1, "002x2b");
        Reserva reserva_voo3 = new Reserva(voo1, "003x3c");

        Passageiro p1 = new Passageiro("Nome 1", 1);
        Passageiro p2 = new Passageiro("Nome 2", 2);
        Passageiro p3 = new Passageiro("Nome 3", 3);

        reserva_voo1.fazerReserva(p1, new Integer[]{8,9});
        reserva_voo2.fazerReserva(p1, new Integer[]{1,2});
        reserva_voo2.cancelarReservas(p1);
        reserva_voo2.cancelarReservas(p1);

        reserva_voo1.fazerReserva(p2, new Integer[]{1,2,3});
        reserva_voo1.fazerReserva(p3, new Integer[]{10});

        reserva_voo1.status();

        p1.imprimir_passagem();
        p2.imprimir_passagem();
        p3.imprimir_passagem();

    }
}
