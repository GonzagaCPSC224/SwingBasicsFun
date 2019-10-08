import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private Controller controller;
    protected JTextField usernameTextField;
    protected JPasswordField passwordField;
    protected JButton loginButton;
    protected JLabel statusLabel;

    public View(Controller controller) {
        super("My Login App");
        this.controller = controller;

        setupUI();
    }

    private void setupUI() {
        setVisible(true);
        setPreferredSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel contentPanel = new JPanel(); // light weight container
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        JLabel loginLabel = new JLabel("Login to Continue");
        contentPanel.add(loginLabel);

        usernameTextField = new JTextField();
        contentPanel.add(usernameTextField);

        passwordField = new JPasswordField();
        contentPanel.add(passwordField);

        loginButton = new JButton("Login");
        contentPanel.add(loginButton);

        statusLabel = new JLabel(" ");
        contentPanel.add(statusLabel);

        getContentPane().add(contentPanel);

        pack();
    }

}
