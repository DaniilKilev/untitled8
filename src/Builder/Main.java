package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new EnterpriceSite());
        Website website = director.buildWebsite();
        System.out.println(website);
    }
}
