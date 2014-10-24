package com.javarush.test.level03.lesson04.task04;

/**
 * Created by noliv_000 on 15.10.2014.
 */
/* Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
Подсказка: будет три миллиона с хвостиком.
*/

public class Solution
{
    public static void main(String[] args)
    {
        int temp = 0;

        for (int i = 1; i < 10; i++){

            for (int j = 1; j < 10; j++){
                temp = i*j;
            }
        }

        System.out.print(temp);

    }
}