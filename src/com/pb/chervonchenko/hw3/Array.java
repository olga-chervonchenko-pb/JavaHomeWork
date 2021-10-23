package com.pb.chervonchenko.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int array[] = new int[10];
        int sum = 0;
        int countNegative = 0;
        int countPositive = 0;
        int sort;

        System.out.println("Введите 1е число==>");
        for (int i = 0; i < 1; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 2е число==>");
        for (int i = 1; i < 2; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 3е число==>");
        for (int i = 2; i < 3; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 4е число==>");
        for (int i = 3; i < 4; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 5е число==>");
        for (int i = 4; i < 5; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 6е число==>");
        for (int i = 5; i < 6; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 7е число==>");
        for (int i = 6; i < 7; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 8е число==>");
        for (int i = 7; i < 8; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 9е число==>");
        for (int i = 8; i < 9; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println("Введите 10е число==>");
        for (int i = 9; i < 10; i++) {
            array[i] = scan.nextInt();
        }
        System.out.print("Вы ввели такие числа:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + array[i]);
        }

        for (int num : array) {
            sum = sum + num;
        }
        System.out.println("\nСумма элементов массива равна: " + sum);


        for (int value : array) {
            if (value < 0) {
                countNegative++;
            } else if (value > 0) {
                countPositive++;
            } else {
                break;
            }
        }

        System.out.println("Положительные числа:" + countPositive);

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    sort = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sort;
                }
            }
        }
        System.out.println("Сортировка от меньшего к большему:" );
        System.out.println(Arrays.toString(array));

        System.out.println();
    }
}
