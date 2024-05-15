package Aulas.Generics.genericsExamples;

public class IV_Wildcard<T extends Number> {

    T[] ob;

    public IV_Wildcard(T[] ob) {
        this.ob = ob;
    }

    double avarage(){
        double sum = 0.0;

        for (T t : ob)
            sum += t.doubleValue();

        return sum / ob.length;
    }

    public boolean isSameAvarage(IV_Wildcard<?> ob) {
        return avarage() == (ob.avarage());
    }
}



// Forma Errada
// So funciona com objetos do mesmo tipo IvWildCard<Integer> se forem diferentes não funfa
//    public boolean isSameAvarage(IV_Wildcard<T> ob) {
//        return avarage().equals(ob.avarage());
//    }
