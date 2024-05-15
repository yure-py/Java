package Aulas.Generics.uses;

import Aulas.Generics.genericsExamples.II_GenericMethod;

public class Teste2 {

    public static void iniciar(String[] args) {

        II_GenericMethod<String, Integer> classeGenerica = new II_GenericMethod<>("Teste", 111);

        classeGenerica.test(15);
        classeGenerica.test("15");
        classeGenerica.test(15f);
        classeGenerica.test('1');

        //System.out.println(classeGenerica.getAllAsList());
    }

}
