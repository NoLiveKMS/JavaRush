package com.javarush.test.level03.lesson06.task01;

/**
 * Created by noliv_000 on 15.10.2014.
 */
/* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/

public class Solution
{
    public static void main(String[] args)
    {
        String mama = "Мама", wash = "Мыла", rama = "Раму";

        System.out.println(mama+wash+rama);
        System.out.println(wash+mama+rama);
        System.out.println(rama+wash+mama);
        System.out.println(mama+rama+wash);
        System.out.println(wash+rama+mama);
        System.out.println(rama+mama+wash);
    }
}
