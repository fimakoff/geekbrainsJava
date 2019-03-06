package com.geekbrains.lesson_2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Задание №1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
            System.out.print(arr1[i] + "\t");
        }
        System.out.println('\n');

        // Задание №2
        int[] arr2 = new int[8];
        int i = 0;
        do {
            arr2[i] = i * 3;
            System.out.print(arr2[i] + "\t");
            i += 1;
        } while (i < arr2.length);
        System.out.println('\n');

        // Задание №3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int j = 0; j < arr3.length; j++) {
            if (arr3[j] < 6) arr3[j] = arr3[j] * 2;
            System.out.print(arr3[j] + " \t");
        }
        System.out.println('\n');

        // Задание №4
        int[][] arr4 = new int[5][5];
        for (int j = 0; j < arr4.length; j++) {
            for (int k = 0; k < arr4[j].length; k++) {
                if (j == k) arr4[j][k] = 1;
                System.out.print(arr4[j][k]);
            }
            System.out.println();
        }
        System.out.println();

        // Задание №5
        int[] arr5 = {48, 57, 89, 69, 7, 94, 49, 83, 60, 50};
        int max = 0, min = arr5[arr5.length - 1];
        for (int j = 0; j < arr5.length - 1; j++) {
            if (max < arr5[j]) max = arr5[j];
            if (min > arr5[j]) min = arr5[j];
        }
        System.out.println("Min = " + min + "; Max = " + max);
        System.out.println();

        // Задание №6
        int[] arr6 = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkBalance(arr6));

        // Задание №7
        int[] arr7 = {17,23,5,86,90};
        int n = 3;
        linearMoveElements(arr7, n);
        int[] arr8 = arr7;
        int m = -3;
        cur_cleMoveElements(arr8, m);

        // Доп.1
        int count=1;
        int index=1;
        while(index<99){
            index+=2;
            count++;
        }
        int[] arr9 = new int[count];
        int first = 1;
        System.out.println("\n");
        for (int j = 0; j < arr9.length; j++) {
            arr9[j]=first;
            first+=2;
            System.out.print(arr9[j]+" ");
        }

        // Доп.2
        System.out.println("\n");
        Random rand1 = new Random();
        int index2=15;
        int[] arr10 = new int[index2];
        int count_chet = 0;
        int count_nechet = 0;

        while(index2>0){
            int num = rand1.nextInt(10);
            arr10[index2-1]=num;
            index2--;
            System.out.print(arr10[index2]+" ");
            if(num%2==0) count_chet++;
            else count_nechet++;
        }
        System.out.println("\n" + "Четных: " + count_chet+" Нечётных: "+count_nechet);

        // Доп.3
        Random rand2 = new Random();
        Random rand3 = new Random();
        int index3=5;
        int[]arrAver1=new int[index3];
        int[]arrAver2=new int[index3];
        double summArrAver1=0;
        double summArrAver2=0;
        System.out.print("\narrAver1: ");
        for(int k=index3;k>0;k--){
            int num = rand2.nextInt(5);
            arrAver1[index3-k]=num;
            summArrAver1+=arrAver1[index3-k];
            System.out.print(arrAver1[index3-k]+" ");
        }
        System.out.println("\nСреднее арифметическое элементов массива ArrAver1: "+summArrAver1/index3);
        System.out.print("arrAver2: ");
        for(int k=index3;k>0;k--){
            int num = rand3.nextInt(5);
            arrAver2[index3-k]=num;
            System.out.print(arrAver2[index3-k]+" ");
            summArrAver2+=arrAver2[index3-k];
        }
        System.out.print("\nСреднее арифметическое элементов массива ArrAver2: "+summArrAver2/index3+"\n");
        if (summArrAver1!=summArrAver2){
            System.out.print("Среднее арифметическое больше для массива: ");
            if (summArrAver1>summArrAver2) System.out.println(" arrAver1");
            else System.out.println(" arrAver2");
        } else System.out.println("Среднее арифметическое одинаково для обоих массивов.");
    }
    private static boolean checkBalance(int[] arr) {
        int sumLeft, sumRight;
        for (int i = 0; i <= arr.length; i++) {
            sumLeft=0;sumRight=0;
            for (int j = 0; j < i; j++) sumLeft += arr[j];
            for (int k = arr.length-1; k >= arr.length-(arr.length-i); k--) sumRight += arr[k];
            //System.out.println(sumLeft + "\t" + sumRight);
            if (sumLeft == sumRight) return true;
        }
        return false;
    }
    private static void linearMoveElements(int[] arr, int n){
        int size=arr.length;
        System.out.println("\nИсходный массив (линейный сдвиг):");
        for (int i = 0; i < size; i++) System.out.print(arr[i] + "\t");
        if(n > 0){
            for (int i = 0; i < n ; i++) {
                for (int j = size-1; j > 0; j--) arr[j] = arr[j - 1];
                arr[0]=0;
            }
        }else if(n < 0) {
            for (int i = n + 1; i <= 0; i++) {
                for (int j = 1; j <= size-1; j++) arr[j - 1] = arr[j];
                arr[size-1]=0;
            }
        }
        System.out.println("\nИзмененный массив (линейный сдвиг):");
        for (int i = 0; i < size; i++) System.out.print(arr[i] + "\t");
    }
    private static void cur_cleMoveElements(int[] arr, int m) {
        int temp, size=arr.length;
        System.out.println("\nИсходный массив (круговой сдвиг):");
        for (int i = 0; i < size; i++) System.out.print(arr[i] + "\t");
        if(m > 0){
            for (int i = 0; i < m ; i++) {
                temp = arr[size-1];
                for (int j = size-1; j > 0; j--) arr[j] = arr[j - 1];
                arr[0]=temp;
            }
        }else if(m < 0) {
            for (int i = m + 1; i <= 0; i++) {
                temp = arr[size - 1];
                arr[size - 1] = arr[0];
                for (int j = 1; j < (size - 1); j++) arr[j - 1] = arr[j];
                arr[size - 2] = temp;
            }
        }
        System.out.println("\nИзмененный массив (круговой сдвиг):");
        for (int i = 0; i < size; i++) System.out.print(arr[i] + "\t");
    }
}
