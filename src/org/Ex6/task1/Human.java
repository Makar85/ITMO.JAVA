package org.Ex6.task1;

public abstract class Human implements IBankOperational {
    private String name;
    private String lastName;

    public Human(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    abstract void getInfo();
}
