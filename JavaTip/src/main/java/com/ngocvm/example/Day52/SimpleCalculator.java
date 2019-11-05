package com.ngocvm.example.Day52;

public class SimpleCalculator {
    public SimpleCalculator() {

    }

    public int Addition(Integer lhs, Integer rhs) {
        return rhs + lhs;
    }

    public int Subtraction(Integer lhs, Integer rhs) {
        return  lhs - rhs;
    }

    public int Division(Integer lhs, Integer rhs) {
        if (rhs == 0)
            return 0;
        return lhs/rhs;
    }

    public int Multiplication(Integer lhs, Integer rhs) {
        return lhs * rhs;
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        System.out.println("128 + 256 = " + calculator.Addition(128, 256));
        System.out.println("1012 - 873 = " + calculator.Subtraction(1012, 873));
        System.out.println("1990 / 25 = " + calculator.Division(1990, 25));
        System.out.println("58 * 15 = " + calculator.Multiplication(58, 15));
    }
}
