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
        System.out.println(isPoz(0));
        System.out.println(isNegative(-5));
        String yourName = "Дима";
        hiName(yourName);
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

    public static String isPoz(int num){
        String str1 = "Число положительное";
        String str2 = "Число отрицательное";
        if (num>=0){
            return str1;
        } else {
            return str2;
        }
    }
     public static boolean isNegative(int num){
        if (num < 0){
            return true;
        }
        else {
            return false;
        }
     }
     public static void hiName (String name){
         System.out.println("Привет, " + name + '!');
     }
}