package com.javarush.test.level02.lesson05.task02;

/**
 * Created by noliv_000 on 07.10.2014.
 */
/* Пока я командую...
Напиши программу, которая выводит на экран надпись «Пока я командую, любая миссия суицидальная».
*/
public class Solution
{
    public static void main(String[] args)
    {
        //исправьте порядок вывода слов
        String[] words = new String[] {"Пока ", "я ", "командую, ", "любая ", "миссия ","суицидальная"};

        for (int i = 0; i < words.length; i++)
        {
            System.out.print(words[i]);
        }
    }
}