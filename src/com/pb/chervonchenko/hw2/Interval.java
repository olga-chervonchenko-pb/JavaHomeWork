package com.pb.chervonchenko.hw2;

import java.util.Scanner;

public class Interval {

        public static void main(String[] args) {
            int x;

            Scanner result = new Scanner(System.in);
            System.out.print("Введите число: ");
            x = result.nextInt();

            if (x <=14) {
                System.out.println("Число попадает в промежуток 0-14");
            }
            else if (x >14 && x <= 35) {
                System.out.println("Число попадает в промежуток 15-35");
            }
            else if (x >35 && x <= 50) {
                System.out.println("Число попадает в промежуток 36-50");
            }
            else if (x >50 && x <= 100) {
                System.out.println("Число попадает в промежуток 51-100");
            }

            else {
                System.out.println("Число не попадает в нужные промежутки");
            }
        }
}
