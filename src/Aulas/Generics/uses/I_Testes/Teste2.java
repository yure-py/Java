package Aulas.Generics.uses.I_Testes;

import Aulas.Generics.genericsExamples.Book1.GenII;

public class Teste2 {

    public static void iniciar(String[] args) {

        GenII<String, Integer> classeGenerica = new GenII<>("Teste", 111);

        System.out.println(classeGenerica.getAllAsList());
    }

}
