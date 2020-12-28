package com.myprojct.epam.stage1.module3;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter any positive integer: ");
        int x = scanner.nextInt();

        System.out.printf("The sum from 1 to %d is: %d", x, sum(x));
    }

    private static int sum(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
}