package com.kodilla.calculator;

public class Calculator {
    public int addAToB (int a, int b){
        return a+b;
    }
    public int subAFromB (int a, int b){
        return b-a;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        int result1 = calculator.addAToB(8,9);
        int result2 = calculator.subAFromB(2,15);
        System.out.println(result1);
        System.out.println(result2);
    }
}
