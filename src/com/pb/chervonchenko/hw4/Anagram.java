package com.pb.chervonchenko.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String first = in.nextLine().toUpperCase();


        System.out.print("Введите вторую строку: ");
        String second = in.nextLine().toUpperCase();

        String result = itAnagram(first, second);
        System.out.println(result);
    }

    private static String itAnagram(String first, String second) {
        if (first == null || second == null
                || first.equals("") || second.equals("")
                || !first.matches("[А-Яа-я,A-Za-z,. ]+")
                || !second.matches("[А-Яа-я,A-Za-z. ]+")) {
            return "Это не анаграмма.";
        }
        String answer = "";

        String uno = first.replaceAll("[,. ]+", "");
        String dos = second.replaceAll("[,. ]+", "");

        if (uno.equals("") || dos.equals("")) {
            return "Это не анаграмма.";
        }

        char[] arrayUno = uno.toCharArray();
        char[] arrayDos = dos.toCharArray();
        Arrays.sort(arrayUno);
        Arrays.sort(arrayDos);

        if (Arrays.equals(arrayUno, arrayDos)) {
            answer = "Это анаграмма.";
        } else {
            answer = "Это не анаграмма.";
        }
        return answer;
    }
}
