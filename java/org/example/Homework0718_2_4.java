package org.example;

import java.util.Scanner;

public class Homework0718_2_4 {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入分數:");
        score = sc.nextInt();
//4、請將「ch05_04」程式如下修正，改成使用條件運算子「?」寫法。
        char r;
        r = (score>=90)?'A':(score>=80)?'B':(score>=70)?'C':(score>=60)?'D':'F';
        System.out.println("Level "+r);

        sc.close();
    }
}
