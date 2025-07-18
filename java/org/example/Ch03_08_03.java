package org.example;

import java.util.Scanner;

public class Ch03_08_03 {
    public static void main(String[] args) {
        //輸入整數，轉浮點數
        int x1, x2;
        double total;
        Scanner sc = new Scanner(System.in);
        System.out.println("input x1=");
        x1=sc.nextInt();
        System.out.println("input x2=");
        x2=sc.nextInt();
//        total=(x1+x2)/2;
        total=(double) (x1+x2)/2;
        total=((double)x1+(double)x2)/2;
        System.out.println("total="+total);
        sc.close();
    }
}
