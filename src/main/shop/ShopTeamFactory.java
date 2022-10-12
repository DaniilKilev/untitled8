package main.shop;

import main.Developer;
import main.ProjectManager;
import main.ProjectTeamFactory;
import main.Tester;

public class ShopTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new ShopDev();
    }

    @Override
    public Tester getTester() {
        return new ShopTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ShopPM();
    }
}
