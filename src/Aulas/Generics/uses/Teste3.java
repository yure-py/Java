package Aulas.Generics.uses;

import Aulas.Generics.genericsExamples.IIIOnlyNumbers;

public class Teste3 {
    public static void main(String[] args) {

        IIIOnlyNumbers<Integer> e0 = new IIIOnlyNumbers<>(33);
        IIIOnlyNumbers<Float> e1 = new IIIOnlyNumbers<>(33f);
        IIIOnlyNumbers<Double> e2 = new IIIOnlyNumbers<>(33d);
        //OnlyNumbersIII<String> e3 = new OnlyNumbersIII<>("Error Error Error");

        e2.getNumber();

    }
}
