package ru.geekbrains.java_one.lesson_d.online.HomeWork4;

public class HomeWork4 {
    public static void main(String[] args) {

         double result_1 = 0;
         int result_2 = 0;

        AnEmployee [] people = new AnEmployee[5];
          people[0] = new AnEmployee ("Иванов Иван Иванович", 30_000, 30 );
          people[1] = new AnEmployee("Смирнов Петр Анатольевич", 28_000, 28);
          people[2] = new AnEmployee("Пугачева Алла Степановна", 77_000, 70);
          people[3] = new AnEmployee("Антонов Антон Антонович", 22_000, 19);
          people[4] = new AnEmployee("Васильев Василий Васильевич", 38_000, 47);

          for (int i = 0; i < people.length; i++)
          {
              System.out.printf("ФИО сотрудника: %s\t возраст: %d\n", people[i].getName(), people[i].getAge());
          }

          System.out.println("\n-------------------Сотрудники старше 40-----------------------\n");

          for (int i = 0; i < people.length; i++)
          {
              if (people[i].getAge() > 40)
                  System.out.printf("ФИО сотрудника: %s\t возраст: %d \nзарплата: %.2f\n", people[i].getName(), people[i].getAge(), people[i].getSalary());
          }

          System.out.println("\n-----------------Повышение зарплаты сотрудникам старше 45----------------------\n");

          for (int i = 0; i < people.length; i++)
          {
              people[i].setBonus();
              System.out.printf("ФИО сотрудника: %s\t возраст: %d \nзарплата: %.2f\n", people[i].getName(), people[i].getAge(), people[i].getSalary());
              result_1 += (people[i].getSalary() / people.length);
              result_2 += (people[i].getAge() / people.length);
          }
            System.out.println("\nСреднее арифметическое всех зарплат составляет:  " + result_1 +
                    "\nСреднее арифметическое всех возрастов составляет:   " + result_2);

            System.out.println("\nПолучаем номера ID из массива сотрудников №5, №3 и №1: \n" + people[4].getId() + " " + people[2].getId() + " " + people[0].getId());
    }

}


