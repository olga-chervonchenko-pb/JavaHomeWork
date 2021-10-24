package com.pb.chervonchenko.hw3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random numero = new Random();

        int x = numero.nextInt(101);
        //System.out.println("Загаданное число: " + x); //это я для себя добавляла

        Scanner scan = new Scanner(System.in);
        int y;
        int count = 1;

        System.out.println("Угадайте число в диапазоне с 0 до 100. Проверьте свою удачу! ");
        System.out.println("Если захотите закончить игру, введите число 200. ");
        System.out.print("Введите число ==> ");
        y = scan.nextInt();

        while (y != x) {

            count++;
            if (y > x) {
                System.out.println("Попробуйте еще раз свою удачу,загаданное число меньше введенного" + ":");
            }
            if (y < x)
                System.out.println("Попробуйте еще раз свою удачу,загаданное число больше введенного" + ":");
            y = scan.nextInt();

            if (y == 200) {
                System.out.println("Вы завершаете игру.До свидания!");
                break;
            }
        }

        if (y == x) {
            System.out.println("Поздравляем, Вы угадали c " + count + " попыток");
        }
        System.out.println("Конец игры!");

    }
}
