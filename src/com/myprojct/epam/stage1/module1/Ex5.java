package com.myprojct.epam.stage1.module1;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter time in seconds (T): ");
        int t = sc.nextInt();

        System.out.println(secondsToTime(t));
    }

    private static String secondsToTime(int t) {
        int h = t / 3600;
        int m = (t - h * 3600) / 60;
        int s = (t - h * 3600 - m * 60);
        return String.format("%dч %dмин %dс", h, m, s);
    }
}
