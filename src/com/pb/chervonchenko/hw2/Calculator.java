package com.pb.chervonchenko.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.print("Введите 1ю переменную: ");
        operand1 = scan.nextInt();

        System.out.print("Введите 2ю переменную: ");
        operand2 = scan.nextInt();

        System.out.print("Введите знак операции(+ - * /): ");
        sign = scan.next();

        switch (sign) {
            case "+":
                System.out.println((operand1 + operand2));
                break;
            case "-":
                System.out.println((operand1 - operand2));
                break;
            case "*":
                System.out.println((operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("НА 0 ДЕЛИТЬ НЕЛЬЗЯ!!!");
                }
                System.out.println((operand1 / operand2));
                break;

            default: {
                System.out.println("Вы ввели неверный знак операции");
            }
        }
    }
}
