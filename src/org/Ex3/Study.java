package org.Ex3;

public class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
   }
class JavaProgram {
    public static void main(String[] args) {
     Study study1 = new Study("Изучение Java - это просто!");
        System.out.println(study1.printCourse());
    }
}