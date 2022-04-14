package org.Ex9;

import java.util.*;
import java.util.Map;

public class Collections {
    public static void removeDuplicate(List<Integer> list){
        System.out.println("Полученный список: " + list);
        Set<Integer> cleanedList = new HashSet<>();
        cleanedList.addAll(list);
        System.out.println("Возвращённый список: "+cleanedList);
    }

    public static void addMillionItemsToList(List<Integer> list){
        for (int i = 1; i <= 1000000; i++) {
           list.add(i);
        }
        int size= list.size();
        System.out.println("Вполученный список добавленно " + size + " элементов");
    }

    public static void chooseRandomItem100000Times(List<Integer> list){

        long start = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            int a = list.get(random.nextInt(list.size()));
//            System.out.println(a);

        }
        long finish = System.nanoTime();

        long time = finish-start;

        System.out.println("На выполнение данной задачи ушло времени, нс: "+ time);
    };
};









