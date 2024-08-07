package com.projects.Beecrowd;

import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class TriangleCalculatorTest {

    Method privateMethod;

    void unPrivateThis(String name) throws NoSuchMethodException {
        privateMethod = Triangle.class.getDeclaredMethod(name, double.class, double.class, double.class);
        privateMethod.setAccessible(true);
    }

    @Test
    void isTriangular() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        unPrivateThis("isTriangular");

        // Valid sidewayTriangle
        assertTrue((boolean) privateMethod.invoke(null, 3,4,5));

        // Invalid sidewayTriangle
        assertFalse((boolean) privateMethod.invoke(null, 1,2,3));
    }

    @Test
    void triagleType() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        unPrivateThis("triangleType");

        assertEquals("TRIANGULO ACUTANGULO\nTRIANGULO ISOSCELES\n", privateMethod.invoke(null, 7.0, 5.0, 7.0));
        assertEquals("TRIANGULO OBTUSANGULO\nTRIANGULO ISOSCELES\n", privateMethod.invoke(null, 6.0, 6.0, 10.0));
        assertEquals("TRIANGULO ACUTANGULO\nTRIANGULO EQUILATERO\n", privateMethod.invoke(null, 6.0, 6.0, 6.0));
        assertEquals("NAO FORMA TRIANGULO\n", privateMethod.invoke(null, 5.0, 7.0, 2.0));
        assertEquals("TRIANGULO RETANGULO\n", privateMethod.invoke(null, 6.0, 8.0, 10.0));

        assertEquals("NAO FORMA TRIANGULO\n", privateMethod.invoke(null, 1.0, 2.0, 3.0));
        assertEquals("NAO FORMA TRIANGULO\n", privateMethod.invoke(null, 10.0, 1.0, 1.0));

        assertEquals("TRIANGULO OBTUSANGULO\nTRIANGULO ISOSCELES\n", privateMethod.invoke(null, 7.0, 7.0, 12.0));
        assertEquals("TRIANGULO ACUTANGULO\nTRIANGULO EQUILATERO\n", privateMethod.invoke(null, 10.0, 10.0, 10.0));
        assertEquals("TRIANGULO ACUTANGULO\nTRIANGULO ISOSCELES\n", privateMethod.invoke(null, 8.0, 8.0, 5.0));
        assertEquals("TRIANGULO ACUTANGULO\nTRIANGULO ISOSCELES\n", privateMethod.invoke(null, 5,8,8));

    }
}