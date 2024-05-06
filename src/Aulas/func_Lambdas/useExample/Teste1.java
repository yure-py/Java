package Aulas.func_Lambdas.useExample;
import Aulas.func_Lambdas.lambdasExample.II_Operacao;

public class Teste1 {
    public static void iniciar() {

        II_Operacao adicao = (a, b) -> a+b;
        II_Operacao subtracao = (a, b) -> a-b;
        II_Operacao divisao = (a, b) -> a/b;
        II_Operacao multiplicacao = (a, b) -> a*b;

        System.out.println( adicao.operar(2,5) );
        System.out.println( subtracao.operar(2,5) );
        System.out.println( divisao.operar(2.0,5.0) );
        System.out.println( multiplicacao.operar(2,5) );
    }
}
