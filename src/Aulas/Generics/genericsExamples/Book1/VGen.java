package Aulas.Generics.genericsExamples.Book1;

import Aulas.Generics.uses.I_Testes.Vclasses.*;

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
