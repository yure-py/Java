package Aulas.Generics.uses;

import Aulas.Generics.genericsExamples.*;
import Aulas.Generics.genericsExamples.Vclasses.*;

import java.util.ArrayList;

public class Teste3 {
    public static void main(String[] args) {

        III_BoundedGen<Integer> e0 = new III_BoundedGen<>(33);
        III_BoundedGen<Float> e1 = new III_BoundedGen<>(33f);
        III_BoundedGen<Double> e2 = new III_BoundedGen<>(33d);
        // III_BoundedGen<Double> e2 = new III_BoundedGen<>("33d"); Error!

        // D é uma interface e portanto a instancia pode ser qualquer classe que
        // implemente esta interface
        IIIa<D> e = new IIIa<>(new E());


        //IIIb<H> x; error H implementa porém não é um objeto de G
        IIIb<G> ob = new IIIb<G>(new G());
            // <T extends G & D & F> so aceita G com as interfaces D e F

        // IIIC<T extends D & F> Vai aceitar qualquer classe que implemente D e F
        IIIC<G> ob2 = new IIIC<G>(new G());
        IIIC<H> ob3 = new IIIC<H>(new H());

    }
}
