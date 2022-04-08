package org.Ex3;

public class Car {
    private String color;
    private String name;
    private Integer weight;
    //Также добавьте несколько конструкторов, которые будут устанавливать:
    //●	только цвет машины;
    //●	цвет и вес машины;
    //●	и пустой конструктор.
    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    //Создайте метод в классе через который можно будет вывести все эти данные
    public void printInfo()
    {
        System.out.println(this.color);
        System.out.println(this.name);
        System.out.println(this.weight);
    }


}
