package Projetos.ContaBancaria;

public class TestarConta {

     public static void iniciar(){

         // criar pessoa
        Person jose = new Person(
            "ddd-ddd-ddd-dd",
            "Jose",
            "jose@gmail.com",
            "(dd) d dddd-dddd"
        );

        jose.apresentar();

        // criar conta
        Conta conta_do_jose = new Conta(jose);

        conta_do_jose.deposito(500);
        assert conta_do_jose.getSaldo() == 500;

        conta_do_jose.saque(300);
        assert conta_do_jose.getSaldo() == 200;

        conta_do_jose.fecharConta();
        conta_do_jose.sacarTudo();
        assert conta_do_jose.getSaldo() == 0;
        conta_do_jose.fecharConta();
        conta_do_jose.reabrirConta();


    }
}
