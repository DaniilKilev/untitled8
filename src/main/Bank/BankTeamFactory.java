package main.Bank;

import main.Developer;
import main.ProjectManager;
import main.ProjectTeamFactory;
import main.Tester;

public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new BankDeveloper();
    }

    @Override
    public Tester getTester() {
        return new BankTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankPM();
    }
}
