package org.example;


import java.util.Scanner;

public class Ch03_08_01 {
    public static void main(String[] args) {
        int x1,x2, total;
        Scanner sc = new Scanner(System.in);

        System.out.println("x1=");
        x1 = sc.nextInt();
        System.out.println("x1 result="+x1);

        System.out.println("x2=");
        x2 = sc.nextInt();
        System.out.println("x2 result="+x2);
        total= x1+x2;
        System.out.println("toal result="+total);
        sc.close();
    }
}
