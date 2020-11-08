package com.myprojct.epam.stage2.module1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter N: ");
        int n = scanner.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter A[%d]: ", i + 1);
            a[i] = scanner.nextDouble();
        }
        int negativeElementsCounter = 0;
        int positiveElementsCounter = 0;
        int zeroElementsCounter = 0;

        for (double i : a) {
            if (i > 0) {
                positiveElementsCounter++;
            } else if (i < 0) {
                negativeElementsCounter++;
            } else {
                zeroElementsCounter++;
            }
        }
        System.out.printf("Negative elements: %d, positive elements: %d, zero elements: %d", negativeElementsCounter, positiveElementsCounter, zeroElementsCounter);
    }
}