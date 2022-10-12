package SingleTon;

import main.ProjectManager;

public class Project {
    private static Project project;

    private Project(){}

    static Project getProject(){
        if(project == null)
            project = new Project();
        return project;
    }
}
