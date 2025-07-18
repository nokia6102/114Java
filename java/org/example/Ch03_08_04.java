package org.example;

import java.util.Scanner;

public class Ch03_08_04 {
    public static void main(String[] args) {
        int num1, num2;
        double avg;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("num1:");
            num1 = sc.nextInt();
            System.out.print("num2:");
            num2 = sc.nextInt();
            System.out.print("avg2:");
            avg = (double) (num1 + num2) / 2;
            System.out.println("avg:" + avg);
        } catch (Exception e){
            System.out.println("Input error!");
        }
        sc.close();
    }
}
