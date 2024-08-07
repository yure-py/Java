package com.projects.Beecrowd;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SortSimpleTest {
    @ParameterizedTest
    @CsvSource({
            "1, 5, 7",
            "7, 5, 1",
            "7, 1, 5",
            "5, 7, 1",
            "5, 1, 7",
            "1, 7, 5",
    })
    void sort3args(int a, int b, int c){
        assertArrayEquals(new double[]{7f, 5f, 1f}, SortSimple.sortDesc(a, b, c));
    }
}

