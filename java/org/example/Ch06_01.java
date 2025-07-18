// https://youtu.be/zjIHo4KuhW0
package org.example;

public class Ch06_01 {
    public static void main(String[] args) {
        int sum1;
        sum1 = 1+2+3+4+5+6+7+8+9+10;
        System.out.println("sum1="+sum1);
        ////////////////////////////
        //1+2+3+4+5....+10
        int sum2=0;
        for (int i=1;i<=10;i++)
        {
            sum2+=i;   //sum2=sum2+i
        }
        System.out.println("總和"+sum2);
        ////////////////////////////
        //1+3+5+7+9+11
        int sum3=0;
        for (int i=1;i<=11;i+=2)
        {
            sum3+=i;   //sum2=sum2+i
        }
        System.out.println("總和"+sum3);
        ////////////////////////////
        //11+9+7+5+3+1
        int sum4=0;
        for(int i=11;i>=1;i-=2){
            sum4+=i; //sum4=sum4+i
        }
        System.out.println("總和"+sum4);

    }
}
