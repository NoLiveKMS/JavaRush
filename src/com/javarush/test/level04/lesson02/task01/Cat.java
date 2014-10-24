package com.javarush.test.level04.lesson02.task01;

/**
 * Created by noliv_000 on 24.10.2014.
 */
/* Реализовать метод setName
Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной private String name равное переданному параметру String name.
*/

public class Cat {
    private String name;

    public void setName(String name) {
        String s = name;
        setName(name);
    }
}
