package com.javarush.test.level03.lesson06.task03;

/**
 * Created by noliv_000 on 15.10.2014.
 */
/* Семь цветов радуги
Выведи на экран текст - семь цветов радуги.
В каждой строке должно быть по три цвета, в последней - один.
Цвета в строках разделяй пробелом.
Запомни: буквы Ё в тестах нигде нет.
Чтобы тесты проходили правильно, во всех задачах заменяй Ё на Е.
*/

public class Solution
{
    public static void main(String[] args)
    {
        String red = "Красный";
        String orange = "Оранжевый";
        String yellow = "Желтый";
        String green = "Зеленый";
        String light_blue = "Голубой";
        String blue = "Синий";
        String purple = "Фиолетовый";

        System.out.println(red+" "+orange+" "+yellow);
        System.out.println(green+" "+light_blue+" "+blue);
        System.out.println(purple);


    }
}
