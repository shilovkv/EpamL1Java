package com.myprojct.epam.stage1.module1;

import java.util.Scanner;

public class Ex2 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(func(a, b, c));
    }

    private static double func(double a, double b, double c) throws IllegalArgumentException {
        if (a == 0) {
            throw new IllegalArgumentException("a can not be 0");
        }
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + Math.pow(b, -2);
    }
}
