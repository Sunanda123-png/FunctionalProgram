package com.sunanda;

public class EvenOddNumber {
    int num;
    EvenOddNumber()
    {
        num=0;
    }
    EvenOddNumber(int x)
    {
        num=x;
    }
    void check()
    {
        if (num%2==0)
            System.out.println(num+" is Even Number.");
        else
            System.out.println(num+" is Even Number.");
    }

}
class  Test
{
    public static void main(String[] args)
    {
        EvenOddNumber ob=new EvenOddNumber(44);
        ob.check();
    }
}
