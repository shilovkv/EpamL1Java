package com.myprojct.epam.stage2.module1;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter N: ");
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter A[%d]: ", i + 1);
            a[i] = scanner.nextDouble();
        }

        int indexOfMin = 0;
        int indexOfMax = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < a[indexOfMin]) {
                indexOfMin = i;
            }
            if (a[i] > a[indexOfMax]) {
                indexOfMax = i;
            }
        }
        double temp = a[indexOfMax];
        a[indexOfMax] = a[indexOfMin];
        a[indexOfMin] = temp;

        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = %f%n", i + 1, a[i]);
        }

    }
}