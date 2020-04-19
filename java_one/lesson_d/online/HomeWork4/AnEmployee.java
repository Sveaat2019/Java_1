package ru.geekbrains.java_one.lesson_d.online.HomeWork4;

public class AnEmployee {

    private String name;
    private double salary;
    private int age;
    private int id = 0;
    private static int numberId = 1;

    public AnEmployee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        id = numberId;
        numberId++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge()
    {
        return age;
    }

    public void setBonus()
    {
        if (age > 45) salary += 5000;
    }

    public int getId()
    {
        return id;
    }

}
