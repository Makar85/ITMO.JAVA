package org.Ex6.task1;

public class BankEmploee extends Human{
    private String bankName;

    public BankEmploee(String name, String lastName, String bankName) {
        super(name, lastName);
    }

    public String getBankName() {
        return bankName;
    }

    @Override
    void getInfo() {
        System.out.println("Имя: "+ this.getName());
        System.out.println("Фамилия: "+ this.getLastName());
        System.out.println("Название банка: "+ this.getBankName());
    }

    @Override
    public void doBankOperation() {
        System.out.println("Открыл счет клиенту");
    }
}
