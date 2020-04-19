package ru.geekbrains.java_one.lesson_b.online.HomeWork2;

import java.util.Arrays;

public class HomeWork2 {


    public static void main(String[] args) {


        int [] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        reverse(arr1); // вызов первого метода



        int [] arr2 = new int[8];

        fill(arr2);  // вызов второго метода



        int [] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        multiplier(arr3);  // вызов третьего метода



        int [] arr4 = new int[21];   // создаем одномерные массив интов и заполняем его случайными числами
        for (int i = 0; i < arr4.length; i ++) {
            arr4 [i] = (int) Math.ceil(Math.random() * 100);
            System.out.print("  " + arr4[i]);
        }
            System.out.println();

        min(arr4);             // Вызов 4 метода состоящего из 2. Это минимум
        max(arr4);             //  Это максимум




        int [] [] arr5 = new int[10] [10];

        unitMatrix(arr5);                     // Вызов пятого метода



        int [] array = {10, 3, 2, 7, 4};
        System.out.println("В массиве есть место где сумма левой и правой частей равны? " + sort(array));   // Вызов шестого метода




       System.out.print(Arrays.toString(shift_array(arr4, 3)));    // Вызов седьмого метода


        }

        
// ---------------Первый метод--------------------------
            public static void reverse(int [] arr1) {


                int[] temp = new int[arr1.length];

                for (int i = 0; i < arr1.length; i++) {
                    if ((arr1[i] == 1)) {
                        temp[i] = 0;
                    } else {
                        temp[i] = 1;
                    }
                    System.out.print("\t" + temp[i]);
                }
                    System.out.println();
            }


    // ---------------Второй метод--------------------------

            public static void fill(int [] arr2) {
                int bias = 3;
                for (int i = 0; i < arr2.length; i ++) {
                    arr2[0] = 1;
                    if (i > 0) arr2[i] = arr2[i - 1] + bias;
                    System.out.print("\t" + arr2[i]);
                }
                    System.out.println();
            }

    // ---------------Третий метод--------------------------

            public static void multiplier(int [] arr3) {
                for (int i = 0; i < arr3.length; i ++) {
                    if (arr3[i] < 6)  arr3[i] *= 2;
                    System.out.print("\t" + arr3 [i]);
                }
                    System.out.println();
            }

    // ---------------Чертвертый метод (min + max)--------------------------

            public static void min(int [] arr4)  {
            int temp = arr4[0];
            for (int i = 0; i < arr4.length; i ++) {
                if(arr4[i] < temp) temp = arr4[i];

            }
                System.out.println("Минимальное значение в массиве arr4 - " + temp);
                System.out.println();
            }

            public static void max(int [] arr4)  {
                int temp = arr4[0];
                for (int i = 0; i < arr4.length; i ++) {
                    if(arr4[i] > temp) temp = arr4[i];

                }
                System.out.println("Минимальное значение в массиве arr4 - " + temp);
                System.out.println();
            }

    // ---------------Пятый метод--------------------------

                private static void unitMatrix(int [][] arr5) {
                for (int i = 0, j = 0; i < arr5.length; i ++, j ++) {
                    arr5[i][j] = 1;
                    // Заполнили, а теперь выводим
                    for (int k = 0; k < arr5[0].length; k ++) {
                        System.out.print("\t" + arr5[i][k]);
                    }
                        System.out.println();
                }

                }

    // ---------------Шестой метод--------------------------

                private static boolean sort(int [] arr) {
                int sum = 0;
                int temp = 0;
                int dev = 0;
                                                    // 10, || 1, 2, 3, 4
                for (int i = 0; i < arr.length; i ++) {sum += arr[i]; }
                if (sum % 2 == 0) {
                    dev = sum / 2;
                    for (int j = 0; j < arr.length; j++) {
                        if (temp == dev) return true;
                        temp += arr[j];
                    }
                    return false;
                }
                return false;
               }

    // ---------------Седьмой метод--------------------------


                public static int gcd(int a, int b) {
                    while(b != 0) {
                        int c = a;
                        a = b;
                        b = c % a;
                    }
                    return a;
                }

                public static int [] shift_array(int[] A, int n) {
                    int N = A.length;
                    n %= N;
                    if(n < 0)
                        n = N + n;
                    int d = gcd(N, n);
                    for(int i = 0; i < d; i++) {
                        int temp = A[i];
                        for(int j = i - n + N; j != i; j = (j - n + N) % N)
                            A[(j + n) % N] = A[j];
                        A[i + n] = temp;
                    }   return A;
                }


}
