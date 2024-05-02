package Aulas.a_introducao;

public class TesteCaneta {

    public static void iniciar(){

        Caneta caneta1 = new Caneta();

        caneta1.cor = "azul";
        caneta1.carga = 100f;
        caneta1.tampado = true;
        caneta1.ponta = 0.7f;

        caneta1.destampar();
        caneta1.escrever();
        System.out.println(caneta1.carga);
        caneta1.tampar();
    }
}
