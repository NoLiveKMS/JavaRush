package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int centerX;
    private int centerY;
    private int radius;
    private int wight;
    private String color;

    public void initialize(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    public void initialize(int centerX, int centerY, int radius, int wight){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wight = wight;
    }
    public void initialize(int centerX, int centerY, int radius, int wight, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.wight = wight;
        this.color = color;
    }

}
