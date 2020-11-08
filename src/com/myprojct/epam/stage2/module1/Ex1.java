package com.myprojct.epam.stage2.module1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter A[%d]: ", i + 1);
            a[i] = scanner.nextInt();
        }
        System.out.print("Please enter K: ");
        int k = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }
        System.out.printf("The sum is: %d", sum);
    }
}