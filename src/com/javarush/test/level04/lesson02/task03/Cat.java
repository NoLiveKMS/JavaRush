package com.javarush.test.level04.lesson02.task03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by noliv_000 on 24.10.2014.
 */
/* Реализовать метод setCatsCount
Реализовать метод setCatsCount так, чтобы с его помощью можно было устанавливать значение переменной catsCount равное переданному параметру.
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s =reader.readLine();
        catsCount = Integer.parseInt(s);
    }
}