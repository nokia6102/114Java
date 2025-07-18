package org.example;

import java.util.Scanner;

public class Homework0717_02 {
    public static void main(String[] args) {
        double height,weight;
        double bmi;
        double m,avg;
        Scanner sc = new Scanner(System.in);
        try {

            System.out.print("Please enter your height 身高 (cm)=");
            height=sc.nextInt();

            System.out.print("Please enter your weight 體重 (kg)=");
            weight=sc.nextInt();
            m = (double)height/100;
            avg = weight / (m*m);
            System.out.print("BMI="+ avg);

        } catch (Exception e) {
            System.out.println("Input error!");
        }
        sc.close();
    }
}
