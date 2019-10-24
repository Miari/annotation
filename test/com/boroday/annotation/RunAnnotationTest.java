package com.boroday.annotation;

import java.lang.reflect.InvocationTargetException;
import static org.junit.Assert.*;

public class RunAnnotationTest {
    @org.junit.Test
    public void testRunAnnotationUsage() throws InvocationTargetException, IllegalAccessException {
        RunAnnotationUsage runAnnotationUsage = new RunAnnotationUsage(7, 5);
        RunAnnotationImplementation.runCalculation(runAnnotationUsage);
        assertEquals(12, runAnnotationUsage.getSum());
        assertEquals(2, runAnnotationUsage.getDifference());
        assertEquals(35, runAnnotationUsage.getMultiplication());
        assertEquals(1, runAnnotationUsage.getDivision());
    }
}
