package org.Ex2;

 public class Calculator {
    int intNum1;
    int intNum2;

    double doubleNum1;
    double doubleNum2;

    long longNum1;
    long longNum2;

    //сумма
    public void sum(int intNum1, int intNum2){
    int intResult = intNum1+intNum2;
    System.out.println(intResult);
    }
    public void sum(double doubleNum1, double doubleNum2){
        double doubleResult = doubleNum1+doubleNum2;
        String lResult = String.format("%.2f", doubleResult);
        System.out.println(lResult);
    }
    public void sum(long longNum1, long longNum2){
        double longResult = longNum1+longNum2;
        System.out.println(longResult);
    }

    //вычитание
    public void minus(int intNum1, int intNum2){
        int intResult = intNum1-intNum2;
        System.out.println(intResult);
    }
    public void minus(double doubleNum1, double doubleNum2){
        double doubleResult = doubleNum1-doubleNum2;
        String lResult = String.format("%.2f", doubleResult);
        System.out.println(lResult);
    }
    public void minus(long longNum1, long longNum2){
        double longResult = longNum1-longNum2;
        System.out.println(longResult);
    }

    //умножение
    public void mult(int intNum1, int intNum2)
    {
        int intResult = intNum1*intNum2;
        System.out.println(intResult);
    }
    public void mult(double doubleNum1, double doubleNum2){
        double doubleResult = doubleNum1*doubleNum2;
        String lResult = String.format("%.2f", doubleResult);
        System.out.println(lResult);
    }
    public void mult(long longNum1, long longNum2){
        double longResult = longNum1*longNum2;
        System.out.println(longResult);
    }

    //деление
    public void split(int intNum1, int intNum2){
        int intResult = intNum1/intNum2;
        System.out.println(intResult);
    }
    public void split(double doubleNum1, double doubleNum2){
        double doubleResult = doubleNum1/doubleNum2;
        String lResult = String.format("%.2f", doubleResult);
        System.out.println(lResult);
    }
    public void split(long longNum1, long longNum2){
        double longResult = longNum1/longNum2;
        System.out.println(longResult);
    }


}
