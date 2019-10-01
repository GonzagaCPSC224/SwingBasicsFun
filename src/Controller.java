import javax.swing.*;
import java.awt.*;

public class Controller {
    public static void main(String[] args) {
        // Swing - the Java GUI framework we are gonna use
        // GUI - graphical user interface

        JFrame frame = new JFrame("My GUI Title");
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(400, 400));
        // good to set
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
    }
}
