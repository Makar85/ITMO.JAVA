package org.Ex3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class House {
    private int floors;
    private int yearOfBuild;
    private String name;

    public House() {
    }
    // метод для установки всех значений он же конструктор;
    public House(int floors, int yearOfBuild, String name) {
        this.floors = floors;
        this.yearOfBuild = yearOfBuild;
        this.name = name;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public void setYearOfBuild(int yearOfBuild) {
        this.yearOfBuild = yearOfBuild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printInfo()
    //	метод для вывода всех значений;
    {
        System.out.println("Колличество этажей "+ this.floors);
        System.out.println("Год постройки "+ this.yearOfBuild);
        System.out.println("Наименование: " + this.name);
    }
    //	метод, возвращающий количество лет с момента постройки.
    public void howOld (){
        Calendar dateNow = new GregorianCalendar();
        int year = dateNow.getWeekYear();
        int yearOld = this.yearOfBuild;
        System.out.println("Домику под названием " + this.name + " уже: " + (year-yearOld) + " лет");
    }

}
