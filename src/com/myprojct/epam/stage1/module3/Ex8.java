package com.myprojct.epam.stage1.module3;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Please enter 2 integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + (getArrayOfNumbers(a)[i] && getArrayOfNumbers(b)[i]));
        }
    }

    /**
     * finding all numbers in integer provided
     * @param a an integer to find all numbers in it
     * @return boolean[10] where [0] is for number 0 (true if a contains any 0s, false if not); [1] for 1 ... [9] for 9
     */
    private static boolean[] getArrayOfNumbers(int a) {
        boolean[] numbers = new boolean[10];

        if (a == 0) {
            numbers[0] = true;
        } else {
            while (a != 0) {
                numbers[a % 10] = true;
                a /= 10;
            }
        }

        return numbers;
    }
}