package org.example;

import java.util.Scanner;

public class Ch05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("請輸入任意整數");
        x = sc.nextInt();

//        if (x<0)
//            System.out.println("絕對值為："+x);
//        else
//            System.out.println("絕對值為："+ -x);

        x = (x>0) ? x:-x;
        System.out.println("絕對值為："+ x);
        sc.close();

    }
}
