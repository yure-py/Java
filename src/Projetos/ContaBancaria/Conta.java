package Projetos.ContaBancaria;

/*
* Melhorias futuras
*   Adicionar validação com regex aos argumentos de Person
*   Retirar os if's e usar exceções
*   adicionar contas de tipos diferentes com vantagens como cashback
*/
interface operacoes{
    void reabrirConta();
    void fecharConta();
    void deposito(double qtd);
    void saque(double qtd);
    void sacarTudo();
}

@SuppressWarnings("All")
public class Conta implements operacoes{

    private double saldo;
    private Person owner;
    private boolean status;

    Conta(Person owner){
        this.owner = owner;
        saldo = 0;
        status = true;
    }
    //...

    @Override
    public void reabrirConta() {

        if (status) {
            System.out.println("Operação invalida");
            return;
        }

        status = true;
    }

    @Override
    public void fecharConta() {

        if (!status){
            System.out.println("Operação invalida");
            return;
        }

        if (saldo > 0){
            System.out.println("Retire o dinheiro antes de desativar a conta!");
            return;
        }

        status = false;
    }

    @Override
    public void deposito(double qtd) {

        if (!status){
            System.out.println("Conta inativa!");
            return;
        }

        saldo = saldo + qtd;
    }

    @Override
    public void saque(double qtd) {

        if (!status){
            System.out.println("Conta inativa!");
            return;
        }

        if (saldo < qtd){
            System.out.println("Saldo insuficiente!");
            return;
        }

        saldo = saldo - qtd;
    }

    @Override
    public void sacarTudo() {
        saldo -= getSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }
}
