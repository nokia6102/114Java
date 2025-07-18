// https://youtu.be/gEShAhw71zk
package org.example;

import java.util.Scanner;

public class Ch05_02 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("your age:");
        age = sc.nextInt();

        if (age<20){
            System.out.println("Your age too small");
        }else{
            System.out.println("Welcome");
        }

        if (age<20)
            System.out.println("Your age too small");
        else
            System.out.println("Welcome");

        ////////////////////////////
        int x;
        System.out.println("請輸入任意整數");
        x = sc.nextInt();
        if (x<0)
            System.out.println("絕對值為："+x);
        else
            System.out.println("絕對值為："+ -x);


        sc.close();
    }
}
