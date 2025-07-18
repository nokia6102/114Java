// https://youtu.be/gEShAhw71zk
package org.example;

import java.util.Scanner;

public class Ch05_01 {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);

        System.out.println("your age:");
        age = sc.nextInt();

        if (age<20){
            System.out.println("Your age is too small");
        }

        //一行可省略
        if (age<20) System.out.println("Your age is too small");

        if(age<20)
            System.out.println("Your age is too small");

        sc.close();
    }
}
