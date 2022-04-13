package org.Ex4;
import java.util.Arrays;
import java.util.Scanner;
// соответсвует файлу "2. Задания 1.docx"
public class Item1 {
    //Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
    // Каждое число печается с новой стороки.
    public void GetDigits1(){
      for (int i=1; i < 100; i++) {
          if (i%2 !=0)
              System.out.println(i);
          }
    }
    //Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на
    // то и другое (то есть и на 3 и на 5)
    public void GetDigits2(){
        for (int i=1; i < 100; i++) {
            if (i%3 ==0 && i%5 !=0)
                System.out.println("Число " + i + " делится на 3");
            else if (i%5 == 0 && i%3 !=0)
                System.out.println("Число " + i + " делится на 5");
            else if (i%3 == 0 && i%5 == 0)
                System.out.println("Число " + i + " делится на 3 и на 5");
        }
    }
    //Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
    // если сумма равна третьему целому числу
    public void GetDigits3(){
        System.out.println("Данная программа  просит ввести 3 числа и возвращает true, " +
                "если:  сумма равна третьему целому числу ");
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Boolean boolResult = false;

        Scanner scanNum1 = new Scanner(System.in);
        Scanner scanNum2 = new Scanner(System.in);
        Scanner scanNum3 = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = scanNum1.nextInt();
        System.out.println("Введите второе число число: ");
        num2 = scanNum2.nextInt();
        System.out.println("Введите третье число число: ");
        num3 = scanNum3.nextInt();

        if (num3 == num1+num2){
            boolResult = true;
            System.out.println("Результат: " + boolResult);
        }
        else
            System.out.println("Результат: " + boolResult);
    }

    //Напишите программу, которая принимает от пользователя три целых числа и возвращает true,
    // если второе число больше первого числа, а третье число больше второго числа.

    public void GetDigits4(){
        System.out.println("Данная программа просит ввести 3 числа и возвращает true, " +
                "если: второе число больше первого числа, а третье число больше второго числа ");
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        Boolean boolResult = false;

        Scanner scanNum1 = new Scanner(System.in);
        Scanner scanNum2 = new Scanner(System.in);
        Scanner scanNum3 = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        num1 = scanNum1.nextInt();
        System.out.println("Введите второе число число: ");
        num2 = scanNum2.nextInt();
        System.out.println("Введите третье число число: ");
        num3 = scanNum3.nextInt();

        if (num2>num1 && num3>num2){
            boolResult = true;
            System.out.println("Результат: " + boolResult);
        }
        else
            System.out.println("Результат: " + boolResult);
    }

    //Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
    // Длина массива должна быть больше или равна двум

    public void arrays1(int[] array1){

      Boolean arrayHasFirst3 = false;



        if (array1.length >=2){
            if (array1[0]==3 || array1[array1.length-1]==3) {
                arrayHasFirst3=true;
                System.out.print(arrayHasFirst3);
            }
            else
                System.out.print(arrayHasFirst3);

        }
    }

    //Напишите программу, чтобы проверить, что массив содержит число 1 или 3
    public void arrays2() {

        int[] array2 = new int[]{18, 7, 11, 3, 15, 3, 9, 1, 17};

        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array2.length; i++) {
                if (array2[i] == 1 || array2[i] == 3) {

                    System.out.println("Массив содержит число: " + array2[i] + " под индексом: " + i);
                }
            }
        }
}
