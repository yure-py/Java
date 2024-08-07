package com.projects.Beecrowd;

import java.util.Scanner;

public class Bhaskara {
    public static void calc(){
        Scanner leitor = new Scanner(System.in);

        double A,B,C;

        A = leitor.nextDouble();
        B = leitor.nextDouble();
        C = leitor.nextDouble();

        double delta = Math.pow(B, 2) - 4 * A * C;
        double raizDelta = Math.sqrt(delta);
        double x1 = (-B+raizDelta)/(2*A);
        double x2 = (-B-raizDelta)/(2*A);

        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
            return;
        }
        System.out.printf("R1 = %.5f\n", x1);
        System.out.printf("R2 = %.5f\n", x2);
    }
}
