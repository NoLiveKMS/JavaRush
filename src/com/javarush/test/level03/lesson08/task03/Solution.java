package com.javarush.test.level03.lesson08.task03;

/**
 * Created by noliv_000 on 16.10.2014.
 */
/* Скромность украшает человека
Ввести с клавиатуры имя и вывести надпись:
name зарабатывает $5,000. Ха-ха-ха!
Пример: Тимур зарабатывает $5,000. Ха-ха-ха!
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");

    }
}