package org.example;

public class Ch06_02 {
    public static void main(String[] args) {
        //1+2+3.....+10
        int sum1=0;
        int i=1;
        while (i<=5){
            sum1+=i; //sum1=sum1+i
            i++;
        }
        System.out.println("總和"+sum1);
    }
}
