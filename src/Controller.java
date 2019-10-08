import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1.
public class Controller implements ActionListener {
    private Model model;
    private View view;

    public Controller(Model model) {
        this.model = model;
        this.view = new View(this);

        // big picture for what we have left to do
        // when the user presses the login button
        // grab the username and password
        // authenticate with the model
        // update the status label

        // 2 ways to implement ActionListener
        // 1. Controller implement ActionListener
        // register this instance of Controller as the callback object
        view.loginButton.addActionListener(this);
        // 2. Define a new class (outer or nested) that implements ActionListener
        // create an object of the class and register

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

}
