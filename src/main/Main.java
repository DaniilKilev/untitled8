package main;

import main.Bank.BankTeamFactory;
import main.shop.ShopTeamFactory;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        ProjectManager manager = factory.getProjectManager();

        developer.doWork();
        tester.testCode();
        manager.manageCode();
        new HashMap<String,String>();
    }
}
