package Aulas.Generics.genericsExamples;

// Podemos definir um limite para o tipo generico
// T so vai aceitar as Subclasses de Number e o proprio Number
public class III_BoundedGen<T extends Number> {

    T e;
    public III_BoundedGen(T e){
        this.e = e;
    }

    public void getNumber(){
        System.out.println(e);
    }
}
