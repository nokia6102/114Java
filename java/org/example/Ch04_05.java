package org.example;

public class Ch04_05 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println("第1次:"+num);   //1

        num = num + 1;
        System.out.println("第2次:"+num);   //2

        num++; //num = num+1
        System.out.println("第3次:"+num);   //3

        System.out.println("第4次:"+ ++num); // num=num+1 , 4


        System.out.println("第5次:"+ num++); // num=num+1 ,4

        System.out.println("第6次:"+ num); // num=num+1

        num--; //num=num-1
        System.out.println("第7次:"+ num); // 4

        num--;  //3
        System.out.println("第8次:"+ --num); //2

        num+=12;
        System.out.println("第9次:"+num); //14

        num/=14;
        System.out.println("第10次:"+num); //1

    }
}
