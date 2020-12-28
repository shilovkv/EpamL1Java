package com.myprojct.epam.stage1.module3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter m and n: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.print(i + ": ");
            divider(i);
            System.out.println();
        }
    }

    private static void divider(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}