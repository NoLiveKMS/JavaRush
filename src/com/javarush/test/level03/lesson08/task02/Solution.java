package com.javarush.test.level03.lesson08.task02;

/**
 * Created by noliv_000 on 16.10.2014.
 */
/* Зарплата через 5 лет
Ввести с клавиатуры Имя и два числа, вывести надпись:
name1 получает «число1» через «число2» лет.
Пример: Коля получает 3000 через 5 лет.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int mony = Integer.parseInt(reader.readLine());
        int age = Integer.parseInt(reader.readLine());

        System.out.println(name + " получает " + mony + " через " + age + " лет.");

    }
}