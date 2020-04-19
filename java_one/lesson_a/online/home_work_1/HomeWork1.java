package ru.geekbrains.java_one.lesson_a.online.home_work_1;

import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        int a, b, c, d, year;
        String name;


        Scanner in = new Scanner(System.in);
        Scanner n = new Scanner(System.in);
        System.out.println ("Введите 4 любых целых числа: ");
        a = in.nextInt();//считывает первое число и присваивает значение в a
        b = in.nextInt();//считывает второе число и присваивает значение в b
        c = in.nextInt();//считывает третее число и присваивает значение в c
        d = in.nextInt();//считывает третее число и присваивает значение в d

        System.out.println(caclulation(a, b, c, d));
        System.out.println("Проверка сумма a и b лежит а диапазоне от 10 до 20 - " + compare(a, b));
        isPositive(d);
        System.out.println("Введите ваше имя!");
        name = n.nextLine();
        System.out.println(helloName(name));
        System.out.println("Введите год для проверки - 'yyyy'");
        year = in.nextInt();
        isLeap(year);

    }

    public static float caclulation(int a, int b, int c, int d) {
        return a * (b + (1.0f * c / d));
    }

    public static boolean compare(int a, int b) {
        if (((a + b) > 10) && ((a + b) < 20)) return true;
        else return false;
    }

    public static void isPositive(int d) {
        if (d < 0) System.out.println("Число d - отрицательное");
        else System.out.println("Число d - положительное");
    }

    public static String helloName(String name) {

        return "Hello " + name + "!";
    }

    public static void isLeap(int year) {
    if (((year % 4) == 0) || ((year % 400) == 0) && !((year % 100) == 0)) System.out.println("Год " + year + " является високосным!");
     else System.out.println("Год " + year + " не является високосным!");
    }
}


