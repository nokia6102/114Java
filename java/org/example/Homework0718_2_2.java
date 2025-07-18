package org.example;
import java.util.Scanner;

public class Homework0718_2_2 {
    public static void main(String[] args) {
        double height,weight;
        double bmi;
        double m;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Please enter your height 身高 (cm)=");
            height=sc.nextInt();

            System.out.print("Please enter your weight 體重 (kg)=");
            weight=sc.nextInt();
            m = (double)height/100;
            bmi = weight / (m*m);
            System.out.println("BMI="+ bmi);
            //讓使用輸入身高(公分)及體重(公斤)，計算其BMI，並顯示在畫面上。
            // 若BMI=18.5～24顯示「BMI正常」，否則顯示「BMI異常」。(請使用「if~else」)
            System.out.print("BMI");
            if (bmi>=18.5 && bmi<=24)
            {
                System.out.println("正常");
            }else{
                System.out.println("異常");
            }
        } catch (Exception e) {
            System.out.println("Input error!");
        }
        sc.close();
    }
}
