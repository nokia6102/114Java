package org.example;

public class Ch04_03 {
    public static void main(String[] args) {
        int x = 18;
        int y = 9;
        System.out.println("18 > 9     = " + (x > y));
        System.out.println("18 < 9     = " + (x < y));
        System.out.println("18 >= 18   = " + (x >= x));
        System.out.println("18 <= 18   = " + (x <= x));

        System.out.println("18 == 18   = " + (x == x));
        System.out.println("18 == 9    = " + (x == y));

        //字元大小寫有區分
        System.out.println("'x' == 'X' = " + ('x' == 'X'));

        System.out.println("18 != 18   = " + (x != x));
        System.out.println("18 != 9    = " + (x != y));

        System.out.println("'x' != 'X' = " + ('x' != 'X'));
    }
}
