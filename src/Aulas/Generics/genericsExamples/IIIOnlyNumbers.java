package Aulas.Generics.genericsExamples;

public class IIIOnlyNumbers<T extends Number> {

    T e;

    public IIIOnlyNumbers(T e){
        this.e = e;
    }

    public void getNumber(){
        System.out.println(e);
    }
}
