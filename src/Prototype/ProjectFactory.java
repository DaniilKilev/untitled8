package Prototype;

import SingleTon.Project;

public class ProjectFactory {
    SomeObj someObj;

    public ProjectFactory(SomeObj someObj) {
        this.someObj = someObj;
    }

    public void setProject(SomeObj someObj) {
        this.someObj = someObj;
    }
    SomeObj cloneProject(){
        return (SomeObj) someObj.copy();
    }
}
