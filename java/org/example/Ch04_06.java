package org.example;
// https://youtu.be/JOs0_o8MyFE 
public class Ch04_06 {
    public static void main(String[] args) {
        char ch='X';
        short s = -5;
        int i=6;
        float f=9.7f;
        double d=1.76;
        System.out.println(ch+0);       //轉成整數
        System.out.println(ch+s);       //char to int
        System.out.println((s*ch)-(d/f)*(i+f));
    }
}
