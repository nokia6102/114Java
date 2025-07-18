package org.example;

public class Ch06_01 {
    public static void main(String[] args) {
        int sum1;
        sum1 = 1+2+3+4+5+6+7+8+9+10;
        System.out.println("sum1="+sum1);
        ////////////////////////////
        //1+2+3+4+5
        int sum2=0;
        for (int i=1;i<=5;i++)
        {
            sum2+=i;   //sum2=sum2+i
        }
        System.out.println("總和"+sum2);

    }
}
