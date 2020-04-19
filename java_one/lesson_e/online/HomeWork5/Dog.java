package ru.geekbrains.java_one.lesson_e.online.HomeWork5;

public class Dog extends Animal {

    private int limit = (int)Math.ceil(Math.random() * 600);
    private int highLimit = (int)Math.ceil(Math.random() * 50);
    private int maxDistance = (int)Math.ceil(Math.random() * 10);


    public Dog(String name, int weight, String color, int age)
    {
        super(name, weight, color, age);
    }

    @Override
    public void run(int distance)
    {
        if (distance <= limit) System.out.println("Собака пробежала: " + distance + "м");
        else System.out.println("Эта собака может пробежать длину только: " + limit + "м");
    }

    @Override
    public void jump(int hight)
    {
        if (hight <= highLimit) System.out.println("Собака прыгнула: " + hight + "см");
        else System.out.println("Эта собака может прыгать на высоту только: " + highLimit + "см");
    }

    public void swim(int distance)
    {
        if (distance <= maxDistance) System.out.println("Собака проплыла: " + distance + "м");
        else System.out.println("Эта собака может проплыть на дистанцию только: " + maxDistance + "м");
    }


}

