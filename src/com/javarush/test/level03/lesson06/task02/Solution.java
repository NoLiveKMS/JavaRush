package com.javarush.test.level03.lesson06.task02;

/**
 * Created by noliv_000 on 15.10.2014.
 */
/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++){

            for (int j = 1; j <= 10; j++){
                System.out.print((i*j) + " ");
            }
            System.out.println();
        }

    }
}