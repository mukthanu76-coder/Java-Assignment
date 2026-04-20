package Swing_Program;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnIndia, btnSrilanka;
    JLabel label;

    public CountryButtonDemo() {
        // Create Frame
        frame = new JFrame("Button Event Handling");
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Buttons
        btnIndia = new JButton("India");
        btnSrilanka = new JButton("Srilanka");

        // Create Label
        label = new JLabel("Press a button");

        // Add Action Listener
        btnIndia.addActionListener(this);
        btnSrilanka.addActionListener(this);

        // Add components to frame
        frame.add(btnIndia);
        frame.add(btnSrilanka);
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }

    // Event Handling Method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnIndia) {
            label.setText("India is pressed");
        } else if (e.getSource() == btnSrilanka) {
            label.setText("Srilanka is pressed");
        }
    }

    public static void main(String[] args) {
        new CountryButtonDemo();
    }
}