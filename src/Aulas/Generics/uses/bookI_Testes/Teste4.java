package Aulas.Generics.uses.bookI_Testes;

import Aulas.Generics.genericsExamples.Book1.VGen;
import Aulas.Generics.uses.bookI_Testes.Vclasses.*;


public class Teste4 {
    public static void run(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        VGen<A> w1 = new VGen<>(a);
        VGen<B> w2 = new VGen<>(b);
        VGen<C> w3 = new VGen<>(c);
        VGen<D> w4 = new VGen<>(d);

        // Sem erros pois estedem A
        VGen.test(w1);
        VGen.test(w2);
        VGen.test(w3);
        // VGen.test(w4); !ERROR!


    }
}
