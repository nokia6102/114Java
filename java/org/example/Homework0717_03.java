package org.example;

import java.util.Scanner;

public class Homework0717_03 {
    public static void main(String[] args) {
        int w1,w2,w3;
        int h1,h2,h3;

        double avgH,avgW;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Please enter 第1人身高 (cm)=");
            h1=sc.nextInt();
            System.out.print("Please enter 第2人身高 (cm)=");
            h2=sc.nextInt();
            System.out.print("Please enter 第3人身高 (cm)=");
            h3=sc.nextInt();

            System.out.print("Please enter 第1人體重 (kg)=");
            w1=sc.nextInt();
            System.out.print("Please enter 第2人體重 (kg)=");
            w2=sc.nextInt();
            System.out.print("Please enter 第3人體重 (kg)=");
            w3=sc.nextInt();

            avgW=(double)(w1+w2+w3)/3;
            avgH=(double)(h1+h2+h3)/3;

            System.out.print("平均身高="+avgH);
            System.out.print("平均體重="+avgW);

        } catch (Exception e) {
            System.out.println("Input error!");
        }
        sc.close();
    }
}
