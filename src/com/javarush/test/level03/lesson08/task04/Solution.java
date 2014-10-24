package com.javarush.test.level03.lesson08.task04;

/**
 * Created by noliv_000 on 16.10.2014.
 */
/* Спонсор - это звучит гордо
Ввести с клавиатуры два имени и вывести надпись:
name1 проспонсировал name2, и она стала известной певицей.
Пример:
Коля проспонсировал Лену, и она стала известной певицей.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String name2 = reader.readLine();


        System.out.println(name + " проспонсировал " + name2 + ", и она стала известной певицей.");

    }
}
