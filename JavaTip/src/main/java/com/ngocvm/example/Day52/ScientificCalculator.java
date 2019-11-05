package com.ngocvm.example.Day52;

public class ScientificCalculator extends SimpleCalculator {
    public ScientificCalculator() {

    }

    public double Addition(double lhs, double rhs) {
        return lhs + rhs;
    }

    public double Subtraction(double lhs, double rhs) {
        return lhs - rhs;
    }

    public double Division(double lhs, double rhs) {
        if (rhs == 0.0)
            return 0.0;
        return lhs/rhs;
    }

    public double Multiplication(double lhs, double rhs) {
        return lhs * rhs;
    }

    public int SquareRoot(Integer x) {
        return x * x;
    }

    public double SquareRoot(double x) {
        return x * x;
    }

    public int Exponentiation(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; ++i) {
            result *= base;
        }
        return result;
    }

    public double Exponentiation(double base, double exponent) {
        double result = 1;
        for (int i = 0; i < exponent; ++i) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        ScientificCalculator calculator = new ScientificCalculator();
        System.out.println("128 + 256 = " + calculator.Addition(128, 256));
        System.out.println("1012 - 873 = " + calculator.Subtraction(1012, 873));
        System.out.println("1990 / 25 = " + calculator.Division((Integer) 1990, (Integer) 25));
        System.out.println("58 * 15 = " + calculator.Multiplication(58, 15));
    }
}
