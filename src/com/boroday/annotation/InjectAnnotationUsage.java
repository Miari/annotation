package com.boroday.annotation;

import java.util.ArrayList;

public class InjectAnnotationUsage {

    @Inject (clazz = Void.class)
    private InjectAnnotationUsageParent parent;

    @Inject (clazz = Void.class)
    private InjectAnnotationUsageChild child;

    @Inject(clazz = InjectAnnotationUsageChild.class)
    private InjectAnnotationUsageParent secondParent;

    @Inject(clazz = ArrayList.class)
    private Object object;

    private String string;

    public InjectAnnotationUsageParent getParent() {
        return parent;
    }

    public InjectAnnotationUsageChild getChild() {
        return child;
    }

    public InjectAnnotationUsageParent getSecondParent() {
        return secondParent;
    }

    public Object getObject() {
        return object;
    }

    public String getString() {
        return string;
    }
}
