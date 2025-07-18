// https://youtu.be/Koq-PlHvPhg
package org.example;

public class Ch04_07 {
    public static void main(String[] args) {
        //自動轉型，小變大
        System.out.println(".........1........");
        byte b1;
        int x1;
        float f1;
        double d1;
        b1=10;
        System.out.println(("b1="+b1));
        x1=b1;  //byte to int
        System.out.println(("x1="+x1));
        f1=x1;  //int to float
        System.out.println(("f1="+f1));
        d1=x1;  //int to double
        System.out.println(("d1="+d1));
        d1=f1;  //float to double
        System.out.println(("d1="+d1));

        //強迫轉換，大變小
        System.out.println(".........2.........");
        int x2;
        float f2;
        double d2;

        //f2 -- 20.0 double to float ,error
        f2 = (float) 20.3;
        x2 = (int) f2;
        System.out.println("x2="+x2);

        System.out.println(".........3.........");
        int x3 = 25;
        int x4 = 9;
        System.out.println("x3/x4"+x3/x4); //運算過程會轉成int,無調件捨去
        System.out.println("x3/x4"+x3/(float)x4); //運算過程會轉成float
        System.out.println("x3/x4"+x3/(double)x4); //運算過程會轉成double
        System.out.println("x3/x4"+(double)x3/(double)x4); //運算過程會轉成double

    }
}
