package com.projects.Beecrowd;

import java.util.Scanner;

public class CartesianCoordinates {

    private static final String ORIGEM = "Origem";
    private static final String EIXO_X = "Eixo X";
    private static final String EIXO_Y = "Eixo Y";
    private static final String Q1 = "Q1";
    private static final String Q2 = "Q2";
    private static final String Q3 = "Q3";
    private static final String Q4 = "Q4";

    static boolean determinarOrigem(double x, double y){
        return x == 0 && y == 0;
    }

    static String determinarEixos(double x, double y){
        if (determinarOrigem(x, y))
            return ORIGEM;
        if (x == 0)
            return EIXO_Y;
        if (y == 0)
            return EIXO_X;
        return "";
    }

    static String determinarQuadrantes(double  x, double y){
        String eixo = determinarEixos(x, y);

        if (!eixo.isEmpty()){
            return eixo;
        }

        // determinar quadrantes
        if (x > 0 && y > 0)
            return Q1;
        if (x < 0 && y > 0)
            return Q2;
        if (x < 0 && y < 0)
            return Q3;
        if (x > 0 && y < 0)
            return Q4;
        return "";
    }

    static void calcularCoordenadas(double x, double y){
        System.out.println(determinarQuadrantes(x, y));
    }


}
