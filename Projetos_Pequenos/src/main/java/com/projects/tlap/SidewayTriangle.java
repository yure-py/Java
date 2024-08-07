package com.projects.tlap;

public class SidewayTriangle {
    /*
    * Write a program that uses only two output statements, print("#") and print("\n"),
    * to produce a pattern of hash symbols shaped like a sideways sidewayTriangle:
    */

    static public void sidewayTriangle() {
        for (int row = 0; row < 7; row++) {
            for (int hash = 0; hash < (1 + row); hash++)
                System.out.print("#");
            System.out.print("\n");
        }
    }
}
