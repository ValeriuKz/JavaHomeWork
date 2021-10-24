package com.pb.kozyrenko.hw4;

import java.util.Scanner;

public class CapitalLetter {
    Scanner scanner = new Scanner(System.in);

    static String met1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку требующую редактирования:");
        String met1 = scanner.nextLine();
        return met1;
    }

    public static void main(String[] args) {

        String s1 =met1(), s2 = "";
        s2 = s2 + s1.substring(0, 1).toUpperCase();
        for (int i = 1; i < s1.length(); i++) {

            if (" ".equals(s1.substring(i - 1, i)))
                s2 = s2 + s1.substring(i, i + 1).toUpperCase();
            else
                s2 = s2 + s1.substring(i, i + 1);
        }
        System.out.println(s2);
    }
}