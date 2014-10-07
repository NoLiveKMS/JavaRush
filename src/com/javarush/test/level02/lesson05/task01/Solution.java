package com.javarush.test.level02.lesson05.task01;

/**
 * Created by noliv_000 on 07.10.2014.
 */
/* Не бейте меня!
Напиши программу, которая выводит на экран надпись «Не бейте меня!.. Я предам кого угодно!» 3 раза.
*/
public class Solution
{
    public static void main(String[] args)
    {
        //текст сливается в одну строку, должно быть три строки
        //исправь эту ошибку

        String s1 = "Не бейте меня!.. ";
        String s2 = "Я предам кого угодно!";

        for (int i = 0; i < 3; i++)
        {
            System.out.print(s1);
            System.out.print(s2+"\n");
        }
    }
}