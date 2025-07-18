package org.example;

public class Ch03_03 {
    public static void main(String[] args) {
        int x1;
        long y1;
        x1 = 103;
        y1 = 1000003;
        x1 = 104;

        System.out.println("x1="+x1);
        System.out.println("y1="+y1);

        double x3;
        x3 = 1.05;

        System.out.println("x3="+x3);

        x3 = .789;
        System.out.println("x3="+x3);

        x3 = 1.29E-2;
        System.out.println("x3="+x3);

        System.out.println("....3.....");
        float x4,y4,z4;
        float x5;
        float y5;
        float z5;
//double 大放小爆掉
        x4 = 1.05f;
        x4 = 1.05F;
        System.out.println("x4="+x3);

//        z4=1.05+0.789;  //預設型態double+double=double
        z4=1.05f+0.789f;  //預設型態double+double=double
        z4=(float)(1.05+0.789);

        System.out.println("z4="+z4);
    }
}
