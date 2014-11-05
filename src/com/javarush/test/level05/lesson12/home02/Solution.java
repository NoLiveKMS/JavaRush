package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man man1 = new Man("Вася", 20, "Васька");
        Man man2 = new Man("Толя", 24, "Петроградка");

        Woman woman1 = new Woman("Аня", 20, "Васька");
        Woman woman2 = new Woman("Лиза", 24, "Петроградка");

        System.out.println(man1);
        System.out.println(man2);

        System.out.println(woman1);
        System.out.println(woman2);

    }

    public static class Man{
        String name = null;
        int age;
        String address = null;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }

    public static class Woman{
        String name = null;
        int age;
        String address = null;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }
}
