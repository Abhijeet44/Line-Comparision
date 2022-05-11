package com.bridglabz.linecomparision;

import java.util.Scanner;

public class LineComparisionUC2 {
    public static void main(String args[]) {

        int x1, y1, x2, y2, x3, y3, x4, y4;
        Double L1;
        Double L2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of x1, x2, x3, x4 : ");
        x1 = sc.nextInt();
        x2 = sc.nextInt();
        x3 = sc.nextInt();
        x4 = sc.nextInt();
        System.out.println("Enter the values of y1, y2, y3, y4 : ");
        y1 = sc.nextInt();
        y2 = sc.nextInt();
        y3 = sc.nextInt();
        y4 = sc.nextInt();

        L1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        L2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

        if (L1.equals(L2)) {

            System.out.println("Both Lines are equal");
        } else {
            System.out.println("Both Lines are NOT equal");
        }
    }
}
