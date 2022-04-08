package org.Ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) throws IOException {
        System.out.println("-----------1-----------");

        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        System.out.println("-----------2-----------");

        double var1 = ( 46 + 10 ) * ( 10d / 3 );
        System.out.println(var1);
        int var2 = ( 29 ) * ( 4 ) * (- 15 );
        System.out.println(var2);

        System.out.println("-----------3-----------");

        int number = 10500;
        double result = (number / 10d) / 10;
        System.out.println(result);

        System.out.println("-----------4-----------");

        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result1 = a*b*c;
        System.out.println(result1);

        System.out.println("-----------5-----------");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(reader.readLine());
        System.out.println(first);
        int second = Integer.parseInt(reader.readLine());
        System.out.println(second);
        int third = Integer.parseInt(reader.readLine());
        System.out.println(third);

        System.out.println("-----------6-----------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int b1 = scanner.nextInt();
        if (b1%2 !=0){
            System.out.println(b1 + " Нечетное число");
        }
        else if (b1 < 100)
        {
            System.out.println(b1 + " Четное число");
        }
        else if (b1 > 100)
        {
            System.out.println("Выход за пределы диапазона");
        }

    }
}
