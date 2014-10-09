package com.javarush.test.level03.lesson04.task02;

/**
 * Created by noliv_000 on 09.10.2014.
 */
/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
*/

public class Solution
{
    public static void main(String[] args)
    {
        String name = "Максим";

        for (int i = 0; i<5; i++){
            System.out.println(enterName(name));
        }

    }
    
    public static String enterName (String s){
        for (int i = 0; i<10; i++){
            System.out.print(s+" ");
        }
        return s;
    }
}
