package org.example;

import java.util.Scanner;

public class Ch04_01 {
    public static void main(String[] args) {
//        int x1 = 9 % 5;
//        System.out.println("x1="+x1);
//        int students = 20;
//        int grapes = 98;
//        int count = grapes / students; //生調件捨去，每人分幾顆
//        int left = grapes % students;
//

        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入學生數量");
        int students = sc.nextInt();
        int grapes = 98;
        int count = grapes / students;
        int left = grapes % students;
        System.out.println("每人分幾顆"+count);
        System.out.println("剩下幾顆"+left);
        sc.close();;
    }
}
