package observer;

public class LogAction implements ActListener {
    @Override
    public void act(String data) {
        System.out.println("Logging " + data);
    }
}
