package org.Ex4;

// соответсвует файлу "4. Задания.docx"

import java.util.Arrays;
import java.util.Scanner;

public class Item2 {
    // 1. Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
    // Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет
    // выводиться текст “Please, try again”
    public void isSorted(int[] array) {
        boolean isSorted = false;
        if (array.length > 2) {
            System.out.println(Arrays.toString(array));
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    System.out.println("Please, try again");
                }
                else {
                    System.out.println("Ok");
                }
            }

        }
    }
    //2.	Напишите программу, которая считывает с клавиатуры длину массива
    // (например, пользователь вводит цифру 4), затем пользователь вводит 4 числа
    // и на новой строке выводится массив из 4 элементов
    public void array2() {
        System.out.println("Введите длину массива");
        Scanner scan = new Scanner(System.in);
        int lengt = scan.nextInt();
        int[] array = new int[lengt];
        System.out.println("Введите четыре числа:");
        array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = scan.nextInt();
        array[3] = scan.nextInt();
        System.out.println("Результат:" + Arrays.toString(array));
    }

        //3.Напишите метод, который меняет местами первый и последний элемент массива.

    public void array3(int[] array) {
        System.out.println(Arrays.toString(array));
        int first = array[0];
        int last = array[array.length-1];
        array[0] = last;
        array[array.length-1] = first;
        System.out.println(Arrays.toString(array));
    }
    //4.	Дан массив чисел. Найдите первое уникальное в этом массиве число.
    //Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
    public void array4(int[] array){
        for (int i = 0; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j <array.length; j++) {
               if (array[i]==array[j] && i!=j){
                   flag=false;
                   break;
               }
            }
            if(flag==true){
                System.out.println(array[i]+" ");
                break;
            }

        }

    }


}






