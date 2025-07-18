package org.example;

import java.util.Scanner;

public class Homework0718_2_1 {
    public static void main(String[] args) {
        //1、由鍵盤輸入數字，判斷奇偶數，並顯示在畫面上(請使用「if~else」與「?」)。
        System.out.print("請輸整數:");
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            if (x % 2 == 1)
                System.out.print("奇");
            else
                System.out.print("偶");
            System.out.println("數");
        } catch (Exception e) {
            System.out.println("資料輸入錯誤");
        }
        sc.close();
    }
}
