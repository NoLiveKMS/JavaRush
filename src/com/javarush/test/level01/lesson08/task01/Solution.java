package com.javarush.test.level01.lesson08.task01;

/**
 * Created by noliv_000 on 07.10.2014.
 */
/* Итак, я богат.
Напиши программу, которая выводит на экран надпись: «Итак, я богат. Пока, неудачники! Я вас всегда ненавидел.» 9 раз.
*/
public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("Итак, я богат. Пока, неудачники! Я вас всегда ненавидел.");
            }
        }
    }
}
