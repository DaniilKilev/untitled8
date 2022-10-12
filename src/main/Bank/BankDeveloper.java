package main.Bank;

import main.Developer;

public class BankDeveloper implements Developer {
    @Override
    public void doWork() {
        System.out.println("Bank developer writes code");
    }
}
