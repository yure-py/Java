package Aulas.func_Lambdas.useExample;

import Aulas.func_Lambdas.lambdasExample.IV_StringTest;

public class Teste4 {

    public static void iniciar() {

        IV_StringTest stringTest = (a,b) -> a.contains(b);

        System.out.println(stringTest.func("aaaabbas", "ab"));
    }
}
