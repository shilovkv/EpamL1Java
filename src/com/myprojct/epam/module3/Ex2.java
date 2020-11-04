package com.myprojct.epam.module3;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a, b and h: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = Math.abs(scanner.nextInt());
        int x = a;
        while (x <= b) {
            System.out.printf("x = %d \t y = %d%n", x, x > 2 ? x : -x);
            x += h;
        }
    }
}
