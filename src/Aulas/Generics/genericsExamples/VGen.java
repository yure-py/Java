package Aulas.Generics.genericsExamples;

import Aulas.Generics.uses.Vclasses.*;

public class VGen<T> {

    T obj;

    public VGen(T ob){
        obj = ob;
    }

    // Aceita apenas A ou suas subclasses
    public static void test(VGen<? extends A> name){
        System.out.println("Sem erro!");
    }

}
