package ru.geekbrains.java_one.lesson_e.online.HomeWork5;

public class Cat extends Animal {

    private int limit = (int)Math.ceil(Math.random() * 200);
    private int highLimit = (int)Math.ceil(Math.random() * 200);

    public Cat(String name, int weight, String color, int age)
    {
        super(name, weight, color, age);
    }

    @Override
    public void run(int distance)
    {
       if (distance <= limit) System.out.println("Кот пробежал: " + distance + "м");
       else System.out.println("Эта кошка может пробежать только: " + limit + "м");
    }

    @Override
    public void jump(int hight)
    {
        if (hight <= highLimit) System.out.println("Кот прыгнул: " + hight + "см");
        else System.out.println("Эта кошка может прыгать на высоту только: " + highLimit + "см");
    }
}
