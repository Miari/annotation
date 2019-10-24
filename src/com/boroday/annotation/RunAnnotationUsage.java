package com.boroday.annotation;

public class RunAnnotationUsage {

    private int firstParameter;
    private int secondParameter;
    private int sum;
    private int difference;
    private int multiplication;
    private int division;

    public RunAnnotationUsage(int firstParameter, int secondParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
    }

    public void setFirstParameter() { //to be sure that method without annotation is not invoked
        this.firstParameter = 10;
    }

    public int getSum() {
        return sum;
    }

    public int getDifference() {
        return difference;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public int getDivision() {
        return division;
    }

    @Run
    public void sum() {
        sum = firstParameter + secondParameter;
    }

    @Run
    private void subtract() {
        difference = firstParameter - secondParameter;
    }

    @Run
    private void multiply() {
        multiplication = firstParameter * secondParameter;
    }

    @Run
    private void divide() {
        division = firstParameter / secondParameter;
    }
}
