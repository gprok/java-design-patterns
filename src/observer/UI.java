package observer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class UI extends JFrame {

    private JButton button;
    private JTextField field;

    Vector<ActListener> observers;

    public UI() {
        observers = new Vector<>();
        setSize(200, 200);

        button = new JButton("Act");
        add(button, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (ActListener listener : observers) {
                    listener.act(field.getText());
                }
            }
        });

        field = new JTextField(15);
        add(field, BorderLayout.CENTER);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void addActListener(ActListener listener) {
        observers.add(listener);
    }

    public static void main(String[] args) {
        UI ui = new UI();
        ui.addActListener(new DBAction());
        ui.addActListener(new LogAction());
        ui.addActListener(new EmailAction());
        ui.addActListener(new SMSAction());
    }
}
