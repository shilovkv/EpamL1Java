package com.myprojct.epam.module1;

import java.util.Scanner;

public class Ex6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (x >= -2 && x <= 2 && y >= 0 && y <= 4));
    }
}
