package com.boroday.annotation;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class InjectAnnotationTest {
    @org.junit.Test
    public void testInjectAnnotationUsage() throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        InjectAnnotationUsage injectAnnotationUsage= new InjectAnnotationUsage();
        InjectAnnotationImplementation.fillFields(injectAnnotationUsage);
        assertEquals(InjectAnnotationUsageParent.class, injectAnnotationUsage.getParent().getClass());
        assertEquals(InjectAnnotationUsageChild.class, injectAnnotationUsage.getChild().getClass());
        assertEquals(InjectAnnotationUsageChild.class, injectAnnotationUsage.getSecondParent().getClass());
        assertEquals(ArrayList.class, injectAnnotationUsage.getObject().getClass());
        assertNull(injectAnnotationUsage.getString());
    }
}
