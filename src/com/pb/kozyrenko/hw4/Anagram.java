package com.pb.kozyrenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static String met1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String met1 = scanner.nextLine();
        return met1;
    }

    static String met2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку с которой нужно сверить первую, на предмет анаграммы:");
        String met2 = scanner.nextLine();
        return met2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first=met1().replaceAll("\\s", "" );
        String second=met2().replaceAll("\\s", "");

        String first2=first.replaceAll("\\p{Punct}", "");
        String second2=second.replaceAll("\\p{Punct}", "");

        String a=first2.toLowerCase();
        String b=second2.toLowerCase();



        boolean status = true;
        if (a.length()!=b.length()){
            status=false;
        }
        else{
        char[] aArr=a.toCharArray();
        char[] bArr=b.toCharArray();
        Arrays.sort(aArr);
        Arrays.sort(bArr);
        status=Arrays.equals(aArr,bArr);

        }
        if(status){
            System.out.println("Это анаграммы");
        }
        else
            System.out.println("Это не анаграммы");

    }

}