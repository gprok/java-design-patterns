package observer;

public class DBAction implements ActListener {
    @Override
    public void act(String data) {
        System.out.println("Saving " + data + " into NoSQL Database");
    }
}
