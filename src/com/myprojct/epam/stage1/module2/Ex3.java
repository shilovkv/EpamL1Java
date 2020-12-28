package com.myprojct.epam.stage1.module2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter x1 and y1:");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("Please enter x2 and y2:");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print("Please enter x3 and y3:");
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        if ((y3 - y1) * (x2 - x1) == (y2 - y1) * (x3 - x1)) {
            System.out.println("Points are on one line");
        } else {
            System.out.println("Points are NOT on one line");
        }
    }
}