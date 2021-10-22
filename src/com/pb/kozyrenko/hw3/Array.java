package com.pb.kozyrenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        System.out.println("Введите число:");
        for(int i=0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        for(int num : array)
        {
            sum = sum+num;}
        System.out.println("Сумма элементов массива равна: " + sum);

        int pos = 0;
        int neg = 0;

        for(int i = 0; i < array.length; i++) {
            if (array[i] < 0)   {
                neg++;
            }
            else {
                pos++;
            }
        }
        System.out.println("отрицательных: " + neg + ", положительных: " + pos);



        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


