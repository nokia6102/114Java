package org.example;

import java.util.Scanner;

public class Ch05_04 {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入分數:");
        score = sc.nextInt();
        if (score>=90) {
            System.out.println("Level A");
        }else if (score>=80){
            System.out.println("Level B");
        }else if (score>=70){
            System.out.println("Level C");
        }else if (score>=60){
            System.out.println("Level D");
        }else{
            System.out.println("Level F");
        }
        sc.close();
        //90,89,80,79,79,69,69,59
    }
}
