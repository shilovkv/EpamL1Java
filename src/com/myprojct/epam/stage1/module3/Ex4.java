package com.myprojct.epam.stage1.module3;

import java.math.BigInteger;

public class Ex4 {
    public static void main(String[] args) {
        BigInteger mult = new BigInteger("1");
        for (int i = 1; i <= 200; i++) {
            mult = mult.multiply(BigInteger.valueOf(i * i));
        }
        System.out.printf("The answer is: %d", mult);
    }
}