package org.Ex2;

import java.util.Date;

public class Person {
    private String name;
    private Integer age;
    private Date birthDate;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Person(String name, Integer age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }
}
