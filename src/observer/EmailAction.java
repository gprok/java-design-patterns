package observer;

public class EmailAction implements ActListener {
    @Override
    public void act(String data) {
        System.out.println("Sending " + data + " via email");
    }
}
