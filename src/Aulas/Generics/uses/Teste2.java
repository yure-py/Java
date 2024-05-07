package Aulas.Generics.uses;

import Aulas.Generics.genericsExamples.GenII;

public class Teste2 {

    public static void iniciar(String[] args) {

        GenII<String, Integer> classeGenerica = new GenII<>("Teste", 111);

        System.out.println(classeGenerica.getAllAsList());
    }

}
