package Aulas.POO.b_encapsulamento.interfaces;

public class Controle implements OperarControle{

    private int volume;
    private boolean playing;
    private boolean ligado;

    // contrutor
    Controle(){
        //...
    }

    @Override
    public void diminuirVol() {
        volume -= 5;
    }
    @Override
    public void ligar() {
        ligado = true;
    }
    @Override
    public void desligar() {
        ligado = false;
    }
    @Override
    public void ligarMudo() {
        volume = 0;
    }
    @Override
    public void desligarMudo() {
        volume = 50;
    }
}
