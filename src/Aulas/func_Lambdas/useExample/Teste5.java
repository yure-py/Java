package Aulas.func_Lambdas.useExample;

import Aulas.func_Lambdas.lambdasExample.V_SomeTest;

public class Teste5 {

    public static void iniciar() {

        V_SomeTest<Integer> isFactor = (a,b) -> a % b == 0;
        V_SomeTest<Double> isFactorD = (a,b) -> a % b == 0;
        V_SomeTest<String> isIn = (a,b) -> a.indexOf(b) != -1;

    }
}
