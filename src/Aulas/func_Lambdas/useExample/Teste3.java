package Aulas.func_Lambdas.useExample;

import Aulas.func_Lambdas.lambdasExample.III_NumericTest;

public class Teste3 {

    public static void iniciar() {

        // a mesma interface funcional cmo 3 propositos completamentes diferentes
        III_NumericTest isFactor = (n, d) -> (n % d) == 0;
        III_NumericTest lessThan = (n, d) -> (n < d);
        III_NumericTest absEqual = (n, m) -> (n < 0 ? -n: n) == (m < 0 ? -m: m);
            // testa se os valores absolutos de n e d são iguais

        System.out.println(absEqual.test(4,-4));

    }
}
