package com.sunanda;

public class VowelorConsonent {
    public static void main(String[] args)
    {
        char ch='A';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' &&ch <= 'Z')) {
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
                System.out.println(ch + " is Vowel.");
            else
                System.out.println(ch + " is Consonant.");
        }
        else
            System.out.println("Neither vowel nor consonant.");
    }
}
