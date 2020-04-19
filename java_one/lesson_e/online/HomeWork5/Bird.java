package ru.geekbrains.java_one.lesson_e.online.HomeWork5;

public class Bird extends Animal {

    private int limit = (int)Math.ceil(Math.random() * 5);
    private int highLimit = (int)Math.ceil(Math.random() * 20);

    public Bird(String name, float weight, String color, int age)
    {
        super(name, weight, color, age);
    }


    @Override
    public void run(int distance)
    {
        if (distance <= limit) System.out.println("Птица пробежала: " + distance + "м");
        else System.out.println("Эта птица может пробежать только: " + limit + "м");
    }


    @Override
    public void jump(int hight)
    {
        if (hight <= highLimit) System.out.println("Птица прыгнула: " + hight + "см");
        else System.out.println("Эта птица может прыгать на высоту только: " + highLimit + "см");
    }
}
