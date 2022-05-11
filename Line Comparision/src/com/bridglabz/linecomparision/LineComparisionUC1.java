package com.bridglabz.linecomparision;

import java.util.Scanner;

public class LineComparisionUC1 {
    public static void main(String args[]) {

        int x1, y1, x2, y2;
        double length;

        System.out.println("Enter the values of co-ordinates : ");
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length Of Line : " + length);
    }
}
