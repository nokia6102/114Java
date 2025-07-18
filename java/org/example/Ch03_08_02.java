package org.example;

import java.util.Scanner;

public class Ch03_08_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //輸入浮點數
        System.out.println("num1=");
        double num1 = sc.nextDouble();
        System.out.println("num2=");
        double num2 = sc.nextDouble();
        double total = num1+num2;
        System.out.println("total="+total);
        sc.close();
    }
}
