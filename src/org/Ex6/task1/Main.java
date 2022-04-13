package org.Ex6.task1;

public class Main {
    public static void main(String[] args) {
        BankEmploee employee1 = new BankEmploee("Employee1 Name", "Employee1 LastName", "Employee Bank Name");
        Client client1 = new Client ("Client1 Name", "Client1 LastName", "Client Bank Name");
        employee1.getInfo();
        employee1.doBankOperation();
        client1.getInfo();
        client1.doBankOperation();


    }
}
