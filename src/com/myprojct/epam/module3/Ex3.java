package com.myprojct.epam.module3;

public class Ex3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.printf("The answer is: %d", sum);
    }
}