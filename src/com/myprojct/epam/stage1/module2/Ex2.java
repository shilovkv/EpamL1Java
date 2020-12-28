package com.myprojct.epam.stage1.module2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a, b, c and d: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(max(min(a, b), min(c, d)));
    }

    /**
     * method returns ~max~ of two int numbers
     * @param a first int number
     * @param b second int number
     * @return max of two int numbers
     */
    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    /**
     * method returns ~min~ of two int numbers
     * @param a first int number
     * @param b second int number
     * @return min of two int numbers
     */
    private static int min(int a, int b) {
        return a < b ? a : b;
    }
}