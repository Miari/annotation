package com.boroday.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunAnnotationImplementation {
    static void runCalculation(Object object) throws InvocationTargetException, IllegalAccessException {
        Class<?> clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            Run annotation = method.getAnnotation(Run.class);
            if (annotation != null) {
                    method.setAccessible(true);
                    method.invoke(object);
                    method.setAccessible(false);
            }
        }
    }
}
