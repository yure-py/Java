package Aulas.Generics.genericsExamples.Book2.mod1;

import java.util.Arrays;

public class PrintArray_preGenerics {

    static public void printArray(Integer[] e){
        System.out.println(Arrays.toString(e));
    }
    static public void printArray(Double[] e){
        System.out.println(Arrays.toString(e));
    }
    static public void printArray(Float[] e){
        System.out.println(Arrays.toString(e));
    }
    static public void printArray(String[] e){
        System.out.println(Arrays.toString(e));
    }
    static public void printArray(Boolean[] e){
        System.out.println(Arrays.toString(e));
    }
}
