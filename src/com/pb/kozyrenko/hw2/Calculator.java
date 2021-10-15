package com.pb.kozyrenko.hw2;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        double operand1;
        double operand2;
        String sign;
        double result;


        System.out.print("Введите первое числовое значение : ");
        operand1 = scan.nextDouble();

        System.out.print("Введите второе числовое значение : ");
        operand2 = scan.nextDouble();

        System.out.print("Введите тип выполняемой операции (+, -, *, /): ");
        sign = scan.next();

        switch(sign) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand1!=0 && operand2!=0) {
                result = operand1 / operand2;
                break;
                   }
        default:
                System.out.print("Ошибка, введите корретные данные");
                return;
        }
        System.out.print("\nРезультат:\n");
        System.out.print(operand1 + " " + sign + " " + operand2 + " = " + result);
    }
}