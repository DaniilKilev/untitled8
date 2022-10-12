package Prototype;

public class SomeObj implements Copyable{
    private int id;
    private String name;

    public SomeObj(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public Object copy() {
        return new SomeObj(id,name);
    }

    @Override
    public String toString() {
        return "SomeObj{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
