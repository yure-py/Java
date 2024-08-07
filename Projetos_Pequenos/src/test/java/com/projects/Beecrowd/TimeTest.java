package com.projects.Beecrowd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {
    @Test
    void hour_diff_A_greather_Than_B() {
        assertEquals(1, TimeTRABALHOAQUIAINDA.hourDiff(8, 9));
    }

    @Test
    void hour_diff_B_greather_Than_A() {
        assertEquals(23, TimeTRABALHOAQUIAINDA.hourDiff(8, 7));
    }

    @Test
    void hour_diff_B_equal_A() {
        assertEquals(24, TimeTRABALHOAQUIAINDA.hourDiff(8, 8));
    }

}