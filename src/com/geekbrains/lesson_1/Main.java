package com.geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {

        byte b = 17;
        short sh = 543;
        int in = 543;
        long lo = 123456789L;

        float fl = 123.45f;
        double dou = 123.45;

        char ch = 'a';
        String str = "Hello, everyone!";
        
        System.out.println(num(1,2,3,4));
    }

    static double num (int a, int b, int c, int d){
        double res = a * (b + ((double)c / d));
        return res;
    }
}