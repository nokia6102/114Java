// https://youtu.be/QmDPhvJXt2c
package org.example;

import java.util.Scanner;

public class CH05_07 {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入分數:");
        score = sc.nextInt();

//        if (score>=90) {
//            System.out.println("Level A");
//        }else if (score>=80){
//            System.out.println("Level B");
//        }else if (score>=70){
//            System.out.println("Level C");
//        }else { //x<70
//            System.out.println("Level F");
//        }

        char r;
        r = (score>=90)?'A':(score>80)?'B':(score>70)?'C':'D';
        System.out.println("Level "+r);

        sc.close();
        //90,89,80,79,79,69,69,59
    }
}
