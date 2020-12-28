package com.myprojct.epam.stage1.module1;

import java.util.Scanner;

public class Ex3 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter x and y in ~degrees~: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println(func(x, y));
    }

    private static double func(double x, double y) throws IllegalArgumentException {

        double xy = x * y;
        if (xy % 180 == 90) {
            throw new IllegalArgumentException("tan(xy) does not exist");
        }

        x = Math.toRadians(x);
        y = Math.toRadians(y);
        xy = Math.toRadians(xy);
        double denominator = Math.cos(x) - Math.sin(y);

        if (denominator == 0) {
            throw new IllegalArgumentException("cos(x) - sin(y) can't be 0");
        }

        return (Math.sin(x) + Math.cos(y)) / denominator * Math.tan(xy);
    }
}