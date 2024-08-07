package com.projects.Beecrowd;

public class SortSimple {
    static public double[] sortDesc(double a, double b, double c) {
        double min,max,mid;

        max = Math.max(a, Math.max(b, c));
        min = Math.min(a, Math.min(b, c));
        mid = a+b+c-max-min;

        return new double[]{max, mid, min};
    }
}
