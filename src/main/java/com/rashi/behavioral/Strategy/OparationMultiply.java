package com.rashi.behavioral.Strategy;

public class OparationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1*num2;
    }
}
