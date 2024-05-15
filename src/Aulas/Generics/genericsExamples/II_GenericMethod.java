package Aulas.Generics.genericsExamples;

import java.util.ArrayList;
import java.util.List;


public class II_GenericMethod<P,Q>{

    P obj1;
    Q obj2;

    public II_GenericMethod(P a, Q b) {
        obj1 = a;
        obj2 = b;
    }

    // Nossos métodos podem definir seus proprios tipos genericos
    // Sem relação com o resto da classe
    public <X> void test(X t){
        System.out.println(t.getClass());
    }
}
