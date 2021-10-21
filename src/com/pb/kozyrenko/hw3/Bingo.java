package com.pb.kozyrenko.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Было загадано числа в диапазоне от 0 до 100, отгадайте его!");
        System.out.println("Для выхода из программы введите - 666.");


        int attempt = 0;
        int exid = 666;
        int number = random.nextInt(101);


        while (true) {
            attempt++;
            System.out.println("Попытка " + attempt + ":");
            int val = in.nextInt();

            if (val == exid) {
                break;
            }

            if (val < number) {
                System.out.println( "Ваше число меньше чем то, что было загадано.");
            }
            if (val > number) {
                System.out.println( "Ваше число больше чем то, что было загадано.");
            }

            if (val != number) {
                continue;
            }

            System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
            break;
        }

        System.out.println("Конец игры!");

    }
}
