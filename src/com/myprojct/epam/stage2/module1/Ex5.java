package com.myprojct.epam.stage2.module1;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter N: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter a[%d]: ", i + 1);
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > i + 1) {
                System.out.print(a[i] + " ");
            }
        }
    }
}