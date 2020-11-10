package com.myprojct.epam.stage2.module1;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter N: ");
        int n = scanner.nextInt();
        double[] a = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter a[%d]: ", i + 1);
            a[i] = scanner.nextDouble();
            if (isPrimeNumber(i + 1)) {
                sum += a[i];
            }
        }
        System.out.printf("The sum is: %f", sum);
    }

    /**
     * checking is the number is a prime number?
     * @param n any integer number
     * @return true if n is prime number else false
     */
    private static boolean isPrimeNumber(int n) {
        if (n == 1) return false;

        boolean toReturn = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                toReturn = false;
                break;
            }
        }
        return toReturn;
    }
}