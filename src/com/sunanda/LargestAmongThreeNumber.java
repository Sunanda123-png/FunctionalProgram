package com.sunanda;

public class LargestAmongThreeNumber {
    public static void main(String[] args)
    {
        int a=5;
        int b=10;
        int c=15;
        if (a>b && a>c)
            System.out.println("Largest number:"+a);
        if (b>a && b>c)
            System.out.println("Largest number:"+b);
        if (c>a && c>b)
            System.out.println("Largest number:"+c);
    }
}
