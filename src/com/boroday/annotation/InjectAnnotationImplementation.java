package com.boroday.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class InjectAnnotationImplementation {
    static void fillFields(Object object) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Class<?> clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Inject annotation = field.getAnnotation(Inject.class);
            if (annotation != null) {
                field.setAccessible(true);
                Class<?> classFromAnnotation = annotation.clazz();
                if (classFromAnnotation != Void.class) {
                    field.set(object, classFromAnnotation.getConstructor().newInstance());
                } else {
                    Class<?> classFromField = field.getType();
                    field.set(object, classFromField.getConstructor().newInstance());
                }
                field.setAccessible(false);
            }
        }
    }
}
