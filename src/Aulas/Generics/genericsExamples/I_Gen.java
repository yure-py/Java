package Aulas.Generics.genericsExamples;

// T é um tipo generico que será substituido por um tipo real
public class I_Gen<T> {

    // Podemos usar como tipo de atributos
    T ob;

    // Construtor
    public I_Gen(T object){
        ob = object;
    }
    public <P, Q> I_Gen(T object, P x, Q y){
        ob = object;
    }

    // T pode ser usado como retorno ou tipo de um argumento
    public T getOb(){
        return this.ob;
    }
    public T gen(T arg){
        return arg;
    }
}
