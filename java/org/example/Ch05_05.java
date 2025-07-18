// https://youtu.be/rrPUwCBkGfk
package org.example;

import java.util.Scanner;

public class Ch05_05 {
    public static void main(String[] args) {
        //票值100
        //大於等於80歲，小於等於6歲=>2折
        //79~60歲，12歲~7歲=>5折
        //其他不打折

        double price;
        int age;
        final int ticket = 100;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = sc.nextInt();
    //        System.out.println("age="+age);
        if (age>=80 || age<=6){
            price = ticket *0.2; //2折
        }else if (age>=60 || age<=12){
            price = ticket*.5; //5折
        }else{
            price = ticket;
        }

        System.out.println("ticket price is:"+price);

        sc.close();
        //80,6,79,60,12,7,13,59
    }
}
