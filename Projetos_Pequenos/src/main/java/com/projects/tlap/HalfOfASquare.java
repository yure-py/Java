package com.projects.tlap;

// problem 1
/*
 *   Write a program that uses only two output statements, cout << "#" and cout << "\n",
 *   to produce a pattern of hash symbols shaped like half of a perfect 5 x 5 square (or a
 *   right sidewayTriangle):
 *   #####
 *   ####
 *   ###
 *   ##
 *   #
 */

import java.util.function.Consumer;

public class HalfOfASquare {

    static public Consumer<String> imprimir = System.out::print;
    static public Runnable quebrarlinha = System.out::println;

    // Restrição para todos os casos
    // Write a program that uses only two output statements, print("#") and print("\n")

    // produce a pattern of hash like half of a perfect 5 x 5 square (or a right sidewayTriangle):
    static void rightTriangle(){
        for (int row = 0; row < 5; row++) {
            for (int hashNum = 0; hashNum < 5-row; hashNum++)
                imprimir.accept("#");
            quebrarlinha.run();
        }
    }

    // Isolar a dificuldade de redução em 1 para cada linha num experimento
    public static void experiment1CountDown() {
        //  Precisamos achar a expressão que corresponde a 5 4 3 2 1
        /*
         *  for (int row = 1; row <= 5; row++) {
         *      print(expression + "\n");
         *  }
         */
        for (int row = 0; row < 5; row++)
            System.out.println(5-row);
    }

    // to produce a pattern of hash symbols shaped like a perfect 5x5 square:
    static void perfectSquare(){
        for (int row = 0; row < 5; row++) {
            for (int hasNum = 0; hasNum < 5; hasNum++)
                imprimir.accept("#");
            quebrarlinha.run();
        }
    }


    // Produce a line of five hash
    static void line(){
        for (int hashNum = 0; hashNum < 5; hashNum++)
            imprimir.accept("#");
        quebrarlinha.run();
    }
}
