package Aulas.Generics.genericsExamples;

// T é um tipo generico que será substituido por um tipo real
public class GenI<T> {

    T ob;

    public GenI(T object){
        ob = object;
    }

    public T getOb(){
        return ob;
    }

    public void ShowType(){
        System.out.println("Type of T is " + ob.getClass());
    }
}
