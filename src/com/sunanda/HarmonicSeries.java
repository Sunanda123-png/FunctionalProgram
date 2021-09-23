package com.sunanda;

public class HarmonicSeries {
    public static void main(String[] args)
    {
        int n=7;
        int hp=0;
        int num;
        for( num=1;num<n;num++)
        {
            hp=hp+(1/num);
            System.out.println(hp);

        }
        System.out.println(hp);
    }
}
