package com.sunanda;

public class Flipcoin {
    int  isCoin=1;
    int count1=0;
    int count2=0;
    int randomCheck =(int) Math.floor(Math.random())%2;
    void count()
    {
        for (int i=1;i<=100;i++)
        {
            if (isCoin == randomCheck)
            {
                System.out.println("Head is occurs");
                count1++;
            }
            else
            {
                System.out.println("tail is occurs");
                count2++;
            }
        }
        System.out.println("Head Percentage of occuring:- "+count1);
        System.out.println("tail Percentage of occuring:- "+count2);
    }
}
class Percentage
{
    public static void main(String[] args)
    {
        Flipcoin ob= new Flipcoin();
        ob.count();
    }
}
