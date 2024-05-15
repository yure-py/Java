package Aulas.Generics.uses;

import Aulas.Generics.genericsExamples.IV_Wildcard;

public class Teste4 {
    public static void main(String[] args) {

        Integer[] inums = {1,2,3,4,5};
        Double[] dnums = {1.1,2.2,3.3,4.4,5.5};
        Double[] dnums2 = {1.0, 2.0, 3.0, 4.0, 5.0};

        IV_Wildcard<Integer> iob = new IV_Wildcard<>(inums);
        IV_Wildcard<Double> dob = new IV_Wildcard<>(dnums);

        System.out.println(iob.isSameAvarage(dob));

        dob = new IV_Wildcard<>(dnums2);

        System.out.println(iob.isSameAvarage(dob));


    }
}
