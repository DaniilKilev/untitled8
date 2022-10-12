package Adapter;

public class Adapter extends Requester implements GetResponse{
    @Override
    public void getResponse() {
        doRequest();
        System.out.println("and get response");
    }
}
