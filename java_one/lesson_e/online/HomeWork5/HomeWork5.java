package ru.geekbrains.java_one.lesson_e.online.HomeWork5;

public class HomeWork5 {

    public static void main(String[] args) {




        Bird bird = new Bird("Кеша", 0.08f, "зеленый", 1);

        Horse horse = new Horse("Мона", 150, "коричневая", 3);

        Dog dog = new Dog ("Норд", 8, "черный", 2);

        Cat cat = new Cat("Маруся", 6, "черепаховый окрас", 14);
        Cat [] cats = {cat,
               new Cat ("Мотя", 5, "черный", 4),
                new Cat ("Васька", 6, "рыжий", 5),
                new Cat("Афоня", 4, "серо-пепельный", 2),
                new Cat("Мурка", 3, "белый", 3),
                new Cat("Борис", 2, "серо-бело-черный", 1)
                     };

        Animal [] animal = {bird, horse, dog, cat};

        for (int i = 0; i < animal.length; i++)
        {
            System.out.println(animal[i].getName());
            animal[i].jump(3);

            if (animal[i] instanceof Dog)
            {
                System.out.println(animal[i].getName());
                ((Dog) animal[i]).swim(5);
            }

            if   (animal[i] instanceof Horse)
            {
                System.out.println(animal[i].getName());
                ((Horse) animal[i]).swim(50);
            }


        }


        System.out.println("-------------------------Массив кошек с установкой 120м-----------------------------\n");



        for (int i = 0; i < cats.length; i++)
        {
            System.out.println(cats[i].getName());
            cats[i].run(120);
            System.out.println("\n");
        }




    }
}
