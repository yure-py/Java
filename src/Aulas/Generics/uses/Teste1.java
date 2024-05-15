package Aulas.Generics.uses;

import Aulas.Generics.genericsExamples.I_Gen;

public class Teste1 {
    public static void iniciar() {

        // Para instanciar a classe generica
        I_Gen<Integer> iOb = new I_Gen<Integer>(88);
        // Omissão com diamond operator
        I_Gen<String> iStr = new I_Gen<>("Testing Generics");

        System.out.println(iOb.getOb());
        System.out.println(iStr.getOb());

        iOb = new I_Gen<Integer>(1);
    }
}
