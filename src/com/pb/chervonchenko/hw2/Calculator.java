package com.pb.chervonchenko.hw2;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int operand1;
        int operand2;
        int otvet;
        char itog;

        Scanner result = new Scanner(System.in);
        System.out.print("Введите 1ю переменную: ");
        operand1 = result.nextInt();
        System.out.print("Введите 2ю переменную: ");
        operand2 = result.nextInt();
        System.out.print("Введите знак операции (+, -, *, /): ");
        itog = result.next().charAt(0);

        switch (itog) {
            case '+':
                otvet = operand1 + operand2;
                break;
            case '-':
                otvet = operand1 - operand2;
                break;
            case '*':
                otvet = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    System.out.println("На 0 делить нельзя!!!");
                }
                otvet = operand1 / operand2;
                break;
            default:
                System.out.print("Вы ввели неверный арифмитический знак");
                return;
        }

            System.out.print("Ответ:");
            System.out.print(operand1 + " " + itog + " " + operand2 + " = " + otvet);
        }


}
