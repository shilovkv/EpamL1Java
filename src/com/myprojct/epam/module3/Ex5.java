package com.myprojct.epam.module3;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter e: ");
        double e = scanner.nextDouble();
        int n = 1;
        double an = 1.0 / 2 + 1.0 / 3;
        double sum = 0;
        while (Math.abs(an) >= e ) {
            sum += an;
            n++;
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
        }
        System.out.printf("The sum is: %f", sum);
    }
}