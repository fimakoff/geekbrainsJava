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
        System.out.println(isTrue(10,11));
        System.out.println(isPozitive(2));
    }

    static double num (int a, int b, int c, int d){
        double res = a * (b + ((double)c / d));
        return res;
    }

    public static boolean isTrue (int a, int b){
        boolean sumIsTrue;
        int sum = a + b;
        if(sum > 10 && sum <= 20){
            sumIsTrue = true;
        } else {
            sumIsTrue = false;
        }
        return sumIsTrue;
    }

    public static boolean isPozitive(int num){
        if (num>=0){
            return true;
        } else {
            return false;
        }
    }
}