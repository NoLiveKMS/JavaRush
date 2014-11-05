package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String name = null;
    private int age;
    private String sex = null;


    public Friend(String name){
        this.name = name;
    }

    public Friend(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Friend(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}