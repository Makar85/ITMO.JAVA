package org.Ex6.task3;

import java.util.Scanner;

public class Parent {
    private int someData;

     public void setSomeData() {
         System.out.println("Введите целое число: ");
         Scanner scanData = new Scanner(System.in);
         someData = scanData.nextInt();
     }

    public int getSomeData() {
        return someData;
    }
}
