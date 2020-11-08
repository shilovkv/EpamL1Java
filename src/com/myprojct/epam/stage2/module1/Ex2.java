package com.myprojct.epam.stage2.module1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter n: ");
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter a[%d]: ", i + 1);
            a[i] = scanner.nextDouble();
        }
        System.out.print("Please enter Z: ");
        double z = scanner.nextDouble();
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > z) {
                a[i] = z;
                counter++;
            }
            System.out.printf("a[%d] = %f%n", i + 1, a[i]);
        }
        System.out.printf("Total %d replaces", counter);
    }
}