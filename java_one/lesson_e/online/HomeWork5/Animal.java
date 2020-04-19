package ru.geekbrains.java_one.lesson_e.online.HomeWork5;

public class Animal {
    private String name;
    private float weight;
    private String color;
    private int age;

    protected Animal(String name, float weight, String color, int age)
    {
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.age = age;
    }

    protected Animal() {}

    public void setName(String name)
    {
        this.name = name;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    protected String getName()
    {
        return name;
    }

    protected float getWeight()
    {
        return weight;
    }

    protected String getColor()
    {
        return color;
    }

    protected int getAge()
    {
        return age;
    }

    protected void run(int distance)
    {
        System.out.println("Дистанция бега животного составляет: " + distance);
        //System.out.println("Бег на дистанцию : " + 5 + "м");
    }

    protected void jump(int hight)
    {
        System.out.println("Высота прыжка животного составляет: " + hight);
    }

}
