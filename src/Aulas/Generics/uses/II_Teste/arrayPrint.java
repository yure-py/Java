package Aulas.Generics.uses.II_Teste;


import Aulas.Generics.genericsExamples.Book2.mod1.GenericPrintArray;
import Aulas.Generics.genericsExamples.Book2.mod1.PrintArray_preGenerics;

public class arrayPrint {

    static public <P> void print(P obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {

        Integer[] intA = new Integer[]{1,2,3};
        String[] strB = new String[]{"a1", "a2", "a3"};

        PrintArray_preGenerics.printArray(intA);
        PrintArray_preGenerics.printArray(strB);

        GenericPrintArray.printArray(intA);
        GenericPrintArray.printArray(strB);
    }

}
