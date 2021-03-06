package com.company.v6.operation;

public class AddOperation implements Operation {


    private final double a;
    private final double b;

    public AddOperation(double a, double b) {

        this.a = a;
        this.b = b;
    }

    @Override
    public double perform() {

        return a + b;

    }
}
