package com.myprojct.epam.module1;

import java.util.Scanner;

public class Ex1 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println(func(a, b, c));
    }

    private static double func(double a, double b, double c) {
        return (a - 3) * b / 2 + c;
    }
}
