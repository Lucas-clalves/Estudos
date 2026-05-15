package com.lucas_clalves;

public class Calculator {

    public double sum(double... number){
        double sum = 0;
        if (number.length > 0) {
            for (double n : number) {
            sum += n;
        }
        }
        return sum;
    }

    public double squareRoot(double number){
        if (number<0) {
            throw new IllegalArgumentException("The number cannot be negative!");
        }
        double result = Math.sqrt(number);
        return result;
    }   

    public boolean isOdd(int number){
        if(number%2 == 0){
            return false;
        }
        return true;
    }


}
