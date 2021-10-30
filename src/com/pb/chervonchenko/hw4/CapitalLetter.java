package com.pb.chervonchenko.hw4;

import java.util.Scanner;
import java.util.stream.Stream;

public class CapitalLetter {

     public static void main(String[] args) {
         System.out.println("Введите любой текст:");
         Scanner scanner = new Scanner(System.in);
         String abc = scanner.nextLine();
         char[] itog = abc.toCharArray();

         itog[0] = Character.toUpperCase(itog[0]);
         for (int i = 0; i < itog.length - 1; i++) {
             if (itog[i] == ' ') {
                 itog[i + 1] = Character.toUpperCase(itog[i + 1]);
             }
         }
         abc = new String(itog);
         printLetter(abc);
     }

    private static void printLetter(String abc) {
        System.out.println(abc);
    }
}

