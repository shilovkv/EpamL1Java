package com.myprojct.epam.module2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter x: ");
        double x = scanner.nextDouble();
        if (x > 3) {
            System.out.println(1 / (x * x * x + 6));
        } else {
            System.out.println(x * x - 3 * x + 9);
        }

    }
}