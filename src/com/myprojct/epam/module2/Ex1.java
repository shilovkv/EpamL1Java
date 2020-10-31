package com.myprojct.epam.module2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.print("Please enter 2 angles in degrees: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean isTriangle = isTriangleExists(a, b);

        System.out.printf("The triangle exists: %b ", isTriangle);

        if (isTriangle) {
            System.out.printf("and it's rectangular: %b", isTriangleRectangular(a, b));
        }
    }

    private static boolean isTriangleExists(int a, int b) {
        return a + b < 180;
    }

    private static boolean isTriangleRectangular(int a, int b) {
        return a == 90 || b == 90 || 180 - (a + b) == 90;
    }
}