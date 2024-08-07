package com.projects.Beecrowd;
import java.io.IOException;
import java.util.Scanner;
import static com.projects.Beecrowd.SortSimple.sortDesc;

public class Triangle {

    static private boolean isTriangular(double a, double b, double c) {
        double[] points = sortDesc(a,b,c);
        return !(points[0] >= points[1] + points[2]);
    }

    static private String triangleType(double x, double y, double z) {

        String outputMessage = "";

        // ordenar em descrescente
        double[] points = sortDesc(x,y,z);

        double A = points[0];
        double B = points[1];
        double C = points[2];

        double a2 = A*A;
        double b2 = B*B;
        double c2 = C*C;

        // condição de saída
        if (!(isTriangular(A,B,C)))
            return "NAO FORMA TRIANGULO\n";
        if (a2 == b2 + c2)
            outputMessage += "TRIANGULO RETANGULO\n";
        if (a2 > b2 + c2)
            outputMessage += "TRIANGULO OBTUSANGULO\n";
        if (a2 < b2 + c2)
            outputMessage += "TRIANGULO ACUTANGULO\n";
        if (A == B && B == C)
            outputMessage += "TRIANGULO EQUILATERO\n";
        else if ((A == B && A != C) || (A == C && A != B) || (B == C && B != A))
            outputMessage += "TRIANGULO ISOSCELES\n";
        return outputMessage;
    }
}

