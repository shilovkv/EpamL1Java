package com.myprojct.epam.module1;

import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter number nnn.ddd: ");
        double n = sc.nextDouble();
        int nnn = (int)n;
        double ddd = n - nnn;
        System.out.println((int)(ddd * 1000) + (double)nnn / 1000);
    }
}