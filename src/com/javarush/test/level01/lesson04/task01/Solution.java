package com.javarush.test.level01.lesson04.task01;

/**
 * Created by noliv_000 on 05.10.2014.
 */
/* Моя история похожа на твою, только интересней
Напиши программу, которая выводит на экран надпись: «Моя история похожа на твою, только интересней, потому что главный герой — робот.».
*/
public class Solution
{
    public static void main(String[] args)
    {
        String s1 = "Моя история похожа на твою";
        String s2 = "только интересней";
        String s3 = "потому что главный герой — робот.";

        System.out.print(s1+", "+s2+", "+s3);
    }
}