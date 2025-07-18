// https://youtu.be/oy-QvdlgvRs
package org.example;

import java.util.Scanner;

public class Ch04_08 {
    public static void main(String[] args) {
        String str1,str2;
        int num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入整數:");
        str1 = sc.next();
        System.out.println("輸入浮點數:");
        str2 = sc.next();

        num1 = Integer.parseInt(str1);      //string to int
        num2 = Double.parseDouble(str2);    //string to double

        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
        System.out.println("num1+num2="+(num1+num2));

    }
}
