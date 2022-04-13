package org.Ex6.task4;

import java.util.Scanner;

public class Parent {
    protected int age;
    Scanner scanner = new Scanner(System.in);
    public void setField() {

        System.out.println("Введите возраст");
        age = scanner.nextInt();
        if (age !=0){
            System.out.println("Возраст записан");
        }
    }

        public void getInfo() {
        System.out.println("Возраст " + age + " лет");
    }





}
