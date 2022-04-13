package org.Ex6.task1;

public class Client extends Human {

    private String bankName;

    public Client(String name, String lastName, String bankName) {
        super(name, lastName);
        this.bankName = bankName;
    }

    public String getBankName() {
         return bankName;
    }

    @Override
    void getInfo() {
        System.out.println("Имя: "+ this.getName());
        System.out.println("Фамилия: "+ this.getLastName());
        System.out.println("Название банка: " + this.getBankName());
    }

    @Override
    public void doBankOperation() {
        System.out.println("Сделал запрос на открытие счета");
    }
}
