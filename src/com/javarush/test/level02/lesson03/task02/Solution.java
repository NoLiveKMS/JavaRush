package com.javarush.test.level02.lesson03.task02;

/**
 * Created by noliv_000 on 07.10.2014.
 */
/* Кто любимый мамочкин робот?
Напиши программу, которая выводит на экран надпись: «Кто любимый мамочкин робот?» 7 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        //вместо 1 поставь любую цифру от 2 до 5, это действие называется "передать аргумент"
        //запусти программу и посчитай количество выведенных строк
        //передай правильный аргумент
        print(7);
    }

    private static void print(int n) //этот метод выводит n строк
    {
        for (int i = 0; i < n; i++)
        {
            System.out.println("Кто любимый мамочкин робот?");
        }
    }
}