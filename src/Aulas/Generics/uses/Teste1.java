package Aulas.Generics.uses;

import Aulas.Generics.genericsExamples.GenI;

public class Teste1 {
    public static void iniciar(String[] args) {

        GenI<Integer> iOb;

        iOb = new GenI<Integer>(88);
        System.out.println(iOb.getOb());
        iOb.ShowType();
        System.out.println(iOb.getOb());

        GenI<String> iStr = new GenI<>("Testing Generics");

        System.out.println(iStr.getOb());
        iStr.ShowType();

    }
}
