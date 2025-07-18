package org.example;

import java.util.Scanner;

public class Homework0718_2_3 {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入分數:");
        score = sc.nextInt();

        if (score>100 || score <0) {
            System.out.println("格式錯誤");
        }else {
            System.out.println(score / 10);
            switch (score / 10) {
                case 9:
                    System.out.println("Level A");
                    break; //不可以沒有
                case 8:
                    System.out.println("Level B");
                    break;
                case 7:
                    System.out.println("Level C");
                    break;
                case 6:
                    System.out.println("Level D");
                    break;
                default:
                    System.out.println("Level F");
                    break;
            }
        }
        sc.close();
    }
}
