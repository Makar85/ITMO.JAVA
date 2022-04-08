package org.Ex3;

public class Tree {
    private int years;
    private String lifeOrDie;
    private String name;
   //	Конструктор, который устанавливает только возраст и название;
    public Tree(int years, String name) {
        this.years = years;
        this.name = name;
    }
   // Конструктор, который устанавливает все переменные в классе;

    public Tree(int years, String lifeOrDie, String name) {
        this.years = years;
        this.lifeOrDie = lifeOrDie;
        this.name = name;
    }
    //Конструктор, который ничего не устанавливает, но выводит сообщение

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
    public void printInfo(){
        if(this.years != 0 && this.name != null && this.lifeOrDie != null ) {
            System.out.println("Дереву " + this.years + "Лет");
            System.out.println("Название: " + this.name);
            System.out.println("Cocтояние: " + this.lifeOrDie);
        }
        else if (this.years != 0 && this.name != null && this.lifeOrDie == null){
            System.out.println("Дереву " + this.years + "Лет");
            System.out.println("Название: " + this.name);
        }
        else if (this.years == 0 && this.name == null && this.lifeOrDie == null);


    }

}
