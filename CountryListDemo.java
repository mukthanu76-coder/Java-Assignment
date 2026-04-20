package Swingprogram;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // List of countries
        String countries[] = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Set selection mode (single selection)
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add ListSelectionListener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = list.getSelectedValue();
                    System.out.println("Selected Country: " + selectedCountry);
                }
            }
        });

        // Add JList to ScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        // Add to frame
        frame.add(scrollPane, BorderLayout.CENTER);

        // Display frame
        frame.setVisible(true);
    }
}