package Prototype;

public class Main {
    public static void main(String[] args) {
        SomeObj someObj = new SomeObj(1,"2");
        System.out.println(someObj);
        ProjectFactory projectFactory = new ProjectFactory(someObj);
        SomeObj someObj1 = projectFactory.cloneProject();
        System.out.println(someObj1);
    }
}
