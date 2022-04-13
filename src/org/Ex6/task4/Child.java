package org.Ex6.task4;

public class Child extends Parent{
    protected String name;

    @Override
    public void setField() {
        System.out.println("Введите имя");
        name = scanner.nextLine();
        if (name !=null){
            System.out.println("Имя записано");
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Имя " + name);
    }
}
