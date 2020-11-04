package com.myprojct.epam.module2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter A and B: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print("Please enter x, y and z: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (((x < a && y < b) || (x < b && y < a)) ||
        ((x < a && z < b) || (x < b && z < a)) ||
        ((y < a && z < b) || (y < b && z < a))) {
            System.out.println("The brick is smaller than the window");
        } else {
            System.out.println("The brick is bigger than the window");
        }
    }
    
}
