package ru.geekbrains.java_one.lesson_f.online;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static int divideInts(int a, int b) throws ArithmeticException {
        return a / b;
    }

    private static void method1() throws IOException {
        // do useful things
        throw new IOException("drunk people do things");
        // continue doing useful things
    }

    public static void main(String[] args) {
        InputStream in;
        OutputStream out;

        try {
            FileOutputStream fos = new FileOutputStream("file.txt", true);
//            byte[] b = {'h', 'e', 'l', 'l', 'o', '\n'};
//            byte[] b = "Hello world1!\n".getBytes();
//            fos.write(b);
//            fos.close();

            PrintStream ps = new PrintStream(fos);
            ps.println("Printstreamed string here");

            FileInputStream fis = new FileInputStream("file.txt");
//            int bin;
//            while ((bin = fis.read()) != -1) {
//                System.out.print((char) bin);
//            }
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext())
                System.out.println(scanner.nextLine());

            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    private static void stringBuilderExample() {
        // String
        long startTime = System.nanoTime();
        String s = "Example";
        for (int i = 0; i < 100_000; i++) {
            s += i;
        }
        System.out.println(s);
        float deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.printf("delta time is: %f", deltaTime);

        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder("Example");
        for (int i = 0; i < 100_000; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        deltaTime = (System.nanoTime() - startTime) * 0.000001f;
        System.out.printf("delta time is: %f", deltaTime);

        System.out.println(s.equals(sb.toString()));
    }

    private static void stringEquality() {
        Scanner sc = new Scanner(System.in);
        String s0 = "hello";
        String s1 = new String("hello");
        String s2 = "he";
        String s3 = "llo";
        String s4 = s2 + s3;
        String s5 = sc.next();

        // T = true F = false
        System.out.println(s0.equals(s1));
        System.out.println(s0.equals(s4));
        System.out.println(s0.equals(s5));
    }
}
