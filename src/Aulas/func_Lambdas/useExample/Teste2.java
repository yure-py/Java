package Aulas.func_Lambdas.useExample;

import Aulas.func_Lambdas.lambdasExample.I_MyValue;

public class Teste2 {
    public static void iniciar() {
        I_MyValue example = () -> 23.5;
        System.out.println(example.getvalue());
    }
}
