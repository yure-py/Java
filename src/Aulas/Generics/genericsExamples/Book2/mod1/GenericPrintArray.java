package Aulas.Generics.genericsExamples.Book2.mod1;

import java.util.Arrays;

public class GenericPrintArray {

    static public <T> void printArray(T[] a){
        System.out.println(Arrays.toString(a));
    }

}
