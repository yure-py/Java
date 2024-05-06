package Aulas.POO.b_encapsulamento.interfaces;

public interface OperarControle {

    default void aumentarVol(int attr) {
        attr += 5;
    };
    void diminuirVol();
    void ligar();
    void desligar();
    void ligarMudo();
    void desligarMudo();

    // podemos definir uma implementação padrão numa interface a partir do jdk 8

}
