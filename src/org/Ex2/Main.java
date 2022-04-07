package org.Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Calculator calculator = new Calculator();
        System.out.println("Введите первое число");
        Scanner scanNum1 = new Scanner(System.in);

        //проверка ввода данных первого числа
        if(scanNum1.hasNextInt())
        {
            calculator.intNum1 = scanNum1.nextInt();
        }
        else if (scanNum1.hasNextDouble())
        {
            calculator.doubleNum1 = scanNum1.nextDouble();
        }
        else if (scanNum1.hasNextLong())
        {
            calculator.longNum1 = scanNum1.nextLong();
        }

        //проверка ввода данных второго числа
        System.out.println("Введите второе число");
        Scanner scanNum2 = new Scanner(System.in);
        if(scanNum2.hasNextInt())
        {
            calculator.intNum2 = scanNum2.nextInt();
        }
        else if (scanNum2.hasNextDouble())
        {
            calculator.doubleNum2 = scanNum2.nextDouble();
        }
        else if (scanNum2.hasNextLong())
        {
            calculator.longNum2 = scanNum2.nextLong();
        }
        System.out.println("Выберете действие");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");

        Scanner scanAction = new Scanner(System.in);
        int doAction = scanAction.nextInt();
        //сложение ---------------------------------------
        if (doAction ==1)
          if(calculator.intNum1 !=0 && calculator.intNum2 !=0)
          {
              calculator.sum(calculator.intNum1, calculator.intNum2);
          }
         else if(calculator.doubleNum1 !=0 && calculator.doubleNum2 !=0)
        {
            calculator.sum(calculator.doubleNum1, calculator.doubleNum2);
        }
          else if(calculator.longNum1 !=0 && calculator.longNum2 !=0)
          {
              calculator.sum(calculator.longNum1, calculator.longNum2);
          }
        //вычитание---------------------------------------
          if (doAction ==2)
            if(calculator.intNum1 !=0 && calculator.intNum2 !=0)
            {
                calculator.minus(calculator.intNum1, calculator.intNum2);
            }
            else if(calculator.doubleNum1 !=0 && calculator.doubleNum2 !=0)
            {
                calculator.minus(calculator.doubleNum1, calculator.doubleNum2);
            }
            else if(calculator.longNum1 !=0 && calculator.longNum2 !=0)
            {
                calculator.minus(calculator.longNum1, calculator.longNum2);
            }
        // умножение --------------------------
          if (doAction ==3)
            if(calculator.intNum1 !=0 && calculator.intNum2 !=0)
            {
                calculator.mult(calculator.intNum1, calculator.intNum2);
            }
            else if(calculator.doubleNum1 !=0 && calculator.doubleNum2 !=0)
            {
                calculator.mult(calculator.doubleNum1, calculator.doubleNum2);
            }
            else if(calculator.longNum1 !=0 && calculator.longNum2 !=0)
            {
                calculator.mult(calculator.longNum1, calculator.longNum2);
            }
        // Деление --------------------------
        if (doAction ==4)
            if(calculator.intNum1 !=0 && calculator.intNum2 !=0)
            {
                calculator.split(calculator.intNum1, calculator.intNum2);
            }
            else if(calculator.doubleNum1 !=0 && calculator.doubleNum2 !=0)
            {
                calculator.split(calculator.doubleNum1, calculator.doubleNum2);
            }
            else if(calculator.longNum1 !=0 && calculator.longNum2 !=0)
            {
                calculator.split(calculator.longNum1, calculator.longNum2);
            }


    }
}
