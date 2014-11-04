package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a < b) {
            if (b < c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + a + " " + c);
            }

        } else if (b < c) {
            if (a < c) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }else {
            System.out.println(a +" "+ b +" " +c);
        }
    }
}

