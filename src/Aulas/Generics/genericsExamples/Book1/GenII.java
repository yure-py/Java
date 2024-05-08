package Aulas.Generics.genericsExamples.Book1;

import java.util.ArrayList;
import java.util.List;

public class GenII<P,Q>{

    P obj1;
    Q obj2;

    public GenII(P a, Q b) {
        obj1 = a;
        obj2 = b;
    }

    public List<?> getAllAsList(){
        ArrayList<Object> list = new ArrayList<>();

        list.add(obj1);
        list.add(obj2);

        return list;

    }
}
