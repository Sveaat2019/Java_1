package ru.geekbrains.java_one.lesson_e.online.HomeWork5;

public class Horse extends Animal {

    private int limit = (int)Math.ceil(Math.random() * 1500);
    private int highLimit = (int)Math.ceil(Math.random() * 300);
    private int maxDistance = (int)Math.ceil(Math.random() * 100);

    public Horse(String name, int weight, String color, int age)
    {
        super(name, weight, color, age);
    }

    @Override
    public void run(int distance)
    {
        if (distance <= limit) System.out.println("Лошадь пробежала: " + distance + "м");
        else System.out.println("Эта лошадь может пробежать только: " + limit + "м");
    }

    @Override
    public void jump(int hight)
    {
        if (hight <= highLimit) System.out.println("Лошадь прыгнула: " + hight + "м");
        else System.out.println("Эта лошадь может прыгать на высоту только: " + highLimit + "м");
    }

    public void swim(int distance)
    {
        if (distance <= maxDistance) System.out.println("Лошадь проплыла: " + distance + "м");
        else System.out.println("Эта лошадь может проплыть на дистанцию только: " + maxDistance + "м");
    }

}
