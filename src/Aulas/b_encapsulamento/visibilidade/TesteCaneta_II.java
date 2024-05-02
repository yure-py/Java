package Aulas.b_encapsulamento.visibilidade;

public class TesteCaneta_II {

    public static void iniciar(){

        Caneta_II caneta1 = new Caneta_II();

        // Sem construtor precisamos fazer o assign
        caneta1.setCarga(100);
        caneta1.setPonta(0.5);
        caneta1.setCor("Azul");
        caneta1.setTampado(true);


        // com construtor podemos inicializar
        Caneta_II caneta2 = new Caneta_II("azul", 0.5, 100, true);

        caneta1.destampar();
        caneta1.escrever();
        caneta1.tampar();
    }
}
