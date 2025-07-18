package org.example;

import java.util.Scanner;

public class Homework0717_01 {
    public static void main(String[] args) {
        int math,chinese,english;
        double avg;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Math=");
            math=sc.nextInt();
            System.out.print("Chinese=");
            chinese=sc.nextInt();
            System.out.print("English=");
            english=sc.nextInt();
            avg=(double)(math+chinese+english)/3;
            System.out.print("AVG="+avg);

        } catch (Exception e) {
            System.out.println("Input error!");
        }
        sc.close();
    }
}
