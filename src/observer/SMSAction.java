package observer;

public class SMSAction implements ActListener {
    @Override
    public void act(String data) {
        System.out.println("Sending SMS with " + data);
    }
}
