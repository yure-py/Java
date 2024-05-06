package Aulas.Generics.uses;

import Aulas.Generics.genericsExamples.GenI;

public class Main {
    public static void main(String[] args) {

        GenI<Integer> iOb;

        iOb = new GenI<Integer>(88);
        iOb.ShowType();
        System.out.println(iOb.getOb());



    }
}
